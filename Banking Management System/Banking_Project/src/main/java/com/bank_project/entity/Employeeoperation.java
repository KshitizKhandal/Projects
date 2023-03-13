package com.bank_project.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employeeoperation")
public class Employeeoperation {
@Id
long accountnumber;
@OneToOne
User user;


public Employeeoperation(long accountnumber, User user) {
	super();
	this.accountnumber = accountnumber;
	this.user = user;

}

public Employeeoperation() {
	super();
	// TODO Auto-generated constructor stub
}
public long getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(long accountnumber) {
	this.accountnumber = accountnumber;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "Employeeoperation [accountnumber=" + accountnumber + ", user=" + user + ", deposite=" 
			+ ", getDeposite()=" + ", getAccountnumber()=" + getAccountnumber() + ", getUser()="
			+ getUser() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


	
}
