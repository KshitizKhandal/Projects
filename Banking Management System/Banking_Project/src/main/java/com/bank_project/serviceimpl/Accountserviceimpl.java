package com.bank_project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.bank_project.entity.Account;
import com.bank_project.repo.Accountrepo;
import com.bank_project.service.Accountservice;

@Component
public class Accountserviceimpl implements Accountservice {
	@Autowired
	Accountrepo acrepo;

	@Override
	public List<Account> getall() {
		// TODO Auto-generated method stub
		return acrepo.findAll();
	}

	@Override
	public ResponseEntity<String> add(Account account) {
		if (account.getAmount() < 500) {
			return new ResponseEntity<String>("Insufficient Balance !! ", HttpStatus.BAD_REQUEST);
		}

		else {
			acrepo.save(account);
		}
		return new ResponseEntity<String>("Amount Added Successfully !!! ", HttpStatus.OK);
	}
}
