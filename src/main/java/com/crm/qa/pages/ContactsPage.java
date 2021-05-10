package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
	WebElement contactslabel;

	
	// this for to select checkbox on contact page  
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/label[1]")
	WebElement SelectContactslabel;
	//tbody/tr[1]/td[1]/div[1]/label[1]
	//a[text()='Abhi XYZ']//parent::td//preceding ::div[@class='ui fitted read-only checkbox']//input[@name='id']
	
    // this method is for click on create button on contact page 
	@FindBy(xpath ="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
	WebElement ClickOnCreateBtns;

	
	// this is for to send the firstName to new cont. page
	@FindBy(name = "first_name")
	WebElement firstName;
	//input[@name='first_name']
	
	
	@FindBy(name="middle_name")
	WebElement midName;
	//input[@name='middle_name']
	
	
	
	// this for to lastName
	@FindBy(name="last_name")
	WebElement lastName;
	//input[@name='last_name']
	//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]

	// this is for save button 
	@FindBy(xpath = "//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
	WebElement saveBtn;

	/// initializing the Page Objects

	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyContactsLabel() {

		return contactslabel.isDisplayed();//this methode is for verifyContactsLabel on page

	}

	public boolean selectContacts() {

		return SelectContactslabel.isSelected();//this methode is for selectContacts thorugh checkbox on page


	}
	
	
	public void ClickCreateBtn() {
		
		ClickOnCreateBtns.click();//this methode is for ClickCreateBtn on page
		
	}

	public void createNewContact(String ftName, String ltName,String midelName) {

		firstName.sendKeys(ftName);
		midName.sendKeys(midelName);
		lastName.sendKeys(ltName);
		saveBtn.click();

	}

}
