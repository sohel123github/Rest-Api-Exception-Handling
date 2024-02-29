package com.apiexception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.apiexception.entity.Product;
import com.apiexception.service.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;

	@GetMapping("/product/{pId}")
	public ResponseEntity<Product> getProductById(@PathVariable int pId) {
		Product product = productServiceImpl.findProductById(pId);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

}
