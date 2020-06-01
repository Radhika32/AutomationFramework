package crm.pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utilities.WebdriverEventListner;

import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebdriverEventListner.WebEventListener eventListener;
public  TestBase() {

    try{
prop =new Properties(config.properties);
}

}
}








