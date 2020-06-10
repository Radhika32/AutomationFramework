package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseTest;

public class LoginPage<xpath> extends BaseTest {

	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	WebElement loginbtn;

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement Login;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signupbtn;
	
@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[1]/div/input")
WebElement inputstream;
	public LoginPage  (  ) {
		PageFactory.initElements(driver, this);

	}

	public String validateLoginPage() {
		return driver.getTitle();

	}

	public HomePage login(String username, String password) {


        //loginbtn.click();
		Login.click();
		return new HomePage();
	}

   /* private void LoginToApplication()
    {
        username.sendKeys("ch.radhika5@gmail.com");
        password.sendKeys("refg");
        loginbtn.click();

    }
*/
    public HomePage login(String password) {
        return  new HomePage();    }
}
