package com.di.crm.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.di.hr.domain.Employee;

@Repository(value="employeeMapper")
public interface EmployeeMapper {

	public Employee selectEmployeeWithRowId(String rowId);
	
	public Employee selectEmployeeWithEmpId(String empId);
	
	public List<Employee> selectEmployeesAll();

	public int insertEmployee(Employee employee);
	
	public int updateEmployeeByPkId(Employee employee);
	
	public int deleteEmployeebyPkId(String rowId, String empId);
}
