package com.di.hr.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.di.hr.dao.EmployeeDao;
import com.di.hr.domain.Employee;

@Service(value="employeeService")
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

	@Resource(name="employeeDao")
	private EmployeeDao employeeDao;

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean register(Employee employee) {
		if (employeeDao.selectEmployeeWithEmpId(employee.getEmpId()) != null) {
			return (employeeDao.insertEmployee(employee) > 0);
		}
		return false;
	}

	@Override
	public Employee search(Employee employee) {
		return employeeDao.selectEmployeeWithEmpId(employee.getEmpId());
	}

	@Override
	public List<Employee> searchAll() {
		return employeeDao.selectEmployeesAll();
	}
}
