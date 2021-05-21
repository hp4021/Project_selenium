package com.sel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUppage {
public static WebDriver driver;	
public SignUppage(WebDriver driver) {
	this.driver=driver;
PageFactory.initElements(driver,this);	
}
@FindBy(name="customer_lastname")
private WebElement lastname;
public WebElement getLastname() {
	return lastname;
}
@FindBy(name="customer_firstname")
private WebElement firstname;


public WebElement getFirstname() {
	return firstname;
}
@FindBy(xpath="//label[@class='top']")
	private WebElement gender;

	public WebElement getGender() {
	return gender;
}
	@FindBy(xpath="//a[@class='login'])")
	private WebElement signin;
	public WebElement getSignin() {
		return signin;
	}
	@FindBy(name="email_create")
	private WebElement maildeta;
	public WebElement getMaildeta() {
		return maildeta;
	}
	@FindBy(id="SubmitCreate")
    private WebElement create;
	public WebElement getCreate() {
		return create;
	}
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	public WebElement getPass() {
		return pass;
	}
	@FindBy(id="days")
	private WebElement day;
	
	public WebElement getDay() {
		return day;
	}
	@FindBy(id ="months" )
	private WebElement month;
	public WebElement getMonth() {
		return month;
	}
	@FindBy(id ="years")
	private WebElement year;
	@FindBy(name = "newsletter")
	private WebElement subsc;
	@FindBy(id="company")
	private WebElement company;
	@FindBy(id ="address1" )
	private WebElement address1;
	@FindBy(id ="address2" )
	private WebElement address2;
	@FindBy(name = "city")
	private WebElement city;
	@FindBy(name = "id_state")
	private WebElement state;
	@FindBy(name = "postcode")
	private WebElement zip ;
	@FindBy(id ="phone_mobile" )
	private WebElement mobile;
	@FindBy(name = "alias")
	private WebElement refrence;
	@FindBy(id ="submitAccount" )
	private WebElement submit;
	
	public WebElement getYear() {
		return year;
	}
	public WebElement getSubsc() {
		return subsc;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getAddress2() {
		return address2;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getZip() {
		return zip;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getRefrence() {
		return refrence;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
}
