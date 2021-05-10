package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtilTime;

public class ContactsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtilTime testUtil;
	String sheetName = "Contacts";

	public ContactsPageTest() {

		super();
	}

	@BeforeMethod
	public void setUp() {
    	initialization();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage = homePage.clickonContactslink();

	}

	@Test(priority = 1)
	public void verifyContactsPageLabel() {
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is missing on Page");

	}

	@Test(priority = 2)
	public void selectContactsTest() {

		contactsPage.selectContacts();

	}

	@DataProvider
	public Object[][] getCRMTestData() {

		Object data[][] = testUtil.getTestData(sheetName);
		return data;

	}

	@Test(priority = 3, dataProvider = "getCRMTestData")

	public void validateCreatNewContact(String firstName, String midName, String lastName) {
		homePage.clickOnNewContact();
		contactsPage.ClickCreateBtn();
		contactsPage.createNewContact(firstName, midName, lastName);

	}

	@AfterMethod

	public void teraDown() {
		driver.quit();
	}

}
