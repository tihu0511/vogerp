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

public interface ICEHierarchy 
    extends IPersistentEntity, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.commonmodel.be.CEHierarchy";
    
 
    /**
     *  get id
     *
     *  @return id
     */
    public long getId();

    /**
     *  get parentCeName
     *
     *  @return parentCeName
     */
    public java.lang.String getParentCeName();

    /**
     *  get parentCeItem
     *
     *  @return parentCeItem
     */
    public int getParentCeItem();

    /**
     *  get ceName
     *
     *  @return ceName
     */
    public java.lang.String getCeName();

    /**
     *  set id
     */
    public void setId(long id);

    /**
     *  set parentCeName
     */
    public void setParentCeName(java.lang.String parentCeName);

    /**
     *  set parentCeItem
     */
    public void setParentCeItem(int parentCeItem);

    /**
     *  set ceName
     */
    public void setCeName(java.lang.String ceName);


}

        