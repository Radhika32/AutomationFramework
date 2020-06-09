package com.crm.qa.testcases;

import com.crm.qa.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IConfigurable;
import org.testng.TestNGUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TaskPage;
import com.crm.qa.utils.TestUtil;

import java.awt.*;
import java.util.logging.LogManager;

import static java.lang.System.getProperty;

public class HomePageTest extends BaseTest{
	LoginPage lp;
	HomePage hp;
	ContactPage cp;
    DealsPage dp;
	TaskPage tp;
	TestUtil testUtil;
    private Object IConfigurable;

    private LoginPage getLp() {
        return lp;
    }

    @BeforeMethod
	public void setup() {
		
		initialization();
		
		lp = new LoginPage();
		cp = new ContactPage();
		dp=new DealsPage();
		tp=new TaskPage();
        LogManager prop = (LogManager) IConfigurable;
        hp = lp.login(prop.getProperty("emailid"), prop.getProperty("password"));
        Assert.assertEquals(prop.getProperty ("emailid"),prop.getProperty("password"));

	}

	@Test//(priority = 1)
	public void verifyHomePageTitleTest() {
		String hpTitle = hp.validateHomePageTitle();
		Assert.assertEquals(hpTitle, "Cogmento CRM", "Your Business cloud partner");

	}

	@Test
	public void verifyHomePageNameLabel() {
		String hpNameLabel = hp.validateHomePageNameLable();
		Assert.assertEquals(hpNameLabel, "Radhika c", "HP NameLabel not matched");
	}

	@Test
	public void verifyContactPageLinkTest() {

        cp = hp.clickContactslink();
	}
	
	@Test
	public void verifyDealsPageLinkTest() {
		dp = hp.clickDealslink();
	}

	@AfterMethod
	public void teardown() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.freecrm.com/contacts");

        driver.quit();
	}

}
