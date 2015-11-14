package com.di.hr.service;

import java.util.List;

import com.di.hr.domain.Employee;

public interface EmployeeService {
	public boolean register(Employee employee);
	public Employee search(Employee employee);
	public List<Employee> searchAll();
}
