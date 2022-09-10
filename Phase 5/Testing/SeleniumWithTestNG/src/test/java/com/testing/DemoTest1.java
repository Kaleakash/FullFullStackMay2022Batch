package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DemoTest1 {
	WebDriver driver;
	
@Test
  public void googlePageTest() {
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2)); 
	String title = driver.getTitle();
	 Assert.assertEquals(title, "Google");
	 WebElement we1	= driver.findElement(By.name("q"));
	 we1.sendKeys("Spring boot training");
	 WebElement wel2 = driver.findElement(By.name("btnK"));
	 wel2.click();
	 driver.navigate().back();
	 driver.navigate().forward();
  }
  @BeforeMethod
  public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");	
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com"); 
	 
	
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

}
