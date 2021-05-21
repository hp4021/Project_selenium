package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement create = driver.findElement(By.xpath("//a[@rel='async']"));
		create.click();
		Thread.sleep(5000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("hari");

		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("hari@gmail");
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("hari8247");
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByValue("25");
		WebElement month = driver.findElement(By.id("month"));
		Select s3 = new Select(month);
		s3.selectByValue("12");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByValue("1993");
		Thread.sleep(2000);
		WebElement sex = driver.findElement(By.xpath("//span[@ class='_5k_2 _5dba'][2]"));
		sex.click();
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
	}

}
