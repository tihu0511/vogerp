/*
 *
 * This file is automatically generated on Sun Jul 19 23:56:30 CST 2015
 */

    
package org.shaolin.vogerp.accounting.be;
        
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

public class InvoiceItemWithOrderImpl  implements org.shaolin.vogerp.accounting.be.IInvoiceItemWithOrder
{
    private static final long serialVersionUID = 0x90B1123CE87B50FFL;

    private final IConstantService ceService = AppContext.get().getConstantService();

    protected String getBusinessEntityName()
    {
        return "org.shaolin.vogerp.accounting.be.InvoiceItemWithOrder";
    }

    public InvoiceItemWithOrderImpl()
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
    protected long invoiceId;
    
   /**
     *  help is not available
     */    
    protected long invoiceItemId;
    
   /**
     *  help is not available
     */    
    protected int invoiceAmount;
    
   /**
     *  help is not available
     */    
    protected long orderId;
    
   /**
     *  help is not available
     */    
    protected long orderItemId;
    
   /**
     *  help is not available
     */    
    protected int orderAmount;
    
   /**
     *  help is not available
     */    
    protected double orderUnitPricet;
    
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
     *  get invoiceId
     *
     *  @return invoiceId
     */
    public long getInvoiceId() {
        return invoiceId;
    }

    /**
     *  get invoiceItemId
     *
     *  @return invoiceItemId
     */
    public long getInvoiceItemId() {
        return invoiceItemId;
    }

    /**
     *  get invoiceAmount
     *
     *  @return invoiceAmount
     */
    public int getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     *  get orderId
     *
     *  @return orderId
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     *  get orderItemId
     *
     *  @return orderItemId
     */
    public long getOrderItemId() {
        return orderItemId;
    }

    /**
     *  get orderAmount
     *
     *  @return orderAmount
     */
    public int getOrderAmount() {
        return orderAmount;
    }

    /**
     *  get orderUnitPricet
     *
     *  @return orderUnitPricet
     */
    public double getOrderUnitPricet() {
        return orderUnitPricet;
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
     *  set invoiceId
     */
    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     *  set invoiceItemId
     */
    public void setInvoiceItemId(long invoiceItemId) {
        this.invoiceItemId = invoiceItemId;
    }

    /**
     *  set invoiceAmount
     */
    public void setInvoiceAmount(int invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     *  set orderId
     */
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    /**
     *  set orderItemId
     */
    public void setOrderItemId(long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     *  set orderAmount
     */
    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     *  set orderUnitPricet
     */
    public void setOrderUnitPricet(double orderUnitPricet) {
        this.orderUnitPricet = orderUnitPricet;
    }

    
    /**
     * Check different according to primary key.
     */
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof org.shaolin.vogerp.accounting.be.InvoiceItemWithOrderImpl))
            return false;
        org.shaolin.vogerp.accounting.be.InvoiceItemWithOrderImpl o = (org.shaolin.vogerp.accounting.be.InvoiceItemWithOrderImpl)obj;
        
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
        aBuf.append("org.shaolin.vogerp.accounting.be.InvoiceItemWithOrder");
    
        aBuf.append(" : ");
        
        aBuf.append("enable=").append(_enable).append(", ");
        
        aBuf.append("id");
        aBuf.append("=");
        aBuf.append(id);
        aBuf.append(", ");
        
        aBuf.append("invoiceId");
        aBuf.append("=");
        aBuf.append(invoiceId);
        aBuf.append(", ");
        
        aBuf.append("invoiceItemId");
        aBuf.append("=");
        aBuf.append(invoiceItemId);
        aBuf.append(", ");
        
        aBuf.append("invoiceAmount");
        aBuf.append("=");
        aBuf.append(invoiceAmount);
        aBuf.append(", ");
        
        aBuf.append("orderId");
        aBuf.append("=");
        aBuf.append(orderId);
        aBuf.append(", ");
        
        aBuf.append("orderItemId");
        aBuf.append("=");
        aBuf.append(orderItemId);
        aBuf.append(", ");
        
        aBuf.append("orderAmount");
        aBuf.append("=");
        aBuf.append(orderAmount);
        aBuf.append(", ");
        
        aBuf.append("orderUnitPricet");
        aBuf.append("=");
        aBuf.append(orderUnitPricet);
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
            
        org.shaolin.bmdp.datamodel.bediagram.LongType invoiceIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for invoiceId
        member = new MemberType();
        member.setName("invoiceId");
        member.setDescription("null");
        member.setType(invoiceIdBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.LongType invoiceItemIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for invoiceItemId
        member = new MemberType();
        member.setName("invoiceItemId");
        member.setDescription("null");
        member.setType(invoiceItemIdBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.IntType invoiceAmountBEType = new org.shaolin.bmdp.datamodel.bediagram.IntType();
    
        //MemberType Define for invoiceAmount
        member = new MemberType();
        member.setName("invoiceAmount");
        member.setDescription("null");
        member.setType(invoiceAmountBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.LongType orderIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for orderId
        member = new MemberType();
        member.setName("orderId");
        member.setDescription("null");
        member.setType(orderIdBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.LongType orderItemIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for orderItemId
        member = new MemberType();
        member.setName("orderItemId");
        member.setDescription("null");
        member.setType(orderItemIdBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.IntType orderAmountBEType = new org.shaolin.bmdp.datamodel.bediagram.IntType();
    
        //MemberType Define for orderAmount
        member = new MemberType();
        member.setName("orderAmount");
        member.setDescription("null");
        member.setType(orderAmountBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.DoubleType orderUnitPricetBEType = new org.shaolin.bmdp.datamodel.bediagram.DoubleType();
    
        //MemberType Define for orderUnitPricet
        member = new MemberType();
        member.setName("orderUnitPricet");
        member.setDescription("null");
        member.setType(orderUnitPricetBEType);
        memberTypeList.add(member);
            
        return memberTypeList;
    }
    
    public IInvoiceItemWithOrder createEntity ()
    {
        return new InvoiceItemWithOrderImpl();
    }
    
}

        

