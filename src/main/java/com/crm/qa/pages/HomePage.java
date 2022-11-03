package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[@class='header item']")
	WebElement logo;

	@FindBy(className = "user-display")
	WebElement userNameLabel;

	@FindBy(xpath = "(//span[@class='item-text'])[3]")
	WebElement contactsLink;

	@FindBy(xpath = "(//span[@class='item-text'])[5]")
	WebElement dealsLink;

	@FindBy(xpath = "(//span[contains(text(),'Tasks')]")
	WebElement tasksLink;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean crmLogoImgTest() {
		return logo.isDisplayed();

	}
	
	public boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
	}

	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}

	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}

	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}

}
