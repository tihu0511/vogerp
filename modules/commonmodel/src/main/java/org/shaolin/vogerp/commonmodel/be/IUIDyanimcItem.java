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

import org.shaolin.vogerp.commonmodel.ce.*;


/**
 * null
 * 
 * This code is generated automatically, any change will be replaced after rebuild.
 * 
 *
 */

public interface IUIDyanimcItem 
    extends IPersistentEntity, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.commonmodel.be.UIDyanimcItem";
    
 
    /**
     *  get id
     *
     *  @return id
     */
    public long getId();

    /**
     *  get uiEntityName
     *
     *  @return uiEntityName
     */
    public java.lang.String getUiEntityName();

    /**
     *  get uipanel
     *
     *  @return uipanel
     */
    public java.lang.String getUipanel();

    /**
     *  get filter
     *
     *  @return filter
     */
    public java.lang.String getFilter();

    /**
     *  get labelName
     *
     *  @return labelName
     */
    public java.lang.String getLabelName();

    /**
     *  get ceName
     *
     *  @return ceName
     */
    public java.lang.String getCeName();

    /**
     *  get ceSelectMode
     *
     *  @return ceSelectMode
     */
    public CESelectModeType getCeSelectMode();

    /**
     *  set id
     */
    public void setId(long id);

    /**
     *  set uiEntityName
     */
    public void setUiEntityName(java.lang.String uiEntityName);

    /**
     *  set uipanel
     */
    public void setUipanel(java.lang.String uipanel);

    /**
     *  set filter
     */
    public void setFilter(java.lang.String filter);

    /**
     *  set labelName
     */
    public void setLabelName(java.lang.String labelName);

    /**
     *  set ceName
     */
    public void setCeName(java.lang.String ceName);

    /**
     *  set ceSelectMode
     */
    public void setCeSelectMode(CESelectModeType ceSelectMode);


}

        