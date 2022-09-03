package com.test;

import org.testng.annotations.Test;

public class BikeServiceTest {

  @Test
  public void bikeColorTest() {
    //throw new RuntimeException("Test not implemented");
	  System.out.println("Bike color testing");
  }

  @Test(groups = {"loan"})
  public void bikeLoanTest() {
    //throw new RuntimeException("Test not implemented");
	  System.out.println("Bike loan testing");
  }

  @Test
  public void bikeSpeedTest() {
    //throw new RuntimeException("Test not implemented");
	  System.out.println("Bike speed testing");
  }
}
