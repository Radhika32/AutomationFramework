package com.crm.qa.testcases;
import java.lang.String;
import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.System.getProperty;
import static org.openqa.selenium.By.xpath;

public class LoginPageTest extends BaseTest  {
	LoginPageTest lp;
	HomePage hp;
ContactPage cp;
DealsPage dp;
TaskPage tp;
    private Object NullPointerException;


    @BeforeMethod
	public void setup() {
		initialization();

        lp= new LoginPageTest();
        cp = new ContactPage();
        dp=new DealsPage();
        tp=new TaskPage();

        hp = lp.loginTest(prop.getProperty("emailid"), prop.getProperty("password"));
        Assert.assertEquals(getProperty("username" ),getProperty ("password"),getProperty("Login"));


    }

	@Test()
	public void loginPageTitle() {
		HomePage title = lp.validateLoginPage(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
@Test
    private HomePage validateLoginPage(String username, String password) throws NullPointerException {

        driver.findElement(xpath("//input[@type='text'][@name='emailid']")).sendKeys("username");
    driver.findElement(xpath("//input[@type='password'][@name='password']")).sendKeys("password");
    return loginTest(prop.getProperty("emailid"), prop.getProperty("password"));
}

    @Test()
	public HomePage loginTest(String emailid, String password) {
		hp = lp.validateLoginPage (prop.getProperty("username"), prop.getProperty("password"));
        Assert.assertEquals( getProperty ("username"),prop.getProperty("password"));

        return new HomePage();
    }

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

