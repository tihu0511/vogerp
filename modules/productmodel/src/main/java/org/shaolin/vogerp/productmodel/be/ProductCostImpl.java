/*
 *
 * This file is automatically generated on Tue Jul 21 23:50:34 CST 2015
 */

    
package org.shaolin.vogerp.productmodel.be;
        
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

import org.shaolin.vogerp.productmodel.ce.*;


/**
 * null
 * 
 * This code is generated automatically, any change will be replaced after rebuild.
 * 
 *
 */

public class ProductCostImpl  implements org.shaolin.vogerp.productmodel.be.IProductCost
{
    private static final long serialVersionUID = 0x90B1123CE87B50FFL;

    private final IConstantService ceService = AppContext.get().getConstantService();

    protected String getBusinessEntityName()
    {
        return "org.shaolin.vogerp.productmodel.be.ProductCost";
    }

    public ProductCostImpl()
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
    protected long productId;
    
   /**
     *  help is not available
     */    
    protected org.shaolin.vogerp.productmodel.be.ProductImpl product;
    
   /**
     *  help is not available
     */    
    protected java.lang.String packages;
    
   /**
     *  help is not available
     */    
    protected double price;
    
   /**
     *  help is not available
     */    
    protected java.lang.String comments;
    
   /**
     *  help is not available
     */    
    protected CostType type = CostType.NOT_SPECIFIED;
    
    protected int typeInt = CostType.NOT_SPECIFIED.getIntValue();
    
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
     *  get productId
     *
     *  @return productId
     */
    public long getProductId() {
        return productId;
    }

    /**
     *  get product
     *
     *  @return product
     */
    public org.shaolin.vogerp.productmodel.be.ProductImpl getProduct() {
        return product;
    }

    /**
     *  get packages
     *
     *  @return packages
     */
    public java.lang.String getPackages() {
        return packages;
    }

    /**
     *  get price
     *
     *  @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     *  get comments
     *
     *  @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }

    /**
     *  get type
     *
     *  @return type
     */
    public CostType getType() {
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
     *  set productId
     */
    public void setProductId(long productId) {
        this.productId = productId;
    }

    /**
     *  set product
     */
    public void setProduct(org.shaolin.vogerp.productmodel.be.ProductImpl product) {
        this.product = product;
    }

    /**
     *  set packages
     */
    public void setPackages(java.lang.String packages) {
        this.packages = packages;
    }

    /**
     *  set price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *  set comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    /**
     *  set type
     */
    public void setType(CostType type) {
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
            type = (CostType)ceService.getConstantEntity(CostType.ENTITY_NAME).getByIntValue(typeInt);
        }
    }

    
    /**
     * Check different according to primary key.
     */
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof org.shaolin.vogerp.productmodel.be.ProductCostImpl))
            return false;
        org.shaolin.vogerp.productmodel.be.ProductCostImpl o = (org.shaolin.vogerp.productmodel.be.ProductCostImpl)obj;
        
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
        aBuf.append("org.shaolin.vogerp.productmodel.be.ProductCost");
    
        aBuf.append(" : ");
        
        aBuf.append("enable=").append(_enable).append(", ");
        
        aBuf.append("id");
        aBuf.append("=");
        aBuf.append(id);
        aBuf.append(", ");
        
        aBuf.append("productId");
        aBuf.append("=");
        aBuf.append(productId);
        aBuf.append(", ");
        
        aBuf.append("product");
        aBuf.append("=");
        aBuf.append(product==null? "" : product.toString());
        aBuf.append(", ");
        
        aBuf.append("packages");
        aBuf.append("=");
        aBuf.append(packages);
        aBuf.append(", ");
        
        aBuf.append("price");
        aBuf.append("=");
        aBuf.append(price);
        aBuf.append(", ");
        
        aBuf.append("comments");
        aBuf.append("=");
        aBuf.append(comments);
        aBuf.append(", ");
        
        aBuf.append("type");
        aBuf.append("=");
        aBuf.append(type);
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
            
        org.shaolin.bmdp.datamodel.bediagram.LongType productIdBEType = new org.shaolin.bmdp.datamodel.bediagram.LongType();
    
        //MemberType Define for productId
        member = new MemberType();
        member.setName("productId");
        member.setDescription("null");
        member.setType(productIdBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.BEObjRefType productBEType = new org.shaolin.bmdp.datamodel.bediagram.BEObjRefType();
    
        TargetEntityType productTargetEntity = new TargetEntityType();
        productTargetEntity.setEntityName("org.shaolin.vogerp.productmodel.be.Product");
        productBEType.setTargetEntity(productTargetEntity);
            
        //MemberType Define for product
        member = new MemberType();
        member.setName("product");
        member.setDescription("null");
        member.setType(productBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType packagesBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for packages
        member = new MemberType();
        member.setName("packages");
        member.setDescription("null");
        member.setType(packagesBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.DoubleType priceBEType = new org.shaolin.bmdp.datamodel.bediagram.DoubleType();
    
        //MemberType Define for price
        member = new MemberType();
        member.setName("price");
        member.setDescription("null");
        member.setType(priceBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.StringType commentsBEType = new org.shaolin.bmdp.datamodel.bediagram.StringType();
    
        //MemberType Define for comments
        member = new MemberType();
        member.setName("comments");
        member.setDescription("null");
        member.setType(commentsBEType);
        memberTypeList.add(member);
            
        org.shaolin.bmdp.datamodel.bediagram.CEObjRefType typeBEType = new org.shaolin.bmdp.datamodel.bediagram.CEObjRefType();
    
        TargetEntityType typeTargetEntity = new TargetEntityType();
        typeBEType.setTargetEntity(typeTargetEntity);
        typeTargetEntity.setEntityName("org.shaolin.vogerp.productmodel.ce.CostType");
            
        //MemberType Define for type
        member = new MemberType();
        member.setName("type");
        member.setDescription("null");
        member.setType(typeBEType);
        memberTypeList.add(member);
            
        return memberTypeList;
    }
    
    public IProductCost createEntity ()
    {
        return new ProductCostImpl();
    }
    
}

        

