package com.bank_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank_project.entity.Account;
import com.bank_project.entity.Employee;
import com.bank_project.entity.User;
import com.bank_project.repo.Userrepo;
import com.bank_project.service.Employeeservice;

@RestController
@RequestMapping("employee")
public class Employeecontroller {
	@Autowired
	Employeeservice service;
    @Autowired
    Userrepo urepo;
	@GetMapping("/")
	public List<Employee> getall() {
		return service.getall();
	}
	@GetMapping("/total")
	public String getAllTotal() {
        return service.getAllTotal();
    }


	@GetMapping("/username")
    public ResponseEntity<List<User>> getUserByusername(@RequestParam String username) {
        return new ResponseEntity<List<User>>(urepo.findByUsername(username), HttpStatus.OK);
    }

    @GetMapping("/age")
    public ResponseEntity<List<User>> getUserByAge(@RequestParam int age) {
        return new ResponseEntity<List<User>>(urepo.findByAge(age), HttpStatus.OK);
    }

    @GetMapping("/address")
    public ResponseEntity<List<User>> getUserByAddress(@RequestParam String address) {
        return new ResponseEntity<List<User>>(urepo.findByAddress(address), HttpStatus.OK);
    }
	
	@DeleteMapping("/{accountnumber}")
	public List<Account> deletebyaccountnumber(@PathVariable("accountnumber") long accountnumber) {

		return service.deletebyaccountnumber(accountnumber);
	}

	@PutMapping("/{id}")
	public void getupdate(@RequestBody User user) {

		service.getupdate(user);
	}

}
