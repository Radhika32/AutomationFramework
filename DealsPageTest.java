package com.crm.qa.testcases;

import com.crm.qa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import static com.crm.qa.base.BaseTest.initialization;

public class DealsPageTest extends BaseTest {
	LoginPage lp = new LoginPage();
	HomePage hp;
	DealsPage dp;

	@BeforeMethod
	public void setup() {
		initialization();
        dp= new DealsPage();
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		hp.clickDealslink();
	}

	@Test//(priority = 1)
	public void verifyDealsPageLableTest() {
		Assert.assertTrue(dp.verifyDealsPageLable(), "Deals page is displayed");
	}

	@Test//(priority = 2)
	public void verifySearchbarTest() {
		
		Assert.assertEquals(dp.verifySearchBar("Radhika c"), "Radhika ");
	}


	@AfterMethod
	public void tearDown() {

	    driver.quit();
	}

}
