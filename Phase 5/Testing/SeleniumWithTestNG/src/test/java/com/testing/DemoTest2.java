package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


public class DemoTest2 {

  WebDriver driver;
  @Test
  public void loginPageTest() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	  String title = driver.getTitle();
	  System.out.println(title);
	  //String userName1 = driver.findElement(By.xpath("//*[@id='email1']")).getAttribute("value");
	  //String userName2 = driver.findElement(By.id("email1")).getAttribute("value");
	  //System.out.println(userName1+"="+userName2);
	  WebElement userName = driver.findElement(By.id("email1"));
	  WebElement password = driver.findElement(By.id("pass1"));
	  userName.sendKeys("raj@gmail.com");
	  password.sendKeys("1234");
	  WebElement submitButton = driver.findElement(By.name("b1"));
	  submitButton.click();
	  Alert alert = driver.switchTo().alert();
	  String result = alert.getText();
	  try {
	  Assert.assertEquals(result, "successfully login");
	  }catch(Exception e) {}
	  alert.dismiss();
	  String currentUrl  = driver.getCurrentUrl();
  }
  @BeforeMethod
  public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("http://127.0.0.1:5500/login.html");

  }

  @AfterMethod
  public void afterMethod() {
	 driver.close();
  }

}
