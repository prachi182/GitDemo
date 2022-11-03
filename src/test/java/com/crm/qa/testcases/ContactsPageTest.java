package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase
{
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	ContactsPage contactspage;

	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testutil = new TestUtil();
		loginpage = new LoginPage();
		contactspage = new ContactsPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspage = homepage.clickOnContactsLink();
	}

	@Test(priority=1)
	public void verifyContactsPageLabel()
	{
		Assert.assertTrue(contactspage.verifyContactsLabel(),"contacts label is missing on the page");
	}
	@Test(priority=2)
	public void verifyLabelNameTest()
	
	{
		String labelname=contactspage.verifyLabelName();
		Assert.assertEquals(labelname, "Prachi Dhanotiya123");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
