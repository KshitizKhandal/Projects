package com.nitish.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "productcode")
	private String productcode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductbrand() {
		return productbrand;
	}

	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	public Product(Long id, String productcode, String productname, String productbrand, String url, String longDesc) {
		super();
		this.id = id;
		this.productcode = productcode;
		this.productname = productname;
		this.productbrand = productbrand;
		this.url = url;
		this.longDesc = longDesc;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", productcode=" + productcode + ", productname=" + productname + ", productbrand="
				+ productbrand + ", url=" + url + ", longDesc=" + longDesc + "]";
	}



	@Column(name = "productname")
	private String productname;

	@Column(name = "productbrand")
	private String productbrand;

	@Column(name = "url")
	private String url;

	@Column(name = "long_desc")
	@Type(type = "text")
	private String longDesc;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
