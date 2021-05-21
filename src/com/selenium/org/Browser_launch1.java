package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/login");
WebElement log = driver.findElement(By.className("form-control mobileNumberInput"));
log.click();
log.sendKeys("9094386536");
		

	}

}
