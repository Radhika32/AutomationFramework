package crm.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.logging.LogManager;
public class LoginPageTest  extends Testbase {
    WebDriver driver;
    Loginpage lp;
    dealspage dp;
    //public Class<?> hp;
    public LoginPageTest(Loginpage lp) {
        this.lp = lp;
        hp = new HomePage();
        driver = new Driver();
    }


    @BeforeMethod
    public void setup() {
        initialization();
        lp = new Loginpage();
        hp = new HomePage();
        System.out.println("login page constructed ");
    }

    private void initialization() {
    }



    @Test
    public void loginpageTitle() {
        String title = lp.validateLoginpage();
        Assert.assertEquals(title, "Free Customer Relationship Management");
        System.out.println("Free Customer Relationship Management");

    }

    @Test
    public void getlp() {
        {
            LogManager prop = null;
            hp = lp.getClass(prop.getProperty("username"), prop.getProperty("password"));

        }
    }

    @Test
    public void setLp(Loginpage lp) {
        this.lp = lp;
    }



    public void setHp(HomePage hp) {
        this.hp = hp;
    }

    public dealspage getDp() {
        return dp;
    }

    public void setDp(dealspage dp) {
        this.dp = dp;
    }

    private class dealspage {
    }

    public class HomePage {
    }

    public void teardown() {
        driver.quit();


    }

}