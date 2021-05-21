package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoframes {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	WebElement iframe = driver.findElement(By.id("singleframe"));
    driver.switchTo().frame(iframe);
	
	WebElement iframeinput = driver.findElement(By.xpath("//input[@type='text']"));
	iframeinput.sendKeys("hari");
	driver.switchTo().defaultContent();
	
	
	WebElement nested = driver.findElement(By.linkText("Iframe with in an Iframe"));
	nested.click();
	WebElement oframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(oframe);
	WebElement innframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innframe);
	WebElement nestedinp = driver.findElement(By.xpath("//input[@type='text']"));
	nestedinp.sendKeys("hariprasad");
	driver.switchTo().defaultContent();
	Thread.sleep(4000);
	WebElement more = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[7]"));
	more.click();
	
	}
	
	}
