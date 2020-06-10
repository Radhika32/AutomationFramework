package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
//import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import static org.testng.Assert.*;

public class ContactPageTest extends BaseTest {

    LoginPage lp;
    HomePage hp;
    ContactPage cp;

    String sheetname = "Contacts";

    public ContactPageTest() {


    }

    @BeforeMethod
    public void setup() {
        initialization();
        lp = new LoginPage();
        cp = new ContactPage();
        lp.login(prop.getProperty("username"));
       hp    = lp.login(prop.getProperty("Password"));
        hp.clickContactslink();
    }


@DataProvider()
    public Object[][] createdata()    {

                Object[][] data = new Object[0][3];
                data[1][1] = "Radhika";
                data[1][2] = "S";
                data[1][3] = "Lead";

assertEquals("createddata");
                return data;
	}

    private void assertEquals(String createddata) {
    }

    public void teardown () throws InterruptedException {
                    Thread.sleep(1000);
                    driver.quit();

                }
            }





