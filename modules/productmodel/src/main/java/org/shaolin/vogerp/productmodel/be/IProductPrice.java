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

public interface IProductPrice 
    extends IPersistentEntity, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.productmodel.be.ProductPrice";
    
 
    /**
     *  get id
     *
     *  @return id
     */
    public long getId();

    /**
     *  get productId
     *
     *  @return productId
     */
    public long getProductId();

    /**
     *  get product
     *
     *  @return product
     */
    public org.shaolin.vogerp.productmodel.be.ProductImpl getProduct();

    /**
     *  get packages
     *
     *  @return packages
     */
    public java.lang.String getPackages();

    /**
     *  get partyId
     *
     *  @return partyId
     */
    public long getPartyId();

    /**
     *  get price
     *
     *  @return price
     */
    public double getPrice();

    /**
     *  get exceedAmount
     *
     *  @return exceedAmount
     */
    public int getExceedAmount();

    /**
     *  get discount
     *
     *  @return discount
     */
    public double getDiscount();

    /**
     *  get comments
     *
     *  @return comments
     */
    public java.lang.String getComments();

    /**
     *  get type
     *
     *  @return type
     */
    public PriceType getType();

    /**
     *  set id
     */
    public void setId(long id);

    /**
     *  set productId
     */
    public void setProductId(long productId);

    /**
     *  set product
     */
    public void setProduct(org.shaolin.vogerp.productmodel.be.ProductImpl product);

    /**
     *  set packages
     */
    public void setPackages(java.lang.String packages);

    /**
     *  set partyId
     */
    public void setPartyId(long partyId);

    /**
     *  set price
     */
    public void setPrice(double price);

    /**
     *  set exceedAmount
     */
    public void setExceedAmount(int exceedAmount);

    /**
     *  set discount
     */
    public void setDiscount(double discount);

    /**
     *  set comments
     */
    public void setComments(java.lang.String comments);

    /**
     *  set type
     */
    public void setType(PriceType type);


}

        