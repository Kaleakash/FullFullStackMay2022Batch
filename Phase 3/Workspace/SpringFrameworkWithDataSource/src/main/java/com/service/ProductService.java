package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service      // Service layer annotation 
public class ProductService {

	@Autowired
	ProductDao productDao;				// pull the Dao layer class object 
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "Product price must be > 1000";
		}else if(productDao.insertProductInfo(product)>0) {
			return "Product record stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	public List<Product> getAllProducts(){
		return productDao.getAllProduct();
	}
	
	
}
