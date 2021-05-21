package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		WebElement maildeta = driver.findElement(By.name("email_create"));
		maildeta.sendKeys("hp4021@gmail.com");

		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		Thread.sleep(5000);

		WebElement gender = driver.findElement(By.xpath("//label[@class='top']"));
		gender.click();
		WebElement firstname = driver.findElement(By.name("customer_firstname"));
		firstname.sendKeys("hari");
		WebElement lastname = driver.findElement(By.name("customer_lastname"));
		lastname.sendKeys("prasad");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("hari1234");
		WebElement day = driver.findElement(By.id("days"));
		Select d = new Select(day);
		d.selectByValue("30");
		WebElement month = driver.findElement(By.id("months"));
		Select d1 = new Select(month);
		d1.selectByIndex(11);
		WebElement year = driver.findElement(By.id("years"));
		Select d2 = new Select(year);
		d2.selectByValue("1993");
        WebElement subsc = driver.findElement(By.name("newsletter"));
        subsc.click();
        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("green tech");
       WebElement address1 = driver.findElement(By.id("address1"));
       address1.sendKeys("door no 24");
        WebElement address2 = driver.findElement(By.id("address2"));
        address2.sendKeys("linchon north street");
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Los angels");
        WebElement state = driver.findElement(By.name("id_state"));
        Select d3 = new Select(state);
        d3.selectByIndex(5);
        WebElement zip = driver.findElement(By.name("postcode"));
        zip.sendKeys("90001");
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.sendKeys("9094386536");
        WebElement refrence = driver.findElement(By.name("alias"));
        refrence.sendKeys(" home");
        WebElement submit = driver.findElement(By.id("submitAccount")); 
        submit.click();
        
	}

}
