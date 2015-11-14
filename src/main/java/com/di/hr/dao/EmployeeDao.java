package com.di.hr.dao;

import java.util.List;

import com.di.hr.domain.Employee;

public interface EmployeeDao {
	public Employee selectEmployeeWithRowId(String rowId);
	
	public Employee selectEmployeeWithEmpId(String empId);
	
	public List<Employee> selectEmployeesAll();

	public int insertEmployee(Employee employee);
	
	public int updateEmployeeByPkId(Employee employee);
	
	public int deleteEmployeebyPkId(String rowId, String empId);
}
