package com.sel.org;

import org.openqa.selenium.WebDriver;

public class Myproject1 extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		browserlaunch("chrome");
		geturl("http://automationpractice.com/index.php");
		SignUppage sg = new SignUppage(driver);
		Loginpage lg = new Loginpage(driver);

		clickOnElement(sg.getSignin());
		inputvalue(sg.getMaildeta(), "hp356@gmail.com");
		clickOnElement(sg.getCreate());
		Thread.sleep(5000);
		clickOnElement(sg.getGender());
		inputvalue(sg.getFirstname(), "hari");
		inputvalue(sg.getLastname(), "prasad");
		inputvalue(sg.getPass(), "hari1234");
		dropdowns(sg.getDay(), "option", "index", "12");
		dropdowns(sg.getMonth(), "option", "text", "march");
		dropdowns(sg.getYear(), "option", "value", "1993");
		clickOnElement(sg.getSubsc());
		inputvalue(sg.getCompany(), "green tech");
		inputvalue(sg.getAddress1(), "door no23");
		inputvalue(sg.getAddress2(), "north lincoln street");
        inputvalue(sg.getCity(), "los angels");
		dropdowns(sg.getState(), "option", "text", "California");
		inputvalue(sg.getZip(), "90001");
		inputvalue(sg.getMobile(), "9094386536");
		inputvalue(sg.getRefrence(), "home");
		clickOnElement(sg.getSubmit());
		
		action(lg.getWomen());
		clickOnElement(lg.getTshirts());
		action(lg.getImg());
		clickOnElement(lg.getAdd());
		Thread.sleep(5000);
		clickOnElement(lg.getProceed());
		clickOnElement(lg.getSummary());
		clickOnElement(lg.getAddress1());
		clickOnElement(lg.getCheck());
		clickOnElement(lg.getShipping());
		clickOnElement(lg.getPayment());
		clickOnElement(lg.getConfirm());
		takeScreenshot();

	}
}
