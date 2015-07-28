/*
 *
 * This file is automatically generated on Sun Jul 19 23:56:29 CST 2015
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

import org.shaolin.vogerp.accounting.ce.*;


/**
 * null
 * 
 * This code is generated automatically, any change will be replaced after rebuild.
 * 
 *
 */

public interface IInvoice 
    extends IPersistentEntity, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.accounting.be.Invoice";
    
 
    /**
     *  get id
     *
     *  @return id
     */
    public long getId();

    /**
     *  get serialNumber
     *
     *  @return serialNumber
     */
    public java.lang.String getSerialNumber();

    /**
     *  get customerInfo
     *
     *  @return customerInfo
     */
    public java.lang.String getCustomerInfo();

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
     *  get role
     *
     *  @return role
     */
    public InvoiceRoleType getRole();

    /**
     *  get status
     *
     *  @return status
     */
    public InvoiceStatusType getStatus();

    /**
     *  get paymentPartyId
     *
     *  @return paymentPartyId
     */
    public long getPaymentPartyId();

    /**
     *  get source
     *
     *  @return source
     */
    public java.lang.String getSource();

    /**
     *  get targetPartyId
     *
     *  @return targetPartyId
     */
    public long getTargetPartyId();

    /**
     *  get destination
     *
     *  @return destination
     */
    public java.lang.String getDestination();

    /**
     *  set id
     */
    public void setId(long id);

    /**
     *  set serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber);

    /**
     *  set customerInfo
     */
    public void setCustomerInfo(java.lang.String customerInfo);

    /**
     *  set description
     */
    public void setDescription(java.lang.String description);

    /**
     *  set createDate
     */
    public void setCreateDate(java.util.Date createDate);

    /**
     *  set role
     */
    public void setRole(InvoiceRoleType role);

    /**
     *  set status
     */
    public void setStatus(InvoiceStatusType status);

    /**
     *  set paymentPartyId
     */
    public void setPaymentPartyId(long paymentPartyId);

    /**
     *  set source
     */
    public void setSource(java.lang.String source);

    /**
     *  set targetPartyId
     */
    public void setTargetPartyId(long targetPartyId);

    /**
     *  set destination
     */
    public void setDestination(java.lang.String destination);


}

        