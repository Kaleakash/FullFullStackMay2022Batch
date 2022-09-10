package com;

import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DemoTest {

	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	System.out.println("Driver loaded successfully");
	
	
	WebDriver wd = new ChromeDriver();
	wd.get("C:\\Users\\LENOVO\\OneDrive\\Desktop\\chromedriver_win32\\index.html");
	
	  
	//wd.get("https://www.google.com");
	//WebDriver wd = new EdgeDriver();
//	String url	=  wd.getCurrentUrl();
//	String title = wd.getTitle();
//	String pageSource = wd.getPageSource();
//	System.out.println(url);
//	System.out.println(title);
//	System.out.println(pageSource);
	WebElement we1			= 	wd.findElement(By.tagName("h1"));
	List<WebElement> listOfPTag	= 	wd.findElements(By.tagName("p"));
	WebElement we3			= 	wd.findElement(By.id("d2"));
	WebElement we4 = wd.findElement(By.className("dd"));
	System.out.println(we1.getText());
	System.out.println(we3.getText());
	System.out.println(listOfPTag.size());
	Iterator<WebElement> li = listOfPTag.iterator();
	while(li.hasNext()) {
		WebElement w = li.next();
		System.out.println(w.getText());
	}
	System.out.println(we4.getTagName()+"-->"+we4.getText());
	wd.close();
	}

}
