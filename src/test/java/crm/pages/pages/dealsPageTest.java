package crm.pages.pages;

import crm.pages.Loginpage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class dealsPageTest {
Loginpage lp;
Homepage hp;
dealspage dp;
    @BeforeMethod
    public void setUp() {
    initialization();
    Loginpage lp;
        Homepage hp = lp.Login(prop.getProperty("username"), prop.getProperty("password"));
    }

    private void initialization() {

    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testSetDriver() {
    }

    @Test
    public void testDealsPage() {
    }

    @Test
    public void testVerifyDealsPageLable() {
    }

    @Test
    public void testVerifySearchBar() {
    }
}