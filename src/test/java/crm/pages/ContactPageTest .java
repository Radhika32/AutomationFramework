package crm.pages;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import org.testng.annotations;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import crm.pages.ContactPage;
import crm.pages.Testbase;

public class ContactPageTest extends Testbase{
Loginpage lp;
    HomePage hp;
    ContactPage cp;

    String sheetname;

    {
        sheetname = "Contacts";
    }

    public ContactsPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        lp = new LoginPage();
        cp = new ContactPage();
        hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
        hp.clickContactslink();
        return;
    }
    @Test (priority=1)
	public void verifyConatctsPageLabelTest() {
		Assert.assertTrue(cp.verifyContactLabel(), "Contacts label is not displayed");
	System.out.println("Contacts label is not displayed");
    }

	@Test (priority=2)
	public void selectcontactTest() {
	cp.selectContactsByCount(2);
System.out.println("Contact page is selected");
	}
    @DataProvider
    public Object[][] getContactTestData() {
        Object data[][]=TestUtil.getTestData(sheetname);
        return data;
    }
    @DataProvider (getcontact TestData)
	public Object[][] getContactTestData() {
        Object data[][] = new Object[1][1];
        return getContactTestData();
    }

@AfterMethod
public void tearDown throws  throws InterruptedException{
    Thread.sleep(1000)
driver.close();
    System.out.println("test is passed");
    }


