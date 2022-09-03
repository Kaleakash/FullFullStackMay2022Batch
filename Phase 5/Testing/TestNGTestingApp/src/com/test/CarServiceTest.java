package com.test;

import org.testng.annotations.Test;

public class CarServiceTest {

  @Test
  public void carColorTest() {
    System.out.println("Car color testing");
  }

  @Test(groups = {"loan"})
  public void carLoanTest() {
    //throw new RuntimeException("Test not implemented");
	  System.out.println("Car loan testing");
  }

  @Test
  public void carSpeedTest() {
   // throw new RuntimeException("Test not implemented");
	  System.out.println("car speed testing");
  }
}
