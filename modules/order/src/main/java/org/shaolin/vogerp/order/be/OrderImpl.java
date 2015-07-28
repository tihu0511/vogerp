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

import org.shaolin.vogerp.order.ce.*;


/**
 * null
 * 
 * This code is generated automatically, any change will be replaced after rebuild.
 * 
 *
 */

public class OrderImpl  implements org.shaolin.vogerp.order.be.IOrder
{
    private static final long serialVersionUID = 0x90B1123CE87B50FFL;

    private final IConstantService ceService = AppContext.get().getConstantService();

    protected String getBusinessEntityName()
    {
        return "org.shaolin.vogerp.order.be.Order";
    }

    public OrderImpl()
    {
        
        items = new java.util.ArrayList<IOrderItem>();
            
        _extField = new BEExtensionInfo();
        
    }
    
    
    
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
    protected long parentId;
    
   /**
     *  help is not available
     */    
    protected java.lang.String serialNumber;
    
   /**
     *  help is not available
     */    
    protected java.lang.String description;
    
   /**
     *  help is not available
     */    
    protected java.util.Date createDate;
    
   /**
     *  help is not available
     */    
    protected java.util.Date startCreateDate;
    
   /**
     *  help is not available
     */    
    protected java.util.Date endCreateDate;
    
   /**
     *  help is not available
     */    
    protected double discount;
    
   /**
     *  help is not available
     */    
    protected OrderStatusType status = OrderStatusType.NOT_SPECIFIED;
    
    protected int statusInt = OrderStatusType.NOT_SPECIFIED.getIntValue();
    
   /**
     *  help is not available
     */    
    protected java.util.List<IOrderItem> items;
    
    
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
     *  get parentId
     *
     *  @return parentId
     */
    public long getParentId() {
        return parentId;
    }

    /**
     *  get serialNumber
     *
     *  @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
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
     *  get createDate
     *
     *  @return createDate
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     *  get startCreateDate
     *
     *  @return startCreateDate
     */
    public java.util.Date getStartCreateDate() {
        return startCreateDate;
    }

    /**
     *  get endCreateDate
     *
     *  @return endCreateDate
     */
    public java.util.Date getEndCreateDate() {
        return endCreateDate;
    }

    /**
     *  get discount
     *
     *  @return discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     *  get status
     *
     *  @return status
     */
    public OrderStatusType getStatus() {
        return status;
    }

    /**
     *  get statusInt
     *
     *  @return statusInt
     */
    private int getStatusInt() {
        return statusInt;
    }

