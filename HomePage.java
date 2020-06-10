package com.crm.qa.pages;

import com.crm.qa.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseTest;

public class HomePage extends BaseTest {

	
	@FindBy(xpath="//span[contains(text(),'Radhika c')]")
	WebElement namelabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasklink;
	@FindBy(xpath="//button[@class='ui linkedin button' and contains(text(),'New')]")
	WebElement newcontact;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();

	}
	
	public String validateHomePageNameLable() {
		return namelabel.getText();
		// driver.getTitle();

	}
	
	public ContactPage clickContactslink() {
		contactslink.click();
		return new ContactPage();
		
	} 
	public DealsPage clickDealslink() {
		dealslink.click();
		return new DealsPage();
		
	} 

	
	public void newContactLink() {

	    newcontact.click();
	}
	
}
