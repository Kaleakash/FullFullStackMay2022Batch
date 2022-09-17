package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepositoy;
	
	public List<Product> getAllProduct() {
		return productRepositoy.findAll();
	}
	
	public String storeProduct(Product product) {
		Optional<Product> op = productRepositoy.findById(product.getPid());
		if(op.isPresent()) {
			return "Product id must be unique";
		}else {
			productRepositoy.save(product);
			return "Product details stored successfully";
		}
	}
}
