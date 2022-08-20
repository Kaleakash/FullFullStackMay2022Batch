package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin				// eanable Cross origin features to call rest api
public class ProductController {

	@Autowired
	ProductService productService;
	
	//@RequestMapping("product",method=RequestMethod.GET)
	
	// http://localhost:8080/product/findAllProduct
	
	@GetMapping(value = "findAllProduct",produces = MediaType.APPLICATION_JSON_VALUE)		
	public List<Product> findAllProduct(){
		return productService.findAllProduct();
	}
	
	// http://localhost:8080/product/storeProduct
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductDetails(@RequestBody Product product) {
		return productService.storeProduct(product);
	}
	
	// http://localhost:8080/product/updateProduct
	@PutMapping(value = "updateProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProductDetails(@RequestBody Product product) {
		return productService.updateProductDetails(product);
	}
	
	// http://localhost:8080/product/deleteProduct/100
	
	@DeleteMapping(value = "deleteProduct/{pid}")
	public String deleteProductDetails(@PathVariable("pid") int pid) {
		return productService.deleteProductDetails(pid);
	}
}
