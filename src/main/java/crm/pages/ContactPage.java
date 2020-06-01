package crm.pages;
import org.graalvm.compiler.debug.DebugOptions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.WebDriverutil;


public class ContactPage extends WebDriverutil {

    public static final Object FileInputStream = newObject();
    private static Object FileNotFoundException;

    public static Object newObject() {
      return  FileNotFoundException;

    }

    public static Object File ;
    @FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
    WebElement contactpagelable;

    @FindBy(name = "first_name")
    WebElement firstname;

    @FindBy(name = "last_name")
    WebElement lastname;

    @FindBy(xpath = "//div[@name='company']")
    WebElement cmpny;

    @FindBy(xpath = "//button[@class=\"ui linkedin button\"]")
    WebElement save;

    public ContactPage() {
        super(FileInputStream, (DebugOptions.PrintGraphTarget) File);
        PageFactory.initElements(getdriver(), this);
    }

    public static void setFile(Object file) {
        File = file;
    }

    private WebDriver getdriver() {
        return  driver;
    }

    public boolean verifyContactLabel() {
        return contactpagelable.isDisplayed();
    }

    public void selectContactsByCount(int count) {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[" + count + "]/td[1]/div")).click();
    }

    public void creatNewContact(String ftname, String ltname, String cmp) {
        firstname.sendKeys(ftname);
        lastname.sendKeys(ltname);
        JavascriptExecutor executor;
        executor = (JavascriptExecutor) driver;
        executor.executeScript(new StringBuilder().append("arguments[0].value='").append(cmp).append("';").toString(), cmpny);
        //cmpny.sendKeys(cmp);
        save.click();

        WebElement phone;
        phone = driver.findElement(By.name("phone"));
        phone.sendKeys("9258758761");

        WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
        termsOfServices.click();

        WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
        signUp.click();

        String expectedURL = "https://ui.freecrm.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);

        String expectedTitle = " free Crm package";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

}



