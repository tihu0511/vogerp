/*
 *
 * This file is automatically generated on Thu Jul 23 13:15:09 CST 2015
 */

    
package org.shaolin.vogerp.commonmodel.be;
        
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import org.shaolin.bmdp.datamodel.bediagram.*;
import org.shaolin.bmdp.datamodel.common.*;
import org.shaolin.bmdp.runtime.be.IBusinessEntity;
import org.shaolin.bmdp.runtime.be.IExtensibleEntity;
import org.shaolin.bmdp.runtime.be.IPersistentEntity;
import org.shaolin.bmdp.runtime.be.IHistoryEntity;
import org.shaolin.bmdp.runtime.be.BEExtensionInfo;

import org.shaolin.bmdp.runtime.spi.IConstantService;

import org.shaolin.bmdp.runtime.AppContext;

import org.shaolin.bmdp.runtime.ce.CEUtil;



/**
 * null
 * 
 * This code is generated automatically, any change will be replaced after rebuild.
 * 
 *
 */

public class OrganizationImpl 
    extends PartyImpl
         implements org.shaolin.vogerp.commonmodel.be.IOrganization
{
    private static final long serialVersionUID = 0x90B1123CE87B50FFL;

    private final IConstantService ceService = AppContext.get().getConstantService();

    protected String getBusinessEntityName()
    {
        return "org.shaolin.vogerp.commonmodel.be.Organization";
    }

    public OrganizationImpl()
    {
        
        _extField = new BEExtensionInfo();
        
    }
    
    
        /**
     * Enable record
     */
    private boolean _enable = true;


    /**
     *  BEExtension _extType
     */
    protected String _extType;

    /**
     *  BEExtension _extField
     */
    protected BEExtensionInfo _extField;
        
   /**
     *  help is not available
     */    
    protected long parentId;
    
   /**
     *  help is not available
     */    
    protected java.lang.String orgCode;
    
   /**
     *  help is not available
     */    
    protected java.lang.String name;
    
   /**
     *  help is not available
     */    
    protected java.lang.String description;
    
        /**
     *  Is enable
     *
     *  @return boolean
     */
    public boolean isEnabled() {
        return _enable;
    }
            /**
     *  Is enable
     *
     *  @return boolean
     */
    private boolean get_enable() {
        return _enable;
    }
        
    /**
     *  get _extType
     *
     *  @return _extType
     */
    public String get_extType() {
        return _extType;
    }

    /**
     *  get _extField
     *
     *  @return _extField
     */
    public BEExtensionInfo get_extField() {
        return _extField;
    }
        
    /**
     *  get parentId
     *
     *  @return parentId
     */
    public long getParentId() {
        return parentId;
    }

    /**
     *  get orgCode
     *
     *  @return orgCode
     */
    public java.lang.String getOrgCode() {
        return orgCode;
    }

    /**
     *  get name
     *
     *  @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     *  get description
     *
     *  @return description
     */
    public java.lang.String getDescription() {
        return description;
    }

        /**
     *  set enable
     *  @parameter true or false.
     */
    public void setEnabled(boolean enable) {
        _enable = enable;
    }

        /**
     *  set enable
     *  @parameter true or false.
     */
    private void set_enable(boolean enable) {
        _enable = enable;
    }

    /**
     *  set _extType
     *  @param _extType which is the extension type of be object.
     */
    public void set_extType(java.lang.String _extType) {
        this._extType = _extType;
    }
        
    /**
     *  set parentId
     */
    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    /**
     *  set orgCode
     */
    public void setOrgCode(java.lang.String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     *  set name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     *  set description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    
    /**
     * Check different according to primary key.
     */
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof org.shaolin.vogerp.commonmodel.be.OrganizationImpl))
            return false;
        org.shaolin.vogerp.commonmodel.be.OrganizationImpl o = (org.shaolin.vogerp.commonmodel.be.OrganizationImpl)obj;
        
        boolean result = super.equals(obj);

        boolean eq = true;
        
        return result;
    }

    /**
     * Generate hashCode according to primary key.
     */
    public int hashCode() {
        
        int result = super.hashCode();

        return result;
    }
        
    
     /**
     * Gets the String format of the business entity.
     *
     * @return String the business entity in String format.
     */
    public  String  toString() {
        StringBuffer aBuf = new StringBuffer();
        aBuf.append("org.shaolin.vogerp.commonmodel.be.Organization");
    
        aBuf.append(" extends ");
        aBuf.append(super.toString());
        
        aBuf.append("enable=").append(_enable).append(", ");
        
        aBuf.append("parentId");
        aBuf.append("=");
        aBuf.append(parentId);
        aBuf.append(", ");
        
        aBuf.append("orgCode");
        aBuf.append("=");
        aBuf.append(orgCode);
        aBuf.append(", ");
        
        aBuf.append("name");
        aBuf.append("=");
        aBuf.append(name);
        aBuf.append(", ");
        
        aBuf.append("description");
        aBuf.append("=");
        aBuf.append(description);
        aBuf.append(", ");
        
        return aBuf.toString();
    }
    
    
     /**
     * Gets list of MemberType.
     *
     * @return List     the list of MemberType.
     */
    public List<MemberType> getMemberList() {
        List<MemberType> memberTypeList = new ArrayList<MemberType>();
        
        List<MemberType> parentList = super.getMemberList();
        for(int i=0, n=parentList.size(); i<n; i++)
            memberTypeList.add(parentList.get(i));
            
        MemberType member = null;
        
        org.shaolin.bmdp.datamodel.bediagram.LongType parentIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for parentId
        member = new MemberType();
        member.setName("parentId");
        member.setDescription("null");
        member.setType(parentIdBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType orgCodeBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for orgCode
        member = new MemberType();
        member.setName("orgCode");
        member.setDescription("null");
        member.setType(orgCodeBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType nameBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for name
        member = new MemberType();
        member.setName("name");
        member.setDescription("null");
        member.setType(nameBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType descriptionBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for description
        member = new MemberType();
        member.setName("description");
        member.setDescription("null");
        member.setType(descriptionBEType);
        memberTypeList.add(member);
            
        return memberTypeList;
    }
    
    public IOrganization createEntity ()
    {
        return new OrganizationImpl();
    }
    
}

        
