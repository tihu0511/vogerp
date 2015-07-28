package org.shaolin.vogerp.commonmodel.internal;

import java.util.List;

import org.shaolin.bmdp.runtime.AppContext;
import org.shaolin.bmdp.runtime.ce.AbstractConstant;
import org.shaolin.bmdp.runtime.ce.ConstantServiceImpl;
import org.shaolin.bmdp.runtime.spi.IAppServiceManager;
import org.shaolin.bmdp.runtime.spi.ILifeCycleProvider;
import org.shaolin.bmdp.runtime.spi.IServerServiceManager;
import org.shaolin.uimaster.page.UIPermissionManager;
import org.shaolin.vogerp.commonmodel.be.CEEntityInfoImpl;
import org.shaolin.vogerp.commonmodel.be.CEExtensionImpl;
import org.shaolin.vogerp.commonmodel.dao.ModularityModel;
import org.shaolin.vogerp.commonmodel.util.CEOperationUtil;

public class LifeServiceProviderImpl implements ILifeCycleProvider {
	
	@Override
	public void startService() {
		IAppServiceManager serviceManger = AppContext.get();
		if (AppContext.isMasterNode()) {
			try {
				List<CEExtensionImpl> ceItems = ModularityModel.INSTANCE.searchCEExtension(
						new CEExtensionImpl(), null, 0, -1);
				((ConstantServiceImpl) IServerServiceManager.INSTANCE.getConstantService())
						.importData(CEOperationUtil.convertC2D(ceItems));
			} catch (Exception e) {
				throw new IllegalStateException("Failed to parse CE items: " + e.getMessage(), e);
			}
			List<CEEntityInfoImpl> ceInfos = ModularityModel.INSTANCE.searchCEInfo(null, null, 0, -1);
			for (CEEntityInfoImpl ceInfo : ceInfos) {
				AbstractConstant ce = (AbstractConstant)IServerServiceManager.INSTANCE.getConstantService().
						getConstantEntity(ceInfo.getCeName());
				ce.setEntityInfo(ceInfo.getDescription(), ceInfo.getI18nKey(), ceInfo.getIcon());
			}
		}
		
		UserServiceImpl userService = new UserServiceImpl();
		userService.init();
		serviceManger.register(userService);
		
		PermissionServiceImpl permissionService = new PermissionServiceImpl(new ModuleServiceImpl());
		serviceManger.register(permissionService);
		
		UIPermissionManager uiPermiManager = new UIPermissionManager(permissionService);
		serviceManger.register(uiPermiManager);
		
		DynamicUIServiceImpl dynamicUIService = new DynamicUIServiceImpl();
		serviceManger.register(dynamicUIService);
	}
	
	@Override
	public void reload() {
		
	}

	@Override
	public boolean readyToStop() {
		return true;
	}

	@Override
	public void stopService() {
	}

	@Override
	public int getRunLevel() {
		return 0;
	}
	

}