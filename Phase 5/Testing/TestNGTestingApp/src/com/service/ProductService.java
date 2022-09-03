package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {
 List<Product> listOfProduct;
  public ProductService() {
	  listOfProduct =new ArrayList<Product>();
	  listOfProduct.add(new Product(1, "TV", 56000));
	  listOfProduct.add(new Product(2, "Computer", 58000));
	  listOfProduct.add(new Product(3, "Laptop", 88000));
	  listOfProduct.add(new Product(4, "Mobile", 45000));
  }

  public Product findProduct(int pid) {
//	  Iterator<Product> ll = listOfProduct.iterator();
//	  while(ll.hasNext()) {
//		  Product p = ll.next();
//		  if(p.getPid()==pid) {
//			  return p;
//		  }
//	  }
//	  return null;  
	  return listOfProduct.stream().filter(pp->pp.getPid()==pid).findAny().get();
  }
  public List<Product> getAllProducts() {
	  return listOfProduct;
  }
  public String addProduct(Product p) {
//	  int temp=0;
//	  Iterator<Product> ll = listOfProduct.iterator();
//	  while(ll.hasNext()) {
//		  Product pp = ll.next();
//		  if(pp.getPid()==p.getPid()) {
//			  temp++;
//		  }
//	  }
//	  if(temp==0) {
//		  listOfProduct.add(p);
//		  return "successfully added";
//	  }else {
//		  return "Product id must be unique";
//	  }
	  boolean result = listOfProduct.stream().filter(pp->pp.getPid()==p.getPid()).findAny().isPresent();
	  if(result){
		  return "Product id must be unique";
	  }else {
		  listOfProduct.add(p);
		  return "successfully added";
	  }
  }
  
}