    /**
     *  get items
     *
     *  @return items
     */
    public java.util.List<IOrderItem> getItems() {
        return items;
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
     *  set parentId
     */
    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    /**
     *  set serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     *  set description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     *  set createDate
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     *  set startCreateDate
     */
    public void setStartCreateDate(java.util.Date startCreateDate) {
        this.startCreateDate = startCreateDate;
    }

    /**
     *  set endCreateDate
     */
    public void setEndCreateDate(java.util.Date endCreateDate) {
        this.endCreateDate = endCreateDate;
    }

    /**
     *  set discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     *  set status
     */
    public void setStatus(OrderStatusType status) {
        this.status = status;
    if (statusInt != status.getIntValue()) {
            statusInt = status.getIntValue();
        }
    }

    /**
     *  set int status
     */
    private void setStatusInt(int intValue) {
        this.statusInt = intValue;
        if (statusInt != status.getIntValue()) {
            status = (OrderStatusType)ceService.getConstantEntity(OrderStatusType.ENTITY_NAME).getByIntValue(statusInt);
        }
    }

    /**
     *  set items
     */
    public void setItems(java.util.List<IOrderItem> items) {
        this.items = items;
    }

    
    /**
     * Check different according to primary key.
     */
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof org.shaolin.vogerp.order.be.OrderImpl))
            return false;
        org.shaolin.vogerp.order.be.OrderImpl o = (org.shaolin.vogerp.order.be.OrderImpl)obj;
        
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
        aBuf.append("org.shaolin.vogerp.order.be.Order");
    
        aBuf.append(" : ");
        
        aBuf.append("id");
        aBuf.append("=");
        aBuf.append(id);
        aBuf.append(", ");
        
        aBuf.append("parentId");
        aBuf.append("=");
        aBuf.append(parentId);
        aBuf.append(", ");
        
        aBuf.append("serialNumber");
        aBuf.append("=");
        aBuf.append(serialNumber);
        aBuf.append(", ");
        
        aBuf.append("description");
        aBuf.append("=");
        aBuf.append(description);
        aBuf.append(", ");
        
        aBuf.append("createDate");
        aBuf.append("=");
        aBuf.append(createDate);
        aBuf.append(", ");
        
        aBuf.append("startCreateDate");
        aBuf.append("=");
        aBuf.append(startCreateDate);
        aBuf.append(", ");
        
        aBuf.append("endCreateDate");
        aBuf.append("=");
        aBuf.append(endCreateDate);
        aBuf.append(", ");
        
        aBuf.append("discount");
        aBuf.append("=");
        aBuf.append(discount);
        aBuf.append(", ");
        
        aBuf.append("status");
        aBuf.append("=");
        aBuf.append(status);
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
            
        org.shaolin.bmdp.datamodel.bediagram.LongType parentIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for parentId
        member = new MemberType();
        member.setName("parentId");
        member.setDescription("null");
        member.setType(parentIdBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType serialNumberBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for serialNumber
        member = new MemberType();
        member.setName("serialNumber");
        member.setDescription("null");
        member.setType(serialNumberBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType descriptionBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for description
        member = new MemberType();
        member.setName("description");
        member.setDescription("null");
        member.setType(descriptionBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.DateTimeType createDateBEType = new org.shaolin.bmdp.datamodel.bediagram.DateTimeType();
    
        //MemberType Define for createDate
        member = new MemberType();
        member.setName("createDate");
        member.setDescription("null");
        member.setType(createDateBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.DateTimeType startCreateDateBEType = new org.shaolin.bmdp.datamodel.bediagram.DateTimeType();
    
        //MemberType Define for startCreateDate
        member = new MemberType();
        member.setName("startCreateDate");
        member.setDescription("null");
        member.setType(startCreateDateBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.DateTimeType endCreateDateBEType = new org.shaolin.bmdp.datamodel.bediagram.DateTimeType();
    
        //MemberType Define for endCreateDate
        member = new MemberType();
        member.setName("endCreateDate");
        member.setDescription("null");
        member.setType(endCreateDateBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.DoubleType discountBEType = new org.shaolin.bmdp.datamodel.bediagram.DoubleType();
    
        //MemberType Define for discount
        member = new MemberType();
        member.setName("discount");
        member.setDescription("null");
        member.setType(discountBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.CEObjRefType statusBEType = new org.shaolin.bmdp.datamodel.bediagram.CEObjRefType();
    
        TargetEntityType statusTargetEntity = new TargetEntityType();
        statusBEType.setTargetEntity(statusTargetEntity);
        statusTargetEntity.setEntityName("org.shaolin.vogerp.order.ce.OrderStatusType");
            
        //MemberType Define for status
        member = new MemberType();
        member.setName("status");
        member.setDescription("null");
        member.setType(statusBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.BEListType itemsBEType = new org.shaolin.bmdp.datamodel.bediagram.BEListType();
    
        org.shaolin.bmdp.datamodel.bediagram.BEObjRefType itemsElementBEType = new org.shaolin.bmdp.datamodel.bediagram.BEObjRefType();
    
        TargetEntityType itemsElementTargetEntity = new TargetEntityType();
        itemsElementTargetEntity.setEntityName("org.shaolin.vogerp.order.be.OrderItem");
        itemsElementBEType.setTargetEntity(itemsElementTargetEntity);
            
        itemsBEType.setElementType(itemsElementBEType);
            
        //MemberType Define for items
        member = new MemberType();
        member.setName("items");
        member.setDescription("null");
        member.setType(itemsBEType);
        memberTypeList.add(member);
            
        return memberTypeList;
    }
    
    public IOrder createEntity ()
    {
        return new OrderImpl();
    }
    
}

        

