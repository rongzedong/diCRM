package com.di.crm.customer;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;

import com.di.crm.domain.Address;
import com.di.crm.domain.Customer;
import com.di.crm.exception.customer.DuplicateCustomerException;
import com.di.crm.exception.customer.FailUpdateCustomer;
import com.di.crm.exception.customer.NotExistCustomer;
import com.di.crm.service.CustomerServiceImpl;
import com.di.util.Code.CustomerType;

public class TestCustomerCrud {

	//TODO : CRUD테스트 후 재테스요!!
	
	private Customer customer = null;
	private CustomerServiceImpl customerService = null;

	@Before
	public void SetUp() {
		customer = new Customer("Apple", CustomerType.COMPANY);
		customerService = new CustomerServiceImpl();
	}
	
	@Test(expected=DuplicateCustomerException.class)
	public void testDuplicateCustomerRegister() throws Exception{
		assertNull(customerService.search(customer));
		customerService.register(customer);
		assertThat(customerService.search(customer), is(customer));
		
		customerService.register(customer);
	}
	
	@Test
	public void testRegistingCustomer() {
		boolean result = customerService.register(customer);
		assertEquals(result, true);
		assertEquals(customerService.countCustomer(), 1);
		
		assertThat(customerService.search(customer),is(customer));
	}
	
	@Test
	public void testRegistingMultipleCustomer() {
		customerService.register(customer);
		
		Customer addedCustomer = new Customer("Xiaome", CustomerType.PRIVATE);
		customerService.register(addedCustomer);
		
		assertThat(customerService.search(customer), is(customer));
		assertThat(customerService.search(addedCustomer), is(addedCustomer));
	}
	
	@Test
	public void testSearchExistCustomer() {
		Customer searchCustomer = customerService.search(customer);
		assertThat(searchCustomer, is(customer));
	}
	
	@Test(expected=FailUpdateCustomer.class) 
	public void testFailUpdateCustomer() {
		Customer NotExistCustomer = new Customer("NotExistCustomer", CustomerType.PRIVATE);
		customerService.update(NotExistCustomer);
	}
	
	@Test
	public void testUpdateCustomer() {
		
		Address changedAddress = new Address();
		changedAddress.setDetailAddress("Mapo-Gu, Hapjung-dong");
		changedAddress.setCity("seoul");
				
		customer.setAddress(changedAddress);
		customerService.update(customer);
		
		assertThat(customer.getAddress(), is(changedAddress));
		
		assertThat(true, is(false));
	}
	
	@Test
	public void testSearchNotExistCustomer() {
		Customer notExistCustomer = new Customer("zzzz", CustomerType.PRIVATE);
		assertNull(customerService.search(notExistCustomer));
	}
	
	@Test
	public void testDeleteCustomerAll() {
		customerService.deleteAll();
		assertThat(customerService.countCustomer(), is(0));
	}
	
	@Test(expected=NotExistCustomer.class)
	public void testDeleteNotExistCustomer() {
		Customer notExistCustomer = new Customer("abcd", CustomerType.PRIVATE);
		customerService.delete(notExistCustomer);
	}
	
	@Test
	public void testDeleteCustomer() {
		customerService.register(customer);
		customerService.delete(customer);
		assertNull(customerService.search(customer));
	}
}
