package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// define page factory or object repo.
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")
	WebElement LoginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	
	
	
	///initializing the Page Objects
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	// Action 
	
	public String validateLoginPage() {
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd) {
		
		email.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		
		return new HomePage();
		
		
	}
	
}
