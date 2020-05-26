package crm.pages.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactoryFinder;

@PageFactoryFinder(FindBy.FindByBuilder.class)
public class Homepage extends TestBase implements @FindBy {
@FindBy (XPath = "//span[contains.(text)(),'Radhika c']")
WebElement namelabel;
@FindBy(tagName = "a") List<WebElement> links;
@FindBy( = How.TAG_NAME, using = "a") List<WebElement> links;


        }
