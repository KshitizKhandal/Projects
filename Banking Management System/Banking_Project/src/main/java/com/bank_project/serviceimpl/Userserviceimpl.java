package com.bank_project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.bank_project.entity.Account;
import com.bank_project.entity.User;
import com.bank_project.repo.Accountrepo;
import com.bank_project.repo.Userrepo;
import com.bank_project.service.Userservice;

@Component
public class Userserviceimpl implements Userservice {

	@Autowired
	Userrepo repo;
	@Autowired
	Userrepo urepo;
	@Autowired
	Accountrepo arepo;

	@Override
	public void getadd(User user) {
		urepo.save(user);

	}

	@Override
	public List<User> getall() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}

	@Override
	public ResponseEntity<String> checkbalance(long accountnumber, int pin) {
		List<Account> account = arepo.findAll();
		for (Account acc : account) {
			if (acc.getAccountnumber() == accountnumber && acc.getPin() == pin) {
				return new ResponseEntity<String>("currentBalance is " + acc.getAmount(), HttpStatus.ACCEPTED);

			} else {

//				return new ResponseEntity<String>("Incorrect Account Number and pin", HttpStatus.BAD_REQUEST);
			}
		}

		return new ResponseEntity<String>("Wrong Entry ", HttpStatus.OK);

	}

	@Override
	public ResponseEntity<String> withdrawBalance(int amountwithdraw) {

		List<Account> accounts = arepo.findAll();
		for (Account acc : accounts) {

			int amount = acc.getAmount();
			if (amount < amountwithdraw) {
				return new ResponseEntity<String>("insufficient balance", HttpStatus.BAD_REQUEST);
			} else {
				amount -= amountwithdraw;
				if (amount <= 500) {
					return new ResponseEntity<String>("amount less than 500", HttpStatus.BAD_REQUEST);
				} else {
					Account account = new Account();
					acc.setAmount(amount);
					arepo.save(acc);

					return new ResponseEntity<String>("withdraw success remaining balance is" + account.getAmount(),
							HttpStatus.OK);
				}
			}
		}
		return null;

	}

	@Override
	public ResponseEntity<String> getInterest(long accountnumber, int pin) {

		List<Account> account = arepo.findAll();
		double interest = 0;
		for (Account acc : account) {
			if (accountnumber == acc.getAccountnumber() && pin == acc.getPin()) {
				interest = acc.getAmount() * 0.07;
				// 1000->> 1000*7/100=70

			} else {

			}

		}

		return new ResponseEntity<String>("Interest is " + interest, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> deposite(Long accountnumber, int amountnum) {
		List<Account> account = arepo.findAll();
     
		for (Account acc : account) {
			int amount = acc.getAmount();
			
			if (accountnumber == acc.getAccountnumber()) {
				amountnum = amount + amountnum; 
				acc.setAmount(amountnum);
                   arepo.save(acc);
                  
			}
		}
		 return new ResponseEntity<String>("Suceessfully deposite" ,
					HttpStatus.OK);
	}
}
