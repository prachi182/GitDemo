package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase
{
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contactsLabel;
	
	@FindBy(xpath="//td//a[contains(.,'Prachi Dhanotiya')]")
	WebElement nameLabel;
	

	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyContactsLabel()
	{
		return contactsLabel.isDisplayed();
	}
	
	public String verifyLabelName()
	{
		return nameLabel.getText();
	}


}
