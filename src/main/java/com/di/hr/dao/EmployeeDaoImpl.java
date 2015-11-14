package com.di.hr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.di.crm.common.mapper.EmployeeMapper;
import com.di.hr.domain.Employee;

@Component
@Repository(value="employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public Employee selectEmployeeWithRowId(String rowId) {
		return employeeMapper.selectEmployeeWithRowId(rowId);
	}

	@Override
	public Employee selectEmployeeWithEmpId(String empId) {
		return employeeMapper.selectEmployeeWithEmpId(empId);
	}

	@Override
	public List<Employee> selectEmployeesAll() {
		return employeeMapper.selectEmployeesAll();
	}

	@Override
	public int insertEmployee(Employee employee) {
		return employeeMapper.insertEmployee(employee);
	}

	@Override
	public int updateEmployeeByPkId(Employee employee) {
		return employeeMapper.updateEmployeeByPkId(employee);
	}

	@Override
	public int deleteEmployeebyPkId(String rowId, String empId) {
		return employeeMapper.deleteEmployeebyPkId(rowId, empId);
	}
}
