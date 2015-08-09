package org.shaolin.vogerp.commonmodel.internal;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.shaolin.bmdp.datamodel.common.TargetEntityType;
import org.shaolin.bmdp.datamodel.pagediagram.PageNodeType;
import org.shaolin.bmdp.datamodel.pagediagram.WebChunk;
import org.shaolin.bmdp.runtime.AppContext;
import org.shaolin.bmdp.runtime.cache.CacheManager;
import org.shaolin.bmdp.runtime.cache.ICache;
import org.shaolin.bmdp.runtime.spi.IServiceProvider;
import org.shaolin.javacc.exception.ParsingException;
import org.shaolin.uimaster.page.cache.UIFlowCacheManager;
import org.shaolin.vogerp.commonmodel.be.ModuleGroupImpl;
import org.shaolin.vogerp.commonmodel.dao.ModularityModel;

public class ModuleServiceImpl implements IServiceProvider {

	private final ICache<String, Long> modules;
	
	public ModuleServiceImpl() {
		modules = CacheManager.getInstance().getCache(AppContext.get().getAppName() 
				+ "_modules_cache", String.class, Long.class);
		init();
	}
	
	private void init() {
		ModuleGroupImpl condition = new ModuleGroupImpl();
		condition.setEnabled(true);
        List<ModuleGroupImpl> all = ModularityModel.INSTANCE.searchModuleGroup(condition, null, 0, -1);
        for (ModuleGroupImpl module: all) {
        	String accessURL = module.getAccessURL();
        	if (accessURL != null && !"#".equals(accessURL)) {
            	int chunkNameIndex = accessURL.indexOf("_chunkname=");
            	int _nodenameIndex = accessURL.indexOf("_nodename=");
            	int _framenameIndex = accessURL.indexOf("_framename=");
            	if (chunkNameIndex != -1) {
	            	String path = accessURL.substring(chunkNameIndex + "_chunkname=".length(), _nodenameIndex - 1);
	            	path += "." + accessURL.substring(_nodenameIndex + "_nodename=".length(), _framenameIndex -1);
	            	modules.put(path, module.getGroupId());
            	}
        	}
        }
        
        try {
			updateWebFlowLinks(all);
		} catch (ParsingException e) {
			Logger.getLogger(ModuleServiceImpl.class).error("Failed to sync all modules links: " + e.getMessage(), e);
		}
	}
	
	public void reload() {
		modules.clear();
		init();
	}
	
	public long getModuleId(String chunkName, String nodeName) {
		String path = chunkName + "." + nodeName;
		if (modules.containsKey(path)) {
			return modules.get(path);
		}
		return -1;
	}
	
	@Override
	public Class<?> getServiceInterface() {
		return ModuleServiceImpl.class;
	}
	
	static void updateWebFlowLinks() throws ParsingException {
		ModuleGroupImpl condition = new ModuleGroupImpl();
        List<ModuleGroupImpl> all = ModularityModel.INSTANCE.searchModuleGroup(condition, null, 0, -1);
        updateWebFlowLinks(all);
	}
	
	static void updateWebFlowLinks(List<ModuleGroupImpl> all) throws ParsingException {
        // find AppContext.get().getAppName()
        ModuleGroupImpl root = null;
        for (int i=0;i<all.size();i++) {
        	ModuleGroupImpl mg = (ModuleGroupImpl)all.get(i);
        	if (mg.getName().equals(AppContext.get().getAppName())) {
        		root = mg;
        	    break;
        	}
        }
        if (root == null) {
        	return; // no root being configured!
        }
        
		// list the nodes under the root node.
        List<PageNodeType> webNodes = new ArrayList<PageNodeType>();
        for (int i=0;i<all.size();i++) {
            ModuleGroupImpl mg = (ModuleGroupImpl)all.get(i);
            if (mg.getParentId() != root.getGroupId()) {
            	continue;
            }
            // webflow.do?_chunkname=org.shaolin.bmdp.adminconsole.diagram.MainFunctions&_nodename=ModuleManager&_framename=moduleManager&_framePrefix=
            String accessURL = mg.getAccessURL();
			if (accessURL != null && !"#".equals(accessURL)) {
            	int chunkNameIndex = accessURL.indexOf("_chunkname=");
            	int _nodenameIndex = accessURL.indexOf("_nodename=");
            	int _pageIndex = accessURL.indexOf("_page=");
            	int _framenameIndex = accessURL.indexOf("_framename=");
            	if (chunkNameIndex != -1) {
            		/**
            		 * <ns2:webNode xsi:type="ns2:PageNodeType" name="ModuleManager">
					    <ns2:sourceEntity entityName="org.shaolin.vogerp.commonmodel.page.ModuleManagement"></ns2:sourceEntity>
					  </ns2:webNode>
            		 */
            		PageNodeType webNode = new PageNodeType();
            		webNode.setName(accessURL.substring(_nodenameIndex + "_nodename=".length(), _pageIndex -1));
            		TargetEntityType tarEntityName = new TargetEntityType();
            		tarEntityName.setEntityName(accessURL.substring(_pageIndex + "_page=".length(), _framenameIndex - 1));
            		webNode.setSourceEntity(tarEntityName);
            		webNodes.add(webNode);
            	}
            }
            // find children
            for (int j=0;j<all.size();j++) {
            	if (mg.getGroupId() == ((ModuleGroupImpl)all.get(j)).getParentId()) {
            		ModuleGroupImpl m = (ModuleGroupImpl)all.get(j);
            		accessURL = m.getAccessURL();
        			if (accessURL != null && !"#".equals(accessURL)) {
                    	int chunkNameIndex = accessURL.indexOf("_chunkname=");
                    	int _nodenameIndex = accessURL.indexOf("_nodename=");
                    	int _pageIndex = accessURL.indexOf("_page=");
                    	int _framenameIndex = accessURL.indexOf("_framename=");
                    	if (chunkNameIndex != -1) {
                    		PageNodeType webNode = new PageNodeType();
                    		webNode.setName(accessURL.substring(_nodenameIndex + "_nodename=".length(), _pageIndex -1));
                    		TargetEntityType tarEntityName = new TargetEntityType();
                    		tarEntityName.setEntityName(accessURL.substring(_pageIndex + "_page=".length(), _framenameIndex - 1));
                    		webNode.setSourceEntity(tarEntityName);
                    		webNodes.add(webNode);
                    	}
                    }
            	}
            }
        }
        
        String webFlowEntity = "org.shaolin.vogerp.commonmodel.diagram.ModularityModel";
		WebChunk chunk = new WebChunk();
		chunk.setEntityName(webFlowEntity);
        chunk.getWebNodes().addAll(webNodes);
        
        AppContext.get().getEntityManager().appendEntity(chunk);
        
        UIFlowCacheManager.addFlowCacheIfAbsent(AppContext.get().getAppName());
		UIFlowCacheManager.getInstance().removeAppChunk(webFlowEntity);
		UIFlowCacheManager.getInstance().addChunk(chunk, AppContext.get().getAppName());
	}

}
