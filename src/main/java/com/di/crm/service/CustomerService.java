package com.di.crm.service;

import com.di.approval.domain.Approval;
import com.di.crm.domain.Customer;
import com.di.crm.validate.customer.CustomerComplianceInfo;
import com.di.crm.validate.customer.CustomerFinancialInfo;
import com.di.hr.domain.Employee;

public interface CustomerService {
	public boolean register(Customer customer);
	public boolean registerDirectly(Customer customer);
	
	public boolean update(Customer customer);
	public boolean delete(Customer customer);
	public boolean deleteAll();
	
	public Customer search(Customer customer);
	public int countCustomer();
	public boolean findExistedCustomer(Customer customer);
	
	public Approval registerApproval(Customer customer, Employee employee, Approval apprvInfo);
	
/*	register() : include all process(normal)
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
	 * addLog() : save the whole history*/
}
