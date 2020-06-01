package utilities;

import org.graalvm.compiler.debug.DebugOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverutil {

    protected static final long PAGE_LOAD_TIMEOUT =10 ;
public WebDriver driver;
    public WebDriverutil(Object FileInputStream, DebugOptions.PrintGraphTarget file) {
    }

    public static WebDriver getdriver(String browserName) {
        WebDriver driver;
        switch (browserName) {
            case "ChromeDriver":
                System.getProperty("webdriver.chrome.driver", "C:\\driver.chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", System.getProperty(("userdir") + "//resources//chromedriver.exe"));
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty(("webdriver.gecko.driver"), System.getProperty(("userdir") + "//resources//geckodriver.exe"));
                driver = new FirefoxDriver();

                break;
            default:
                System.getProperty("webdriver.chrome.driver", "C:\\driver.chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", System.getProperty(("userdir") + "//resources//chromedriver.exe"));
                driver = new ChromeDriver();


        }
        return driver;
    }


}