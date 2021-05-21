package com.sel.org;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	
public static void clickOnElement(WebElement element) {
	element.click();

}	
public static void inputvalue(WebElement element,String str) {
	element.sendKeys(str);

}	
public static void Isselected(WebElement element) {
	element.isSelected();

}	


public static WebDriver browserlaunch(String browser) {
	if (browser.equalsIgnoreCase("chrome")) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\driver\\chromedriver.exe");
	  driver= new ChromeDriver();
	}
	else
	{
		System.out.println("invalid");
	}
driver.manage().window().maximize();
return driver;
}	
public static void navigateto(String url) {
	driver.navigate().to("");

}
public static void navigateback() {
driver.navigate().back();	

}
public static void navigateforward() {
	driver.navigate().forward();

}	

public static void geturl(String url) {
driver.get(url);

}
public static void getTitles(WebElement element) {
driver.getTitle();

}

public static void dropdowns(WebElement element,String option,String value,String input) {
Select s = new Select(element);
if (option.equals("index")) {
	int parseInt = Integer.parseInt(input);
	s.selectByIndex(parseInt);
}else if (option.equals("value")) {
	s.selectByValue(input);
}
else if (option.equals("text")) {
	s.selectByVisibleText(input);
	
}	
}
public static void quit() {
	driver.quit();

}
public static void close() {
	driver.close();

}
public static void frames() {
	driver.switchTo().frame(0);

}
public static void refresh() {
	driver.navigate().refresh();

}
public static void takeScreenshot() throws Exception {
	TakesScreenshot ts = (TakesScreenshot) driver;
   File srcfile = ts.getScreenshotAs(OutputType.FILE);
   File destfile= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Project_Selenium\\screenshot\\screen.png");
   FileUtils.copyFile(srcfile, destfile);
}
public static void action(WebElement element) {
	Actions ac =new Actions(driver);
ac.moveToElement(element);
}







}
