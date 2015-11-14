package com.di.crm.customer;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;

import com.di.crm.domain.Customer;
import com.di.crm.exception.customer.DuplicateCustomerException;
import com.di.crm.service.CustomerServiceImpl;
import com.di.util.Code.CustomerType;

/**
 * PreProcess to register the customer
 * 
 * STATE : PROSPECTS, ACTIVE, PENDING(during register), 
 * 		   SUSPENDING(from active -> suspending -> active)
 * CLASS : WHITE, GRAY, BLUE, DIAMOND 
 * 
 * 
 * register() : include all process(normal)
 * registerDirectly() : abnormal process, must save the reason(who is working for..)
 * 
 * findExistedCustomer() : search the customer using several condition
 * checkComplianceIssue() : check the compliance process(ex. casino company, etc)
 * checkFinancialIssue() : financial issue, manage the db about the bad company
 * checkBlackList() : find out the cherry picker, etc.
 * 
 * registerApproval() : start the approval process
 * notify() : notify to the related team(ex. marketing, compliance)
 * 				- regularly send email including total number(in the morning)
 *            and staff(send SMS)
 * 
 * addLog() : save the whole history
 * 
 * @author hyun
 *
 */

public class TestCustomerService {

	private final String CUSTOMER_NAME = "Apple";
	private final String CUSTOMER_CORP_REGNUM = "A0192000";
	
	private Customer customer = null;
	private CustomerServiceImpl customerService = null;
	private CustomerType type;			//private/enterprise
	
	@Before
	public void setUp() {
		customer = new Customer(CUSTOMER_NAME, type.PRIVATE);
		customer.setCorpRegNumber(CUSTOMER_CORP_REGNUM);
		
		customerService = new CustomerServiceImpl();
	}
	
	
	//TODO : CRUD 테스트 후 재테스트요!!
	/**
	 * before customer register, must confirm..
	 * 
	 * 1) company
	 * 2) registered number
	 * 3) email(with agreement of private strategy)
	 * 4) phone number(with agreement of private strategy)
	 *
	 */
	/*@Test(expected=DuplicateCustomerException.class)
	public void testAlreadyExisted() {
		
		customerService.register(customer);
		assertEquals(customerService.search(customer), true);
		
		//before registering the customer, 
		//search the customer in the db
		Customer customer2 = new Customer(CUSTOMER_NAME + " Inc", CustomerType.COMPANY);
		customer2.setCorpRegNumber(CUSTOMER_CORP_REGNUM);
		
		//preprocess before registering the customer
		assertEquals(customerService.search(customer2), true);
		customerService.register(customer2);
	}
	
	@Test
	public void testCheckComplianceIssue() {
		
		
		
	}
	
	@Test 
	public void testCustomerDelete() {
		
	}*/
}
