package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement multiselect = driver.findElement(By.id("multi-select"));
		
		Select s =new Select(multiselect);
		boolean multiple = s.isMultiple();
		System.out.println("is multiple  ??"+multiple);
		
		System.out.println("***all options");
		List<WebElement> options = s.getOptions();
		for (WebElement alloptions : options) {
			String text = alloptions.getText();
			System.out.println(text);
			
		}
		int size = options.size();
		System.out.println("size of multy"+ size);
		
		
		for (int i = 0; i <= size; i++) {
			if (i==5||i==3||i==7) {
				s.selectByIndex(i);
				
			}
			
		}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allselected : allSelectedOptions) {
			System.out.println(allselected.getText());
			
		}
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		
		
		
	}
	

}
