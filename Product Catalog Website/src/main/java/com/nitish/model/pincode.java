package com.nitish.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pincode")
public class pincode {
	public pincode(Long id, Long pincode) {
		super();
		this.id = id;
		this.pincode = pincode;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column
	Long pincode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public pincode() {
		super();
		
	}
	
	public pincode( Long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "pincode [id=" + id + ", pincode=" + pincode + "]";
	}
	
	
	
}
