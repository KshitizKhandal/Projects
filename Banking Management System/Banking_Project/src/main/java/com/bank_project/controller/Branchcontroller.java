package com.bank_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_project.entity.Account;
import com.bank_project.entity.Branch;
import com.bank_project.service.Branchservice;

@RestController
@RequestMapping("/branch")
public class Branchcontroller {
	@Autowired
	Branchservice service;

	@GetMapping("/")
	public List<Branch> getlist() {
		return service.getlist();
	}

	@GetMapping("/{accountnumber}")
	public Account getaccount(@PathVariable("accountnumber") int accountnumber) {
		return service.getaccount(accountnumber);
	}

	@PostMapping("/")
	public void getadd(@RequestBody Branch branch) {
		service.getadd(branch);
	}

	@PutMapping("/{id}")
	public void getupdate(@RequestBody Branch branch) {
		service.getupdate(branch);
	}

}
