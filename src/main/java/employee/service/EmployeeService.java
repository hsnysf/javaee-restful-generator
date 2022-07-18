package employee.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import employee.bean.EmployeeBean;
import employee.entity.Employee;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/")
public class EmployeeService {

	@EJB
	EmployeeBean employeeBean;
	
	@Path("searchEmployees")
	@POST
	public List<Employee> searchEmployees(Employee employeeSearch) throws Exception {
		
		return employeeBean.searchEmployees(employeeSearch);
	}
	
	@Path("getEmployeeCount")
	@POST
	public Employee getEmployeeCount(Employee employeeSearch) throws Exception {
		
		return employeeBean.getEmployeeCount(employeeSearch);
	}
	
	@Path("getEmployee")
	@POST
	public Employee getEmployee(Employee employee) throws Exception {
		
		return employeeBean.getEmployee(employee);
	}
	
	@Path("saveEmployee")
	@POST
	public Employee saveEmployee(Employee employee) throws Exception {
		
		return employeeBean.saveEmployee(employee);
	}
	
	@Path("updateEmployeeActive")
	@POST
	public Employee updateEmployeeActive(Employee employee) throws Exception {
		
		return employeeBean.updateEmployeeActive(employee);
	}
}