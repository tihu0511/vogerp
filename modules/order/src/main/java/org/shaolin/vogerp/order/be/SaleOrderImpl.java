/*
 *
 * This file is automatically generated on Sat Jul 11 22:49:45 CST 2015
 */

    
package org.shaolin.vogerp.order.be;
        
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

public class SaleOrderImpl 
    extends OrderImpl
         implements org.shaolin.vogerp.order.be.ISaleOrder
{
    private static final long serialVersionUID = 0x90B1123CE87B50FFL;

    private final IConstantService ceService = AppContext.get().getConstantService();

    protected String getBusinessEntityName()
    {
        return "org.shaolin.vogerp.order.be.SaleOrder";
    }

    public SaleOrderImpl()
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
    protected long customerId;
    
   /**
     *  help is not available
     */    
    protected org.shaolin.vogerp.commonmodel.be.PersonalInfoImpl customer;
    
   /**
     *  help is not available
     */    
    protected long deliveryInfoId;
    
   /**
     *  help is not available
     */    
    protected DeliveryInfoImpl deliveryInfo;
    
   /**
     *  help is not available
     */    
    protected java.util.Date deliveryDate;
    
   /**
     *  help is not available
     */    
    protected java.util.Date startDeliveryDate;
    
   /**
     *  help is not available
     */    
    protected java.util.Date enddeliveryDate;
    
   /**
     *  help is not available
     */    
    protected long purchasedOrderId;
    
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
     *  get customerId
     *
     *  @return customerId
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     *  get customer
     *
     *  @return customer
     */
    public org.shaolin.vogerp.commonmodel.be.PersonalInfoImpl getCustomer() {
        return customer;
    }

    /**
     *  get deliveryInfoId
     *
     *  @return deliveryInfoId
     */
    public long getDeliveryInfoId() {
        return deliveryInfoId;
    }

    /**
     *  get deliveryInfo
     *
     *  @return deliveryInfo
     */
    public DeliveryInfoImpl getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     *  get deliveryDate
     *
     *  @return deliveryDate
     */
    public java.util.Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     *  get startDeliveryDate
     *
     *  @return startDeliveryDate
     */
    public java.util.Date getStartDeliveryDate() {
        return startDeliveryDate;
    }

    /**
     *  get enddeliveryDate
     *
     *  @return enddeliveryDate
     */
    public java.util.Date getEnddeliveryDate() {
        return enddeliveryDate;
    }

    /**
     *  get purchasedOrderId
     *
     *  @return purchasedOrderId
     */
    public long getPurchasedOrderId() {
        return purchasedOrderId;
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
     *  set customerId
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    /**
     *  set customer
     */
    public void setCustomer(org.shaolin.vogerp.commonmodel.be.PersonalInfoImpl customer) {
        this.customer = customer;
    }

    /**
     *  set deliveryInfoId
     */
    public void setDeliveryInfoId(long deliveryInfoId) {
        this.deliveryInfoId = deliveryInfoId;
    }

    /**
     *  set deliveryInfo
     */
    public void setDeliveryInfo(DeliveryInfoImpl deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    /**
     *  set deliveryDate
     */
    public void setDeliveryDate(java.util.Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     *  set startDeliveryDate
     */
    public void setStartDeliveryDate(java.util.Date startDeliveryDate) {
        this.startDeliveryDate = startDeliveryDate;
    }

    /**
     *  set enddeliveryDate
     */
    public void setEnddeliveryDate(java.util.Date enddeliveryDate) {
        this.enddeliveryDate = enddeliveryDate;
    }

    /**
     *  set purchasedOrderId
     */
    public void setPurchasedOrderId(long purchasedOrderId) {
        this.purchasedOrderId = purchasedOrderId;
    }

    
    /**
     * Check different according to primary key.
     */
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof org.shaolin.vogerp.order.be.SaleOrderImpl))
            return false;
        org.shaolin.vogerp.order.be.SaleOrderImpl o = (org.shaolin.vogerp.order.be.SaleOrderImpl)obj;
        
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
        aBuf.append("org.shaolin.vogerp.order.be.SaleOrder");
    
        aBuf.append(" extends ");
        aBuf.append(super.toString());
        
        aBuf.append("enable=").append(_enable).append(", ");
        
        aBuf.append("customerId");
        aBuf.append("=");
        aBuf.append(customerId);
        aBuf.append(", ");
        
        aBuf.append("customer");
        aBuf.append("=");
        aBuf.append(customer==null? "" : customer.toString());
        aBuf.append(", ");
        
        aBuf.append("deliveryInfoId");
        aBuf.append("=");
        aBuf.append(deliveryInfoId);
        aBuf.append(", ");
        
        aBuf.append("deliveryInfo");
        aBuf.append("=");
        aBuf.append(deliveryInfo==null? "" : deliveryInfo.toString());
        aBuf.append(", ");
        
        aBuf.append("deliveryDate");
        aBuf.append("=");
        aBuf.append(deliveryDate);
        aBuf.append(", ");
        
        aBuf.append("startDeliveryDate");
        aBuf.append("=");
        aBuf.append(startDeliveryDate);
        aBuf.append(", ");
        
        aBuf.append("enddeliveryDate");
        aBuf.append("=");
        aBuf.append(enddeliveryDate);
        aBuf.append(", ");
        
        aBuf.append("purchasedOrderId");
        aBuf.append("=");
        aBuf.append(purchasedOrderId);
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
        
        org.shaolin.bmdp.datamodel.bediagram.LongType customerIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for customerId
        member = new MemberType();
        member.setName("customerId");
        member.setDescription("null");
        member.setType(customerIdBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.BEObjRefType customerBEType = new org.shaolin.bmdp.datamodel.bediagram.BEObjRefType();
    
        TargetEntityType customerTargetEntity = new TargetEntityType();
        customerTargetEntity.setEntityName("org.shaolin.vogerp.commonmodel.be.PersonalInfo");
        customerBEType.setTargetEntity(customerTargetEntity);
            
        //MemberType Define for customer
        member = new MemberType();
        member.setName("customer");
        member.setDescription("null");
        member.setType(customerBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.LongType deliveryInfoIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for deliveryInfoId
        member = new MemberType();
        member.setName("deliveryInfoId");
        member.setDescription("null");
        member.setType(deliveryInfoIdBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.BEObjRefType deliveryInfoBEType = new org.shaolin.bmdp.datamodel.bediagram.BEObjRefType();
    
        TargetEntityType deliveryInfoTargetEntity = new TargetEntityType();
        deliveryInfoTargetEntity.setEntityName("org.shaolin.vogerp.order.be.DeliveryInfo");
        deliveryInfoBEType.setTargetEntity(deliveryInfoTargetEntity);
            
        //MemberType Define for deliveryInfo
        member = new MemberType();
        member.setName("deliveryInfo");
        member.setDescription("null");
        member.setType(deliveryInfoBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.DateTimeType deliveryDateBEType = new org.shaolin.bmdp.datamodel.bediagram.DateTimeType();
    
        //MemberType Define for deliveryDate
        member = new MemberType();
        member.setName("deliveryDate");
        member.setDescription("null");
        member.setType(deliveryDateBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.DateTimeType startDeliveryDateBEType = new org.shaolin.bmdp.datamodel.bediagram.DateTimeType();
    
        //MemberType Define for startDeliveryDate
        member = new MemberType();
        member.setName("startDeliveryDate");
        member.setDescription("null");
        member.setType(startDeliveryDateBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.DateTimeType enddeliveryDateBEType = new org.shaolin.bmdp.datamodel.bediagram.DateTimeType();
    
        //MemberType Define for enddeliveryDate
        member = new MemberType();
        member.setName("enddeliveryDate");
        member.setDescription("null");
        member.setType(enddeliveryDateBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.LongType purchasedOrderIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for purchasedOrderId
        member = new MemberType();
        member.setName("purchasedOrderId");
        member.setDescription("null");
        member.setType(purchasedOrderIdBEType);
        memberTypeList.add(member);
            
        return memberTypeList;
    }
    
    public ISaleOrder createEntity ()
    {
        return new SaleOrderImpl();
    }
    
}

        

