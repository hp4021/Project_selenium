package com.selenium.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkat_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/clothing-and-accessories/ethnic-wear/kurtas/men-kurtas/pr?sid=clo,cfv,cib,jks&otracker=categorytree&otracker=nmenu_sub_Men_0_Kurta");

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

List<WebElement> alltshirtprice = driver
         .findElements(By.xpath("//div[@class='_3I9_wc']//preceding-sibling::div"));
List<Integer> pricelist = new ArrayList<Integer>();
	for (int i = 0; i < alltshirtprice.size(); i++) {
		
		 String prices = alltshirtprice.get(i).getText();
		 
		int value = Integer.parseInt(prices);
		
		pricelist.add(value);
		
	}
	System.out.println(pricelist);
	int size = pricelist.size();
	System.out.println("size:"+size);
	System.out.println("minimum value:"+Collections.min(pricelist));
	
	

			
}
}