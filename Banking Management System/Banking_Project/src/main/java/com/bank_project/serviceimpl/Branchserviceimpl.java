package com.bank_project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank_project.entity.Account;
import com.bank_project.entity.Branch;
import com.bank_project.repo.Accountrepo;
import com.bank_project.repo.Branchrepo;

import com.bank_project.service.Branchservice;

@Component
public class Branchserviceimpl implements Branchservice {

	@Autowired
	Branchrepo repo;
	@Autowired
	Accountrepo arepo;

	@Override
	public List<Branch> getlist() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Account getaccount(int accountnumber) {

		return arepo.findById((long) accountnumber).get();
	}

	@Override
	public void getadd(Branch branch) {
		// TODO Auto-generated method stub
		repo.save(branch);
	}

	@Override
	public void getupdate(Branch branch) {
		// TODO Auto-generated method stub
		repo.save(branch);
	}

}
