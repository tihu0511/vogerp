package org.shaolin.vogerp.commonmodel.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.shaolin.bmdp.persistence.BEEntityDaoObject;
import org.shaolin.bmdp.persistence.HibernateUtil;
import org.shaolin.bmdp.runtime.ce.CEUtil;
import org.shaolin.bmdp.runtime.ce.IConstantEntity;
import org.shaolin.vogerp.commonmodel.be.IAddressInfo;
import org.shaolin.vogerp.commonmodel.be.IContactInfo;
import org.shaolin.vogerp.commonmodel.be.PersonalInfoImpl;

public class CustCommonModel extends BEEntityDaoObject {
	
	public static final CustCommonModel INSTANCE = new CustCommonModel();

    private CustCommonModel() {
    }
    
    public List<ArrayList<String>>[] getIndividualParties(String type) {
    	String sql = "SELECT c.id,c.firstname,c.lastname FROM comm_personinfo c where c.type=?;";
    	Session session = HibernateUtil.getSession();
    	SQLQuery sqlQuery = session.createSQLQuery(sql);
    	sqlQuery.setString(0, type);
    	List<Object[]> list = sqlQuery.list();
    	
    	ArrayList<String> valueResult = new ArrayList<String>();
    	ArrayList<String> displayResult = new ArrayList<String>();
    	if (list.size() == 0) {
    		return new List[] {valueResult, displayResult};
    	}
    	for (Object[] row : list) {
    		valueResult.add(row[0].toString());
    		displayResult.add(row[1].toString() + " " + row[2].toString());
    	}
    	return new List[] {valueResult, displayResult};
    }
    
    public List<ArrayList<String>>[] getCustemrsDeliveryInfo(int customerId) {
    	String sql = "SELECT p.warehouseid, count(p.warehouseid), b.name FROM prod_storageitem p, prod_warehouse b where p.warehouseid=b.id group by p.warehouseid;";
    	Session session = HibernateUtil.getSession();	
    	SQLQuery sqlQuery = session.createSQLQuery(sql);
    	List<Object[]> list = sqlQuery.list();
    	
    	ArrayList<String> valueResult = new ArrayList<String>();
    	valueResult.add("-1");
    	ArrayList<String> displayResult = new ArrayList<String>();
    	displayResult.add(IConstantEntity.CONSTANT_DEFAULT_VALUE);
    	if (list.size() == 0) {
    		return new List[] {valueResult, displayResult};
    	}
    	for (Object[] row : list) {
    		valueResult.add(String.valueOf(row[0]));
    		displayResult.add(CEUtil.getValue(String.valueOf(row[2])) + "("+  row[1] + ")");
    	}
    	return new List[] {valueResult, displayResult};
    }
    
    public void updateAddresses(long customerId, List<IAddressInfo> list) {
    	PersonalInfoImpl custCriteria = new PersonalInfoImpl();
    	custCriteria.setId(customerId);
    	List values = CommonModel.INSTANCE.searchPersonInfo(custCriteria, null, 0, 1);
    	if (list != null && list.size() > 0) {
    		PersonalInfoImpl customer = (PersonalInfoImpl)values.get(0);
    		List<IAddressInfo> existing = customer.getAddresses();
    		if (list.isEmpty() && !customer.getAddresses().isEmpty()) {
    			// disable all addresses
    			for (IAddressInfo a: existing) {
    				a.setEnabled(false);
    			}
    		} else {
    			for (IAddressInfo a: list) {
    				if (a.getId() > 0) {
    					for (IAddressInfo b: existing) {
    						if (b.getId() == a.getId()) {
    							b.setCountry(a.getCountry());
    							b.setCity(a.getCity());
    							b.setStreet(a.getStreet());
    							b.setBlock(a.getBlock());
    							b.setDescription(a.getDescription());
    							b.setZipcode(a.getZipcode());
    							break;
    						}
    					}
    				} else {
    					customer.getAddresses().add(a);
    				}
    			}
    		}
    		Session session = HibernateUtil.getSession();
    		session.update(customer);
    	}
    }
    
    public void updateContracts(long customerId, List<IContactInfo> list) {
    	PersonalInfoImpl custCriteria = new PersonalInfoImpl();
    	custCriteria.setId(customerId);
    	List values = CommonModel.INSTANCE.searchPersonInfo(custCriteria, null, 0, 1);
    	if (list != null && list.size() > 0) {
    		PersonalInfoImpl customer = (PersonalInfoImpl)values.get(0);
    		List<IContactInfo> existing = customer.getContacts();
    		if (list.isEmpty() && !customer.getContacts().isEmpty()) {
    			// disable all addresses
    			for (IContactInfo a: existing) {
    				a.setEnabled(false);
    			}
    		} else {
    			for (IContactInfo a: list) {
    				if (a.getId() > 0) {
    					for (IContactInfo b: existing) {
    						if (b.getId() == a.getId()) {
    							b.setEmail(a.getEmail());
    							b.setMobile(a.getMobile());
    							b.setTelephone(a.getTelephone());
    							b.setRemark(a.getRemark());
    							break;
    						}
    					}
    				} else {
    					customer.getContacts().add(a);
    				}
    			}
    		}
    		Session session = HibernateUtil.getSession();
    		session.update(customer);
    	}
    }
    
    public List<ArrayList<String>>[] getOrgEmployeeGroup() {
    	String sql = "SELECT count(p.id), b.name, b.orgcode FROM comm_personinfo p, comm_organization b where p.orgcode=b.orgcode group by b.id;";
    	Session session = HibernateUtil.getSession();
    	SQLQuery sqlQuery = session.createSQLQuery(sql);
    	List<Object[]> list = sqlQuery.list();
    	
    	ArrayList<String> valueResult = new ArrayList<String>();
    	valueResult.add("-1");
    	ArrayList<String> displayResult = new ArrayList<String>();
    	displayResult.add(IConstantEntity.CONSTANT_DEFAULT_VALUE);
    	if (list.size() == 0) {
    		return new List[] {valueResult, displayResult};
    	}
    	for (Object[] row : list) {
    		valueResult.add(row[2].toString());
    		displayResult.add(row[1] + "-" + row[2] + "(" + row[0] + ")");
    	}
    	return new List[] {valueResult, displayResult};
    }
}
