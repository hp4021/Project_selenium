package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.facebook.com/");
	
	driver.navigate().back();
	
	String title = driver.getTitle();
	
	System.out.println("title:"+title);
	
	driver.navigate().refresh();
	
	driver.quit();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
