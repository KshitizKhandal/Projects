package com.bank_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_project.entity.Account;
import com.bank_project.service.Accountservice;

@RestController
@RequestMapping("/account")
public class Accountcontroller {
	@Autowired
	Accountservice service;

	@GetMapping("/")
	public List<Account> getall() {
		// return acrepo.findAll();
		return service.getall();
	}

	@PostMapping("/")
	public ResponseEntity<String> add(@RequestBody Account account) {

		return service.add(account);
	}
}
