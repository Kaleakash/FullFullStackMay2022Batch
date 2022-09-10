package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DemoTest {
WebDriver driver;

  @Test
  public void indexPageTest() {
	  WebElement we1 = driver.findElement(By.tagName("h1"));
	  Assert.assertEquals(we1.getText(),"Welcome to Simple Web Application Testing using Selenium");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
System.setProperty("webdriver.edge.driver", "C:\\Users\\LENOVO\\OneDrive\\Desktop\\chromedriver_win32\\edgedriver_win64\\msedgedriver.exe");
//	driver = new ChromeDriver();
driver = new EdgeDriver();
	driver.get("C:\\Users\\LENOVO\\OneDrive\\Desktop\\chromedriver_win32\\index.html");
  }

  @AfterMethod
  public void afterMethod() {
	  try {
	  driver.close();
	  }catch(Exception e) {}
  }

}
