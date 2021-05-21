package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch2 {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 
		 WebElement ctrbtn = driver.findElement(By.xpath("(//a[contains(@class,'_42ft _')])[3]"));
		 ctrbtn.click();
	} 
	

}
