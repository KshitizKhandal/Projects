package com.bank_project.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column
	String pancard;

	@Column
	String username;

	@Column
	String address;
	@Column
	int age;
	@Column
	String userbranch;
	@ManyToMany
	List<Employee> employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserbranch() {
		return userbranch;
	}

	public void setUserbranch(String userbranch) {
		this.userbranch = userbranch;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pancard=" + pancard + ", username=" + username + ", address=" + address + ", age="
				+ age + ", userbranch=" + userbranch + ", employee=" + employee + ", getId()=" + getId()
				+ ", getPancard()=" + getPancard() + ", getUsername()=" + getUsername() + ", getAddress()="
				+ getAddress() + ", getAge()=" + getAge() + ", getUserbranch()=" + getUserbranch() + ", getEmployee()="
				+ getEmployee() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public User(int id, String pancard, String username, String address, int age, String userbranch,
			List<Employee> employee) {
		super();
		this.id = id;
		this.pancard = pancard;
		this.username = username;
		this.address = address;
		this.age = age;
		this.userbranch = userbranch;
		this.employee = employee;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}