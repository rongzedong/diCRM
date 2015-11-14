package com.di.hr;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.di.hr.domain.Employee;
import com.di.hr.service.EmployeeService;
import com.di.hr.service.EmployeeServiceImpl;

/**
 * 
 * Interface with HR system
 * 
 * @author hyun
 *
 */

public class TestInterfaceWithHR {
	
	private Employee employee = null;
	private EmployeeService service = null;
	
	@Before
	public void setUp() {
		service = new EmployeeServiceImpl();
	}
	
	@Test
	public void testGetHRInformation() {
		
	}
	
	@Test
	public void testRegisterEmployee() {
		employee = new Employee("Lee Hyun Yi");
		service.register(employee);
		assertThat(service.search(employee), is(employee));
	}
	
	@Test
	public void testDuplicateRegister() {
		employee = new Employee("Lee Hyun Yi");
		service.register(employee);
		assertThat(service.search(employee), is(employee));
		
		service.register(employee);
	}
}
