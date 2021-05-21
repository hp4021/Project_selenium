package com.selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) throws AWTException {
		System.setProperty("wedriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
	Actions ac =new Actions(driver)	;
		ac.contextClick(gmail).build().perform();
	
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}

}
