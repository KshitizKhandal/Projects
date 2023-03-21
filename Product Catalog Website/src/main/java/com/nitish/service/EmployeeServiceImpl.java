package com.nitish.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitish.dao.EmployeeDao;
import com.nitish.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeDao employeeDao;
	@Transactional
	public void registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.registerEmployee(employee);
		
	}

	public Employee loginStudent(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.loginEmployee(employee);
	}

}
