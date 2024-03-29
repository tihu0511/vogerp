package org.shaolin.vogerp.commonmodel;

import java.util.List;

import org.shaolin.vogerp.commonmodel.be.ILegalOrganizationInfo;
import org.shaolin.vogerp.commonmodel.be.IOrganization;
import org.shaolin.vogerp.commonmodel.be.IPersonalInfo;

public interface IOrganizationService {

	public IOrganization getOrganizationInfo();
	
	public ILegalOrganizationInfo getLegalInfo();
	
	public List<IOrganization> getSubOrganization(String orgCode);
	
	public List<IPersonalInfo> getEmployeese(String orgCode);
	
	public IPersonalInfo getEmployee(int id);
	
	public List<IPersonalInfo> getEmployeese();
	
	public List<String> getOrganizationRoles();
	
	/**
	 * The role-permission is managed in the system configuration.
	 * 
	 * @return
	 */
	public List<String> getEmployeeseRoles();
	
	public List<String> getEmployeeseByRole();
	
}
