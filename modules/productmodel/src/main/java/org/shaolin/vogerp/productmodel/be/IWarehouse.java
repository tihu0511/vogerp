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

public interface IWarehouse 
    extends IPersistentEntity, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.productmodel.be.Warehouse";
    
 
    /**
     *  get id
     *
     *  @return id
     */
    public long getId();

    /**
     *  get parentId
     *
     *  @return parentId
     */
    public long getParentId();

    /**
     *  get name
     *
     *  @return name
     */
    public java.lang.String getName();

    /**
     *  get description
     *
     *  @return description
     */
    public java.lang.String getDescription();

    /**
     *  get photoPath
     *
     *  @return photoPath
     */
    public java.lang.String getPhotoPath();

    /**
     *  get location
     *
     *  @return location
     */
    public java.lang.String getLocation();

    /**
     *  get containerType
     *
     *  @return containerType
     */
    public StorageContainerType getContainerType();

    /**
     *  set id
     */
    public void setId(long id);

    /**
     *  set parentId
     */
    public void setParentId(long parentId);

    /**
     *  set name
     */
    public void setName(java.lang.String name);

    /**
     *  set description
     */
    public void setDescription(java.lang.String description);

    /**
     *  set photoPath
     */
    public void setPhotoPath(java.lang.String photoPath);

    /**
     *  set location
     */
    public void setLocation(java.lang.String location);

    /**
     *  set containerType
     */
    public void setContainerType(StorageContainerType containerType);


}

        