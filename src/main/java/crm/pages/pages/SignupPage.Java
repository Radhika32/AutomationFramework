package crm.pages.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class SignupPage {
    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "address")
    private WebElement address;

    @FindBy(id = "zipcode")
    private WebElement zipCode;

    public SignupPage() {
        super(fileInputStream, file);
    }
}
