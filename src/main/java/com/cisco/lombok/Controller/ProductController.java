package com.cisco.lombok.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.lombok.Entity.Product;
import com.cisco.lombok.Repository.ProductRepo;




@RestController
public class ProductController {
	@Autowired
	private ProductRepo pr;
	@PostMapping("SaveProduct")
	public Product saveproduct(@RequestBody Product product)
	{
		Product p=pr.save(product);
		System.out.println(p);
		return p;
	}
}
