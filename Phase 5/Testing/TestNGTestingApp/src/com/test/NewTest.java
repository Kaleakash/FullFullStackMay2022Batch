package com.test;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 3)
  public void a() {
	  System.out.println("a function testing");
  }
  
  @Test(priority = 1)
  public void e() {
	  System.out.println("e function testing");
  }
  
  @Test(priority = 4)
  public void b() {
	  System.out.println("b function testing");
  }
  @Test(priority = 2)
  public void d() {
	  System.out.println("d function testing");
  }
  @Test(priority = 1)
  public void c() {
	  System.out.println("c function testing");
  }
}
