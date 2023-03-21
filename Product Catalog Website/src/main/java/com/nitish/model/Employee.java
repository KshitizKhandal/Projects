package com.nitish.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;

import org.springframework.data.web.JsonPath;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstname;
	private String lastname;
	private String userName;

	private String email;

	//@Pattern(regexp="^[a-zA-Z0-9]{8}",message="length must be 8")  
	private String password;
	//@MapsId
	@Transient
	private String confirmPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Employee(int id, String firstname, String lastname, String userName, String email, String password,
			String confirmPassword) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", userName=" + userName
				+ ", email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

	
	

}
