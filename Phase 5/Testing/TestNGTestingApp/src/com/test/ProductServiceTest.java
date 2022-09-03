package com.test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.service.Product;
import com.service.ProductService;

public class ProductServiceTest {

	ProductService ps;
	ProductServiceTest() {
		ps = new ProductService();
	}
  @Test
  public void addProductTest() {
  //  throw new RuntimeException("Test not implemented");
	  Product p = new Product(6, "Pen Drive", 1500);
	 // ProductService ps = new ProductService();
	  String msg	= ps.addProduct(p);
	  assertEquals(msg, "successfully added");
  }

  @Test
  //@Ignore
  public void findProductTest() {
//    throw new RuntimeException("Test not implemented");
	 // ProductService ps = new ProductService();
	  Product p = ps.findProduct(1);
	  Assert.assertNotNull(p);
	  Assert.assertEquals(p.getPname(), "TV");
  }

  @Test
  //@Ignore
  public void getAllProductsTest() {
  //  throw new RuntimeException("Test not implemented");
	 // ProductService ps = new ProductService();
	  List<Product> listOfProduct = ps.getAllProducts();
	  assertEquals(listOfProduct.size(), 5);
	  Product p = listOfProduct.get(1);
	  assertEquals(p.getPid(), 2);
	  assertEquals(p.getPname(), "Computer");
	  assertEquals(p.getPrice(), 58000);
  }
}
