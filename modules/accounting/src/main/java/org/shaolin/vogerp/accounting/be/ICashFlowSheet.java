/*
 *
 * This file is automatically generated on Sun Jul 19 23:56:28 CST 2015
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

public interface ICashFlowSheet 
    extends IPersistentEntity, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.accounting.be.CashFlowSheet";
    
 
    /**
     *  get id
     *
     *  @return id
     */
    public long getId();

    /**
     *  get transId
     *
     *  @return transId
     */
    public long getTransId();

    /**
     *  set id
     */
    public void setId(long id);

    /**
     *  set transId
     */
    public void setTransId(long transId);


}

        