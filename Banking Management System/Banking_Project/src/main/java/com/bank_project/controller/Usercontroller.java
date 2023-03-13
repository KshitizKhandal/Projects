package com.bank_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_project.entity.User;
import com.bank_project.service.Userservice;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	@Autowired
	Userservice service;

	@PostMapping("/")
	public void getadd(@RequestBody User user) {
		service.getadd(user);
	}

	@GetMapping("/")
	public List<User> getall() {
		// return urepo.findAll();
		return service.getall();
	}

	@GetMapping("/{accountnumber}/{pin}")
	public ResponseEntity<String> checkBalance(@PathVariable("accountnumber") long accountnumber,
			@PathVariable("pin") int pin) 
	{
		return service.checkbalance(accountnumber, pin);
	}

	@GetMapping("/{accountnumber}/{pin}/{amountwithdraw}")
	public ResponseEntity<String> withdrawBalance(@PathVariable("accountnumber") long accountnumber,
			@PathVariable("pin") int pin, @PathVariable("amountwithdraw") int amountwithdraw) {
		service.checkbalance(accountnumber, pin);
		return service.withdrawBalance(amountwithdraw);
	}
	@GetMapping("/interest/{accountnumber}/{pin}")
			 public ResponseEntity<String> getInterest(@PathVariable("accountnumber") long accountnumber,
			            @PathVariable("pin") int pin) {
			        service.checkbalance(accountnumber, pin);
			                return service.getInterest(accountnumber, pin);

			    }
	@GetMapping("/deposite/{accountnumber}/{amountnum}")
	public ResponseEntity<String> deposite( @PathVariable("accountnumber") long accountnumber,
            @PathVariable("amountnum") int amountnum) 
	{
		return service.deposite(accountnumber , amountnum);
	}
	
}
