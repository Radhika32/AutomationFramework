package crm.pages;

import crm.pages.pages.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utilities.WebDriverutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.graalvm.compiler.debug.DebugOptions.PrintGraphTarget.File;

public  class Loginpage extends WebDriverutil {


    private static Object FileNotFoundException;
    private static final Object FileInputStream = FileNotFoundException;
    @FindBy(xpath = "//span[contains(text(),'Log In')]")
        WebElement loginbtn;

        @FindBy(name = "email")
        WebElement username;

        @FindBy(name = "password")
        WebElement password;

        @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
        WebElement login;

        @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
        WebElement signupbtn;
    private CharSequence Username;



    public Loginpage() {
        super(FileInputStream, File);
        WebDriver driver = null;
        PageFactory.initElements(driver,this);

    }

        public String validateLoginpage () {
            EventFiringWebDriver driver = null;
            return driver.getTitle();

    }

        public Homepage login (String un, String pwd){
        loginbtn.click();
        username.sendKeys(Username);
        password.sendKeys(pwd);
        login.click();
        return new Homepage();
    }


    public void getClass(String username, String password) {
    }

    public void getClass(FileInputStream file) {
    }
}

