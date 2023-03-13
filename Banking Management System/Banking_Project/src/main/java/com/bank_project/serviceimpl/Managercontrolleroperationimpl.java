package com.bank_project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank_project.entity.Employee;
import com.bank_project.repo.Employeerepo;
import com.bank_project.repo.Managerrepo;
import com.bank_project.service.Managercontrolleroperationservice;

@Component
public class Managercontrolleroperationimpl implements Managercontrolleroperationservice {
	@Autowired
	Employeerepo repo;
	@Autowired
	Managerrepo mrepo;

	@Override
	public List<Employee> getlist() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void getadd(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
	}

	@Override
	public void getupdate(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
	}
}
