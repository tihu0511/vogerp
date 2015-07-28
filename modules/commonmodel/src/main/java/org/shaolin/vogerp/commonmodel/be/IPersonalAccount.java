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

public interface IPersonalAccount 
    extends IPersistentEntity, IExtensibleEntity
{
    public final static String ENTITY_NAME = "org.shaolin.vogerp.commonmodel.be.PersonalAccount";
    
 
    /**
     *  get id
     *
     *  @return id
     */
    public long getId();

    /**
     *  get userName
     *
     *  @return userName
     */
    public java.lang.String getUserName();

    /**
     *  get password
     *
     *  @return password
     */
    public java.lang.String getPassword();

    /**
     *  get personalId
     *
     *  @return personalId
     */
    public long getPersonalId();

    /**
     *  get info
     *
     *  @return info
     */
    public PersonalInfoImpl getInfo();

    /**
     *  get locale
     *
     *  @return locale
     */
    public java.lang.String getLocale();

    /**
     *  get attempt
     *
     *  @return attempt
     */
    public int getAttempt();

    /**
     *  get isLocked
     *
     *  @return isLocked
     */
    public boolean getIsLocked();

    /**
     *  get lockedMoment
     *
     *  @return lockedMoment
     */
    public java.util.Date getLockedMoment();

    /**
     *  get expirationDate
     *
     *  @return expirationDate
     */
    public java.util.Date getExpirationDate();

    /**
     *  get lastLogin
     *
     *  @return lastLogin
     */
    public java.util.Date getLastLogin();

    /**
     *  set id
     */
    public void setId(long id);

    /**
     *  set userName
     */
    public void setUserName(java.lang.String userName);

    /**
     *  set password
     */
    public void setPassword(java.lang.String password);

    /**
     *  set personalId
     */
    public void setPersonalId(long personalId);

    /**
     *  set info
     */
    public void setInfo(PersonalInfoImpl info);

    /**
     *  set locale
     */
    public void setLocale(java.lang.String locale);

    /**
     *  set attempt
     */
    public void setAttempt(int attempt);

    /**
     *  set isLocked
     */
    public void setIsLocked(boolean isLocked);

    /**
     *  set lockedMoment
     */
    public void setLockedMoment(java.util.Date lockedMoment);

    /**
     *  set expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate);

    /**
     *  set lastLogin
     */
    public void setLastLogin(java.util.Date lastLogin);


}

        