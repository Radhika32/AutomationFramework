package crm.pages;

import crm.pages.pages.ContactPage;
import crm.pages.pages.Homepage;
import crm.pages.pages.TaskPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePagetestTest<Public> {
    private final Object Title;
    Loginpage lp = new Loginpage();
    Homepage hp = new Homepage();
    ContactPage cp;
    crm.pages.dealspage dp;
    TaskPage tp;

    public HomePagetestTest() {
        super(fileInputStream, file);
        Title = "CRM Software in the Cloud";
    }

    @BeforeMethod
    public void setup() {
        initialization();
        hp = new LoginPageTest.HomePage();
        cp = new ContactPage();
        dp = new crm.pages.dealspage();
        tp = new TaskPage();
        hp = lp.login(prop.getproperty("UserName", "Password"));
        return ();
    }

    private void initialization() {
    }

    public void Verify

    void HomePageTitleTest() {
        String hp Title = hp.validateHomePageTitle();
        Assert.assertEquals(hp Title, "CRM Software in the Cloud", "HP Title not matched");
    }

    @Test
    public void verifyContactPageLinkTest() {
        cp = hp.clickContactslink();
        System.out.println("contactpage is clicked");
    }

    @Test(priority = 2)
    Public  void verifyDealsPageLinkTest() {
        dp = hp.clickDealslink();
        System.out.println("deals page is clicked");
    }

    @Test
    Public void VerifyTaskPageLinkTest() {
        tp = hp.TaskPageLinkTest();
    }

    Public  void teardown() {
        driver.close();
        System.out.println("Aftermethod is executed");
    }
}



