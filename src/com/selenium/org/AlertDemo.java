package com.selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe" );
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	simple.click();
	
	Alert simpalert = driver.switchTo().alert();
	simpalert.dismiss();;
	Thread.sleep(2000);
	
	WebElement confirmbutton = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	confirmbutton.click();
	WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	confirm.click();
	Alert calert = driver.switchTo().alert();
	calert.dismiss();
	Thread.sleep(5000);
	
	
	WebElement prompt = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
	prompt.click();
	WebElement prtbutt = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	prtbutt.click();
	Alert prtalert = driver.switchTo().alert();
	prtalert.sendKeys("demo tester");
	prtalert.dismiss();;
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
}
