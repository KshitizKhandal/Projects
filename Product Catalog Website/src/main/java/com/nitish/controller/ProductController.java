package com.nitish.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nitish.dao.ProductDao;
import com.nitish.model.Employee;
import com.nitish.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDao productDao;

	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public ModelAndView getAllProducts() {
		List<Product> products = productDao.getAllProducts();
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext()) {
			System.out.println(String.valueOf(itr.next()));
		}
		return new ModelAndView("productList", "products", products);
	}
	
	
	@RequestMapping(value = "/getAllProd", method = RequestMethod.GET)
	public List<Product> getAllProd() {
		List<Product> products = productDao.getAllProducts();
		System.out.println("All product List:"+products);
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext()) {
			System.out.println(String.valueOf(itr.next()));
		}
		return products;
	}
	
	@RequestMapping(value = "/home/search/{productId}", method = RequestMethod.GET)
	public ModelAndView getProductById(@RequestParam("productId") String productId, Model m) {
		Product product = productDao.getProductById(productId);
		
		System.out.println(String.valueOf(product));	
		return new ModelAndView("search", "product", product);	
	}
	@RequestMapping(value = "{pincode}", method = RequestMethod.GET)
	public ModelAndView getPincode(@RequestParam("pincode") String productId, Model m) {
		Product product = productDao.getProductById(productId);
		
		System.out.println(String.valueOf(product));	
		return new ModelAndView("search", "product", product);	
	}
//	@RequestMapping(value = "/home/search/{productbrand}", method = RequestMethod.GET)
//	public ModelAndView getProductById(@RequestParam("productbrand") String productbrand, Model m) {
//		Product product = productDao.getProductByBrand(productbrand);
//		
//		System.out.println(String.valueOf(product));	
//		return new ModelAndView("search", "product", product);	
//	}
	
//	
//	@GetMapping("/home/search/{productId}")
//	public ModelAndView getProductById(@PathVariable(value = "productId") long productId , HttpServletResponse response) {
//		Product product = productDao.getProductById(productId);
//		
//		System.out.println(String.valueOf(product));
//		ModelAndView m = new ModelAndView();
//		return new ModelAndView("search", "product", product);	
//		}
}
