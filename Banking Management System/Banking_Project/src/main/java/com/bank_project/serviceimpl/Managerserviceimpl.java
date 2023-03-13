package com.bank_project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank_project.entity.Manager;
import com.bank_project.repo.Managerrepo;
import com.bank_project.service.Managerservice;

@Component
public class Managerserviceimpl implements Managerservice {
	@Autowired
	Managerrepo repo;

	@Override
	public List<Manager> getlistm() {
		return repo.findAll();
	}

	@Override
	public void getadd(Manager manager) {
		// TODO Auto-generated method stub
		repo.save(manager);

	}

}
