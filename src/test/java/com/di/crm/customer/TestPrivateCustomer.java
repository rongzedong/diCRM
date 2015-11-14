package com.di.crm.customer;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;

import com.di.crm.domain.Customer;
import com.di.crm.exception.customer.DuplicateCustomerException;
import com.di.crm.service.CustomerService;
import com.di.crm.service.CustomerServiceImpl;
import com.di.util.Code.CustomerType;

public class TestPrivateCustomer {

	Customer customer = null;
	CustomerService customerService = null;
	
	@Before
	public void setUp() {
		customer = new Customer("Lee Hyun Yi", CustomerType.PRIVATE);
		customerService = new CustomerServiceImpl();
	}
	
	/**
	 * before customer register, must confirm..
	 * 
	 * 1) name
	 * 2) alias name
	 * 3) email(with agreement of private strategy)
	 * 4) phone number(with agreement of private strategy)
	 *
	 */
	@Test
	public void testConfirmAlreadyRegistered() {
		
		//TODO : DAO 구현후 재테스트요
		/*assertThat(customerService.findExistedCustomer(customer), is(false));
		
		customerService.register(customer);
		assertThat(customerService.findExistedCustomer(customer), is(true));
		assertThat(customerService.search(customer), is(customer));*/
	}
	
	@Test
	public void testDuplicateRegister() {
		customerService.register(customer);
		//TODO : DAO 구현후 재테스트요 (expected=DuplicateCustomerException.class)
		//assertThat(customerService.search(customer), is(customer));
		customerService.register(customer);
	}
}
