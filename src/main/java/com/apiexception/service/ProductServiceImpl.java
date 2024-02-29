package com.apiexception.service;

import org.springframework.stereotype.Service;
import com.apiexception.entity.Product;
import com.apiexception.exception.ProductNotFoundException;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product findProductById(Integer pId) {
		if (pId == 101) {
			return new Product(101, "KeyBoard", 800.00);
		} else {
			throw new ProductNotFoundException("Product Is Not Available With Such Id..");
		}
	}

}
