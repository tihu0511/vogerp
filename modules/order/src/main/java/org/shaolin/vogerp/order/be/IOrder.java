/*
 *
 * This file is automatically generated on Sat Jul 11 22:49:45 CST 2015
 */

    
package org.shaolin.vogerp.order.be;
        
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

import org.shaolin.vogerp.order.ce.*;


/**
 * null
 * 
 * This code is generated automatically, any change will be replaced after rebuild.
 * 
 *
 */

public interface IOrder 
    extends IBusinessEntity, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.order.be.Order";
    
 
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
     *  get serialNumber
     *
     *  @return serialNumber
     */
    public java.lang.String getSerialNumber();

    /**
     *  get description
     *
     *  @return description
     */
    public java.lang.String getDescription();

    /**
     *  get createDate
     *
     *  @return createDate
     */
    public java.util.Date getCreateDate();

    /**
     *  get startCreateDate
     *
     *  @return startCreateDate
     */
    public java.util.Date getStartCreateDate();

    /**
     *  get endCreateDate
     *
     *  @return endCreateDate
     */
    public java.util.Date getEndCreateDate();

    /**
     *  get discount
     *
     *  @return discount
     */
    public double getDiscount();

    /**
     *  get status
     *
     *  @return status
     */
    public OrderStatusType getStatus();

    /**
     *  get items
     *
     *  @return items
     */
    public java.util.List<IOrderItem> getItems();

    /**
     *  set id
     */
    public void setId(long id);

    /**
     *  set parentId
     */
    public void setParentId(long parentId);

    /**
     *  set serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber);

    /**
     *  set description
     */
    public void setDescription(java.lang.String description);

    /**
     *  set createDate
     */
    public void setCreateDate(java.util.Date createDate);

    /**
     *  set startCreateDate
     */
    public void setStartCreateDate(java.util.Date startCreateDate);

    /**
     *  set endCreateDate
     */
    public void setEndCreateDate(java.util.Date endCreateDate);

    /**
     *  set discount
     */
    public void setDiscount(double discount);

    /**
     *  set status
     */
    public void setStatus(OrderStatusType status);

    /**
     *  set items
     */
    public void setItems(java.util.List<IOrderItem> items);


}

        