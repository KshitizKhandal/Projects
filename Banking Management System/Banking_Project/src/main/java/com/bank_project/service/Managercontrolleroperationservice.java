package com.bank_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank_project.entity.Employee;

@Service
public interface Managercontrolleroperationservice {

	List<Employee> getlist();

	void getadd(Employee employee);

	void getupdate(Employee employee);

}
