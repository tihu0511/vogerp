/*
 *
 * This file is automatically generated on Thu Jul 23 13:15:09 CST 2015
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

public interface IOrganization 
    extends IPersistentEntity, org.shaolin.vogerp.commonmodel.be.IParty, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.commonmodel.be.Organization";
    
 
    /**
     *  get parentId
     *
     *  @return parentId
     */
    public long getParentId();

    /**
     *  get orgCode
     *
     *  @return orgCode
     */
    public java.lang.String getOrgCode();

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
     *  set parentId
     */
    public void setParentId(long parentId);

    /**
     *  set orgCode
     */
    public void setOrgCode(java.lang.String orgCode);

    /**
     *  set name
     */
    public void setName(java.lang.String name);

    /**
     *  set description
     */
    public void setDescription(java.lang.String description);


}

        