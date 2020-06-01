package crm.pages.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import java.util.List;

@PageFactoryFinder(FindBy.FindByBuilder.class)
public class Homepage {
    ;
WebElement namelabel;
@FindBy(tagName = "a")
List<WebElement> links;
    @FindBy(xpath = "//span[contains(text(),'Radhika C')]")
    WebElement nameLabel;

@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactslink;

@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealslink;

@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement tasklink;
@FindBy(xpath = "//button[@class='ui linkedin button' and contains(text(),'New')]")
	WebElement newcontact;

    public Homepage() {
        super(fileInputStream, file);
    }


    public void HomePage(){
        PageFactory.initElements(driver,this);
        }

public String validateHomePageTitle(){
        return driver.getTitle();

        }

public String validateHomePageNameLable(){
        return namelabel.getText();
}



public ContactPage clickContactslink(){
        contactslink.click();
        return new ContactPage();
        }



public dealspage clickDealslink(){
        dealslink.click();
        return new dealspage();

        }
public TaskPage clickTasklink(){
        tasklink.click();
        return new TaskPage();

        }

    public void TaskPageLinkTest() {
    }
}