package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Angadi {
	public static void main(String[] args)throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		signin.click();
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("9094386536");
	
        WebElement login = driver.findElement(By.id("continue"));
		login.click();
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("hari8247");
		WebElement sign = driver.findElement(By.id("signInSubmit"));
		sign.click();
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\screenshot\\amazon1.png");
		FileUtils.copyFile(source,destination);
		
	}	
}
