package com.sel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public static WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}
 
	 @FindBy(xpath="(//a[@title='Women'])[1]")
	private WebElement women;
	 @FindBy(xpath="(//a[@title='T-shirts'])[1]")
	 private WebElement tshirts;
	 @FindBy(xpath="//img[@itemprop='image']")
	 private WebElement img;
	 @FindBy(linkText = "Add to cart")
	 private WebElement add;
	 @FindBy(xpath="//a[@title='Proceed to checkout']")
	 private WebElement proceed;
	 @FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	 private WebElement summary;
	 @FindBy(xpath = "(//button[@type='submit'])[2]")
	 private WebElement address1;
	 @FindBy(xpath ="//input[@value='1']" )
	 private WebElement check;
	 @FindBy(name="processCarrier")
	 private WebElement shipping;
	 @FindBy(xpath = "//a[@class='bankwire']")
	 private WebElement payment;
	 @FindBy(xpath ="(//button[@type='submit'])[2]" )
	 private WebElement confirm;
	 public WebElement getTshirts() {
		return tshirts;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	
	
	public WebElement getWomen() {
		return women;
	}
	
	
	
	
	
	}
	





