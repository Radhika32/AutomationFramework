package crm.pages.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dealspage {

    @FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
    WebElement dealspagelable;

    @FindBy(xpath = "//input[@type='text']")
    WebElement searchbar;

    @FindBy(xpath = "//a[contains(text(),'Shabdh ')]")
    WebElement result;

    public dealspage() {
        super(fileInputStream, file);
    }

    public void DealsPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean verifyDealsPageLable() {
        return dealspagelable.isDisplayed();
    }

    public String verifySearchBar(String input) {
        searchbar.sendKeys(input);
        searchbar.sendKeys(Keys.RETURN);
        return result.getText();
    }


}
