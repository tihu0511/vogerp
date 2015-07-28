/*
 *
 * This file is automatically generated on Thu Jul 23 13:15:10 CST 2015
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

public class CEEntityInfoImpl  implements org.shaolin.vogerp.commonmodel.be.ICEEntityInfo
{
    private static final long serialVersionUID = 0x90B1123CE87B50FFL;

    private final IConstantService ceService = AppContext.get().getConstantService();

    protected String getBusinessEntityName()
    {
        return "org.shaolin.vogerp.commonmodel.be.CEEntityInfo";
    }

    public CEEntityInfoImpl()
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
    protected long id;
    
   /**
     *  help is not available
     */    
    protected java.lang.String ceName;
    
   /**
     *  help is not available
     */    
    protected java.lang.String i18nKey;
    
   /**
     *  help is not available
     */    
    protected java.lang.String description;
    
   /**
     *  help is not available
     */    
    protected java.lang.String icon;
    
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
     *  get id
     *
     *  @return id
     */
    public long getId() {
        return id;
    }

    /**
     *  get ceName
     *
     *  @return ceName
     */
    public java.lang.String getCeName() {
        return ceName;
    }

    /**
     *  get i18nKey
     *
     *  @return i18nKey
     */
    public java.lang.String getI18nKey() {
        return i18nKey;
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
     *  get icon
     *
     *  @return icon
     */
    public java.lang.String getIcon() {
        return icon;
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
     *  set id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     *  set ceName
     */
    public void setCeName(java.lang.String ceName) {
        this.ceName = ceName;
    }

    /**
     *  set i18nKey
     */
    public void setI18nKey(java.lang.String i18nKey) {
        this.i18nKey = i18nKey;
    }

    /**
     *  set description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     *  set icon
     */
    public void setIcon(java.lang.String icon) {
        this.icon = icon;
    }

    
    /**
     * Check different according to primary key.
     */
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof org.shaolin.vogerp.commonmodel.be.CEEntityInfoImpl))
            return false;
        org.shaolin.vogerp.commonmodel.be.CEEntityInfoImpl o = (org.shaolin.vogerp.commonmodel.be.CEEntityInfoImpl)obj;
        
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
        aBuf.append("org.shaolin.vogerp.commonmodel.be.CEEntityInfo");
    
        aBuf.append(" : ");
        
        aBuf.append("enable=").append(_enable).append(", ");
        
        aBuf.append("id");
        aBuf.append("=");
        aBuf.append(id);
        aBuf.append(", ");
        
        aBuf.append("ceName");
        aBuf.append("=");
        aBuf.append(ceName);
        aBuf.append(", ");
        
        aBuf.append("i18nKey");
        aBuf.append("=");
        aBuf.append(i18nKey);
        aBuf.append(", ");
        
        aBuf.append("description");
        aBuf.append("=");
        aBuf.append(description);
        aBuf.append(", ");
        
        aBuf.append("icon");
        aBuf.append("=");
        aBuf.append(icon);
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
        
        MemberType member = null;
        
        org.shaolin.bmdp.datamodel.bediagram.LongType idBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for id
        member = new MemberType();
        member.setName("id");
        member.setDescription("null");
        member.setType(idBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType ceNameBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for ceName
        member = new MemberType();
        member.setName("ceName");
        member.setDescription("null");
        member.setType(ceNameBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType i18nKeyBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for i18nKey
        member = new MemberType();
        member.setName("i18nKey");
        member.setDescription("null");
        member.setType(i18nKeyBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType descriptionBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for description
        member = new MemberType();
        member.setName("description");
        member.setDescription("null");
        member.setType(descriptionBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType iconBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for icon
        member = new MemberType();
        member.setName("icon");
        member.setDescription("null");
        member.setType(iconBEType);
        memberTypeList.add(member);
            
        return memberTypeList;
    }
    
    public ICEEntityInfo createEntity ()
    {
        return new CEEntityInfoImpl();
    }
    
}

        

