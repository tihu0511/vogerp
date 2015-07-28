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

public interface IProductCode 
    extends IPersistentEntity, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.productmodel.be.ProductCode";
    
 
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
     *  get code
     *
     *  @return code
     */
    public java.lang.String getCode();

    /**
     *  get type
     *
     *  @return type
     */
    public ProductCodeType getType();

    /**
     *  set id
     */
    public void setId(long id);

    /**
     *  set productId
     */
    public void setProductId(long productId);

    /**
     *  set code
     */
    public void setCode(java.lang.String code);

    /**
     *  set type
     */
    public void setType(ProductCodeType type);


}

        