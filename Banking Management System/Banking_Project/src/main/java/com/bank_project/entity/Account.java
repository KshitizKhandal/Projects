package com.bank_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "account")

public class Account {

	@Id
	long accountnumber;

	@Column
	int pin;

	@Column
	int amount;
	@OneToOne
	User user;


	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", pin=" + pin + ", amount=" + amount + ", user=" + user
				+ ", accounttype=" + ", getAccountnumber()=" + getAccountnumber() + ", getPin()="
				+ getPin() + ", getAmount()=" + getAmount() + ", getUser()=" + getUser() + ", getAccounttype()="
				+  ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Account(long accountnumber, int pin, int amount, User user) {
		super();
		this.accountnumber = accountnumber;
		this.pin = pin;
		this.amount = amount;
		this.user = user;
	
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

}