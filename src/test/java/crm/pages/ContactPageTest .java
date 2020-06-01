package crm.pages;
import crm.pages.pages.LoginPage;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import utilities.TestUtilities;

import static org.junit.Assert.assertTrue;

public class ContactPageTest extends Testbase {
    Loginpage lp;
    LoginPageTest
    ContactPage cp;

    String sheetname;
    private TestUtilities.TestUtilities TestUtil;

    {
        sheetname = "Contacts";
    }

    public void ContactsPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        lp = new LoginPage();
        cp = new ContactPage();
        hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
        hp.clickContactslink();
    }

    @Test
    public void verifyContactsPageLabelTest() {
        Assert.assertTrue(cp.verifyContactLabel(), "Contacts label is not displayed");
        System.out.println("Contacts label is not displayed");
    }

    @Test(priority = 2)
    public void selectcontactTest() {
        cp.selectContactsByCount(2);
        System.out.println("Contact page is selected");
    }

    @DataProvider
    public Object[][] getContactTestData() {
        Object data[][] = TestUtil.getTestData(sheetname);
        return data;
    }

    @DataProvider(getcontact TestData)
    public Object[][] getContactTestData() {
        Object data[][] = new Object[1][1];
        return getContactTestData();
    }

    @AfterMethod
    public void tearDown ()
     {
        Thread.sleep(1000)
        driver.close();
        System.out.println("test is passed");
    }

}
