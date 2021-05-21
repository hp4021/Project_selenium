package com.sel.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Project2 extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		browserlaunch("chrome");
Loginpage log = new Loginpage(driver);

	
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();


	WebElement pass = driver.findElement(By.name("passwd"));
	pass.sendKeys("hari1234");
	WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
	submit.click();
	
	WebElement women = driver.findElement(By.xpath("(//a[@title='Women'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(women).build().perform();
	
	WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
	tshirt.click();
	WebElement img = driver.findElement(By.xpath("//img[@itemprop='image']"));
	Actions act1= new Actions(driver);
	act1.moveToElement(img).build().perform();

	WebElement add = driver.findElement(By.linkText("Add to cart"));
	add.click();
    Thread.sleep(5000);
	 WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	 proceed.click();
	WebElement summary = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));

	summary.click();
	WebElement address1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	address1.click();
	WebElement check = driver.findElement(By.xpath("//input[@value='1']"));
	check.click();
	WebElement shipping = driver.findElement(By.name("processCarrier"));
	shipping.click();
	WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
	payment.click();
	WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	confirm.click();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\screenshot\\shopping.png");
	FileUtils.copyFile(source,destination);
	
	
	}
	
	
}
