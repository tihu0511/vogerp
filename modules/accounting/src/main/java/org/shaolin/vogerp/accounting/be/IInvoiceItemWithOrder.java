/*
 *
 * This file is automatically generated on Sun Jul 19 23:56:30 CST 2015
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

public interface IInvoiceItemWithOrder 
    extends IPersistentEntity, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.accounting.be.InvoiceItemWithOrder";
    
 
    /**
     *  get id
     *
     *  @return id
     */
    public long getId();

    /**
     *  get invoiceId
     *
     *  @return invoiceId
     */
    public long getInvoiceId();

    /**
     *  get invoiceItemId
     *
     *  @return invoiceItemId
     */
    public long getInvoiceItemId();

    /**
     *  get invoiceAmount
     *
     *  @return invoiceAmount
     */
    public int getInvoiceAmount();

    /**
     *  get orderId
     *
     *  @return orderId
     */
    public long getOrderId();

    /**
     *  get orderItemId
     *
     *  @return orderItemId
     */
    public long getOrderItemId();

    /**
     *  get orderAmount
     *
     *  @return orderAmount
     */
    public int getOrderAmount();

    /**
     *  get orderUnitPricet
     *
     *  @return orderUnitPricet
     */
    public double getOrderUnitPricet();

    /**
     *  set id
     */
    public void setId(long id);

    /**
     *  set invoiceId
     */
    public void setInvoiceId(long invoiceId);

    /**
     *  set invoiceItemId
     */
    public void setInvoiceItemId(long invoiceItemId);

    /**
     *  set invoiceAmount
     */
    public void setInvoiceAmount(int invoiceAmount);

    /**
     *  set orderId
     */
    public void setOrderId(long orderId);

    /**
     *  set orderItemId
     */
    public void setOrderItemId(long orderItemId);

    /**
     *  set orderAmount
     */
    public void setOrderAmount(int orderAmount);

    /**
     *  set orderUnitPricet
     */
    public void setOrderUnitPricet(double orderUnitPricet);


}

        