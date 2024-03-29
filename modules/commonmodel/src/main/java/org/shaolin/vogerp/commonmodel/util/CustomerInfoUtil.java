package org.shaolin.vogerp.commonmodel.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.shaolin.vogerp.commonmodel.be.IAddressInfo;
import org.shaolin.vogerp.commonmodel.be.IContactInfo;

public class CustomerInfoUtil {

	public static List<ArrayList<String>>[] getAddressInfo(List<IAddressInfo> list) {
    	if (list == null || list.isEmpty()) {
    		return new List[] {new ArrayList<String>(), new ArrayList<String>()};
    	}
    	
    	ArrayList<String> valueResult = new ArrayList<String>();
    	ArrayList<String> displayResult = new ArrayList<String>();
    	for (IAddressInfo address : list) {
    		valueResult.add(String.valueOf(address.getId()));
    		displayResult.add(addressToString(address));
    	}
    	return new List[] {valueResult, displayResult};
    }
    
    public static List<ArrayList<String>>[] getContactInfo(List<IContactInfo> list) {
    	if (list == null || list.isEmpty()) {
    		//Don't use Collections.emptyList.
    		return new List[] {new ArrayList<String>(), new ArrayList<String>()};
    	}
    	
    	ArrayList<String> valueResult = new ArrayList<String>();
    	ArrayList<String> displayResult = new ArrayList<String>();
    	for (IContactInfo contact : list) {
    		valueResult.add(String.valueOf(contact.getId()));
    		displayResult.add(contact.getTelephone() + " " + contact.getEmail());
    	}
    	return new List[] {valueResult, displayResult};
    }
    
    public static String addressToString(IAddressInfo address) {
    	StringBuffer sb = new StringBuffer();
    	sb.append(address.getCountry()).append(" ");
    	sb.append(address.getCity()).append(" ");
    	sb.append(address.getStreet()).append(" ");
    	sb.append(address.getBlock()).append(" ");
    	sb.append(address.getZipcode()).append(" ");
    	
    	return sb.toString();
    }
}
