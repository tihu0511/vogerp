/*
 *
 * This file is automatically generated on Sun Jul 19 23:56:29 CST 2015
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

import org.shaolin.vogerp.accounting.ce.*;


/**
 * null
 * 
 * This code is generated automatically, any change will be replaced after rebuild.
 * 
 *
 */

public class InvoiceItemImpl  implements org.shaolin.vogerp.accounting.be.IInvoiceItem
{
    private static final long serialVersionUID = 0x90B1123CE87B50FFL;

    private final IConstantService ceService = AppContext.get().getConstantService();

    protected String getBusinessEntityName()
    {
        return "org.shaolin.vogerp.accounting.be.InvoiceItem";
    }

    public InvoiceItemImpl()
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
    protected long productId;
    
   /**
     *  help is not available
     */    
    protected int amount;
    
   /**
     *  help is not available
     */    
    protected double unitPrice;
    
   /**
     *  help is not available
     */    
    protected InvoiceItemType type = InvoiceItemType.NOT_SPECIFIED;
    
    protected int typeInt = InvoiceItemType.NOT_SPECIFIED.getIntValue();
    
   /**
     *  help is not available
     */    
    protected boolean isAdjusted;
    
   /**
     *  help is not available
     */    
    protected java.lang.String statement;
    
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
     *  get productId
     *
     *  @return productId
     */
    public long getProductId() {
        return productId;
    }

    /**
     *  get amount
     *
     *  @return amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     *  get unitPrice
     *
     *  @return unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     *  get type
     *
     *  @return type
     */
    public InvoiceItemType getType() {
        return type;
    }

    /**
     *  get typeInt
     *
     *  @return typeInt
     */
    private int getTypeInt() {
        return typeInt;
    }

    /**
     *  get isAdjusted
     *
     *  @return isAdjusted
     */
    public boolean getIsAdjusted() {
        return isAdjusted;
    }

    /**
     *  get statement
     *
     *  @return statement
     */
    public java.lang.String getStatement() {
        return statement;
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
     *  set productId
     */
    public void setProductId(long productId) {
        this.productId = productId;
    }

    /**
     *  set amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     *  set unitPrice
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     *  set type
     */
    public void setType(InvoiceItemType type) {
        this.type = type;
    if (typeInt != type.getIntValue()) {
            typeInt = type.getIntValue();
        }
    }

    /**
     *  set int type
     */
    private void setTypeInt(int intValue) {
        this.typeInt = intValue;
        if (typeInt != type.getIntValue()) {
            type = (InvoiceItemType)ceService.getConstantEntity(InvoiceItemType.ENTITY_NAME).getByIntValue(typeInt);
        }
    }

    /**
     *  set isAdjusted
     */
    public void setIsAdjusted(boolean isAdjusted) {
        this.isAdjusted = isAdjusted;
    }

    /**
     *  set statement
     */
    public void setStatement(java.lang.String statement) {
        this.statement = statement;
    }

    
    /**
     * Check different according to primary key.
     */
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof org.shaolin.vogerp.accounting.be.InvoiceItemImpl))
            return false;
        org.shaolin.vogerp.accounting.be.InvoiceItemImpl o = (org.shaolin.vogerp.accounting.be.InvoiceItemImpl)obj;
        
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
        aBuf.append("org.shaolin.vogerp.accounting.be.InvoiceItem");
    
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
        
        aBuf.append("productId");
        aBuf.append("=");
        aBuf.append(productId);
        aBuf.append(", ");
        
        aBuf.append("amount");
        aBuf.append("=");
        aBuf.append(amount);
        aBuf.append(", ");
        
        aBuf.append("unitPrice");
        aBuf.append("=");
        aBuf.append(unitPrice);
        aBuf.append(", ");
        
        aBuf.append("type");
        aBuf.append("=");
        aBuf.append(type);
        aBuf.append(", ");
        
        aBuf.append("isAdjusted");
        aBuf.append("=");
        aBuf.append(isAdjusted);
        aBuf.append(", ");
        
        aBuf.append("statement");
        aBuf.append("=");
        aBuf.append(statement);
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
            
        org.shaolin.bmdp.datamodel.bediagram.LongType productIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for productId
        member = new MemberType();
        member.setName("productId");
        member.setDescription("null");
        member.setType(productIdBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.IntType amountBEType = new org.shaolin.bmdp.datamodel.bediagram.IntType();
    
        //MemberType Define for amount
        member = new MemberType();
        member.setName("amount");
        member.setDescription("null");
        member.setType(amountBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.DoubleType unitPriceBEType = new org.shaolin.bmdp.datamodel.bediagram.DoubleType();
    
        //MemberType Define for unitPrice
        member = new MemberType();
        member.setName("unitPrice");
        member.setDescription("null");
        member.setType(unitPriceBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.CEObjRefType typeBEType = new org.shaolin.bmdp.datamodel.bediagram.CEObjRefType();
    
        TargetEntityType typeTargetEntity = new TargetEntityType();
        typeBEType.setTargetEntity(typeTargetEntity);
        typeTargetEntity.setEntityName("org.shaolin.vogerp.accounting.ce.InvoiceItemType");
            
        //MemberType Define for type
        member = new MemberType();
        member.setName("type");
        member.setDescription("null");
        member.setType(typeBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.BooleanType isAdjustedBEType = new org.shaolin.bmdp.datamodel.bediagram.BooleanType();
    
        //MemberType Define for isAdjusted
        member = new MemberType();
        member.setName("isAdjusted");
        member.setDescription("null");
        member.setType(isAdjustedBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType statementBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for statement
        member = new MemberType();
        member.setName("statement");
        member.setDescription("null");
        member.setType(statementBEType);
        memberTypeList.add(member);
            
        return memberTypeList;
    }
    
    public IInvoiceItem createEntity ()
    {
        return new InvoiceItemImpl();
    }
    
}

        

