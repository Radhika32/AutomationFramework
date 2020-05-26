package crm.pages;
import org.testng.annotations;
import crm.pages.*;
public class HomePagetest extends TestBase {
LoginPage lp;
Homepage hp = new HomePage();
ContactPage cp;
dealspage dp;
TaskPage tp;
public HomePagetest () {
    super();
}
}
@BeforeMethod
public void setup() {
    initialization()
   lp= new LoginPage();
    hp = new HomePage();
    cp= new ContactPage();
    dp = new dealspage();
    tp = new taskPage();
    hp =lp.login(prop.getproperty("UserName","Password"));
return();
}
@Test (priority = 1)
public void Verify HomePageTitleTest(){
        String hp Title=hp.validateHomePageTitle();
        Assert.assertEquals(hp Title,"CRM Software in the Cloud","HP Title not matched");
        }
@Test
public void verifyContactPageLinkTest() {
        cp = hp.clickContactslink();
       System.out.println("contactpage is clicked");
        }
@Test (priority = 2)
public void verifyDealsPageLinkTest() {
        dp = hp.clickDealslink();
    System.out.println("deals page is clicked");
        }
@Test
Public void VerifyTaskPageLinkTest() {
    tp=hp.TaskPageLinkTest();
            }
@AfterTest
public void teardown(){
driver.close();
System.out.println("Aftermethod is executed");
        }



