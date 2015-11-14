package com.di.hr;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.di.crm.common.config.HrConfig;
import com.di.hr.domain.Employee;
import com.di.hr.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={HrConfig.class})
public class TestEmployee {

	private Employee employee;
	
	@Resource(name="employeeService")
	private EmployeeService service;
	
	@Before
	public void setUp() {
		employee = new Employee();
	}
	
	private Employee setGeneralEmployee() {
		employee.setRowId("1-ZDEXX");
		employee.setEmpId("2015022000001");
		employee.setKorName("Park Shin Hye");
		employee.setCreatedBy("administrator");
		return employee;
	}
	
	private List<Employee> setGeneralEmployeeList() {
		List<Employee> list = new LinkedList<Employee>();

		Employee firstEmployee = 
				new Employee("1-ZDEXX","2015022000002","Ahn Hee Yeon", "administrator");
		Employee secondEmployee = 
				new Employee("1-ZDEXW","2015022000003","Cha Ae Ryun", "administrator");
		Employee thirdEmployee = 
				new Employee("1-ZDEXQ","2015022000004","Lee Sun Hee", "administrator");
		Employee forthEmployee = 
				new Employee("1-ZDEXU","2015022000005","Choi Hee", "administrator");
		
		list.add(firstEmployee);
		list.add(secondEmployee);
		list.add(thirdEmployee);
		list.add(forthEmployee);
		
		return list;
	}
	
	@Test
	public void testCreateEmployee() {
		this.setGeneralEmployee();
		service.register(employee);
		
		List<Employee> savedList = service.searchAll();
		assertThat(savedList.size(), is(1));
		
		List<Employee> list = this.setGeneralEmployeeList();
		for(Employee emp : list) {
			service.register(emp);
		}
		List<Employee> addedList = service.searchAll();
		assertThat(addedList.size(), is(savedList.size() + addedList.size()));
	}
	
	@Test
	public void testSearchEmployee() {
		assertThat(service.search(employee).getEmpId(), is(employee.getEmpId()));
	}
	
	@Test
	public void testRegisterEmployee() {
		Employee notRegisteredEmp = service.search(employee);
		boolean fResult = service.register(notRegisteredEmp);
		
		assertThat(fResult, is(true));
	}
}
