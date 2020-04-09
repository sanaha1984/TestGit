package com.SBPoc.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SBPoc.api.dao.ProductRepository;
import com.SBPoc.api.model.Product;
@RestController
public class ProductController {

	
	@Autowired
	private ProductRepository repository;
	
	
	
	@PostMapping("/saveRecords")
	public String saveRecords(@RequestBody List<Product> products) {
		repository.saveAll(products);
		return products.size()+ "product information saved successfully";
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(){
		/*List<Product> productdetails=new ArrayList<Product>(); 
		productdetails=(ArrayList<Product>)repository.findAll();
		
		 * System.out.println("records returns ---"+productdetails.size()); for(Product
		 * p1:productdetails) { System.out.println("id no--"+p1.getProductKy());
		 * System.out.println("Name--"+p1.getProductName()); }
		 */
	return	(List<Product>)repository.findAll();
	}
}
