package com.nitish.dao;

import java.util.List;

import com.nitish.model.Product;

public interface ProductDao {

	//public List<Product> getFilteredData(Product product);
	// List<Product> getAllProducts();
// Product getProductById(int productId);

	public List<Product> getAllProducts();

	public Product getProductById(String productId);

	public Product getProductByBrand(String productbrand);
	
	
}
