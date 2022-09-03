package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.service.OperationService;

public class OperationServiceTest {
  @Test
  public void addTest() {
	  OperationService os = new OperationService();
	  int result = os.add(100, 200);
	  Assert.assertEquals(result, 300);
  }
  @Test
  public void subTest() {
	  OperationService os = new OperationService();
	  int result = os.sub(100, 200);
	  Assert.assertEquals(result, -100);
  }
  
  @Test
  public void mulTest() {
	  OperationService os = new OperationService();
	  int result = os.mul(10, 20);
	  Assert.assertEquals(result, 200);
  }
  
  @Test
  public void divTest() {
	  OperationService os = new OperationService();
	  int result = os.div(1000, 200);
	  Assert.assertEquals(result, 5);
  }
}

