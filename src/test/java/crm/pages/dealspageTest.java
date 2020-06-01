package crm.pages;

import crm.pages.pages.dealspage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dealspageTest<LoginPage, LoginPageTestlp> {


    LoginPage lp;
    LoginPageTestlp
    LoginPageTest.HomePage hp;
    dealspage dp;

    public dealspageTest() {
        super(fileInputStream, file);
    }


    public void setup() {
        initialization();
        lp = new LoginPage();
        dp = new dealspage();
        hp = lp.Login(prop.getProperty("username"), prop.getProperty("password"));
        hp.getClass();
  }



    private void initialization() {
        new LoginPage();
    }


    @Test
    public void verifyDealsPageLableTest() {
        Assert.assertTrue(dp.verifyDealsPageLable(), "Deals label is not displayed");
    }
}