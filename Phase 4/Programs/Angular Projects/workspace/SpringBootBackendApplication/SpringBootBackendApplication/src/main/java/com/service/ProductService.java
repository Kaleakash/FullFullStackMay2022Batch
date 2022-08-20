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
	ProductRepository productRepository;
	
	public String storeProduct(Product product) {
		Optional<Product> op = productRepository.findById(product.getPid());
		if(op.isPresent()) {
			return 	"Product id must be unique";
		}else {
			productRepository.save(product);
			return "Product record saved successfully";
		}
	}
	public String updateProductDetails(Product product) {
		Optional<Product> op = productRepository.findById(product.getPid());
		if(op.isPresent()) {
			Product p = op.get();
			p.setPrice(product.getPrice());
			p.setUrl(product.getUrl());
			productRepository.saveAndFlush(p);
			return 	"Product details updated successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String deleteProductDetails(int pid) {
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
			productRepository.delete(p);
			return 	"Product details deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
}
