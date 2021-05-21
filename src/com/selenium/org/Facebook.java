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

public class Facebook {
	public static void main(String[] args)throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("harinithyanandham@gmail.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("hari@amma");
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\screenshot\\facebook9.png");
		FileUtils.copyFile(source, destination);
		
		
		
	}

}
