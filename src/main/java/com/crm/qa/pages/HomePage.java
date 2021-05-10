package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.sun.corba.se.spi.orbutil.fsm.Action;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="//span[contains(text(),'Abhi Patil')]")
	WebElement userNamelable;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement newContactslink;
	
	//span[contains(text(),'Contacts')]
	//body/div[@id='ui']/div[1]/div[1]/div[3]/button[1]/i[1]
	
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealslinks;
	
	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement companieslinks;
	
	
	
	///initializing the Page Objects
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	

	
	public boolean verifyCorrectUserName() {
		return userNamelable.isDisplayed();
	}
	
	
	
	public ContactsPage clickonContactslink() {
		
		contactslink.click();
       return new ContactsPage();		
	}
	
	

	public DealsPage clickonDealslink() {
		
		dealslinks.click();
       return new DealsPage();		
	}
	
	
	public CompaniesPage clickonCopanieslink() {
		
		companieslinks.click();
       return new CompaniesPage();		
	}
	
	
	public void clickOnNewContact() {
		
		Actions action=new Actions(driver);
		action.moveToElement(contactslink).build().perform();
		
		//newContactslink.click();
		
		
		
	}
	
}
