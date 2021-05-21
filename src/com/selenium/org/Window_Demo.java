package com.selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Demo {
public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.amazon.in/");
	
	Actions ac = new Actions(driver);
	Robot r= new Robot();
	
	WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
	ac.contextClick(mobiles).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement today = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
	ac.contextClick(today).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement best = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
	ac.contextClick(best).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement fashion = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
	ac.contextClick(fashion).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Set<String> windowHandles = driver.getWindowHandles();
	for (String allID : windowHandles) {
		String title = driver.switchTo().window(allID).getTitle();
		System.out.println(title);
	}
	String actualtitle="Amazon.in Today's Deals: Great Savings. Every Day.";
	for (String actualId : windowHandles) {
		if (driver.switchTo().window(actualId).getTitle().equals(actualtitle)) {
			break;
			
		}
		driver.close();
		
	}
	driver.quit();
	
}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

