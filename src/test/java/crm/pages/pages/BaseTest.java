package crm.pages.pages;

import org.graalvm.compiler.debug.DebugOptions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.WebDriverutil;
import utilities.WebdriverEventListner;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

public class BaseTest extends WebDriverutil {
    WebDriver driver;
    private EventFiringWebDriver e_driver;
    private Object TestUtil;

    public BaseTest(Object FileInputStream, DebugOptions.PrintGraphTarget file) {
        super(FileInputStream, file);
    }


    @BeforeMethod
    public void setTestUtil()

    {
        {
            driver = WebDriverutil.getdriver("ChromeDriver");

            e_driver = new EventFiringWebDriver(driver);
            // Now create object of EventListerHandler to register it with EventFiringWebDriver
            WebdriverEventListner.WebEventListener eventListener = new WebdriverEventListner.WebEventListener() {
                /**
                 * This action will be performed each time before {@link Alert#accept()}
                 *
                 * @param driver WebDriver
                 */
                @Override
                public void beforeAlertAccept(WebDriver driver) {

                }

                /**
                 * This action will be performed each time after {@link Alert#accept()}
                 *
                 * @param driver WebDriver
                 */
                @Override
                public void afterAlertAccept(WebDriver driver) {

                }

                /**
                 * This action will be performed each time before {@link Alert#dismiss()}
                 *
                 * @param driver WebDriver
                 */
                @Override
                public void afterAlertDismiss(WebDriver driver) {

                }

                /**
                 * This action will be performed each time after {@link Alert#dismiss()}
                 *
                 * @param driver WebDriver
                 */
                @Override
                public void beforeAlertDismiss(WebDriver driver) {

                }

                /**
                 * Called before {@link WebDriver.Navigation#refresh navigate().refresh()}.
                 *
                 * @param driver WebDriver
                 */
                @Override
                public void beforeNavigateRefresh(WebDriver driver) {

                }

                /**
                 * Called after {@link WebDriver.Navigation#refresh navigate().refresh()}. Not called,
                 * if an exception is thrown.
                 *
                 * @param driver WebDriver
                 */
                @Override
                public void afterNavigateRefresh(WebDriver driver) {

                }

                /**
                 * Called before {@link WebElement#clear WebElement.clear()}, {@link WebElement#sendKeys
                 * WebElement.sendKeys(...)}.
                 *
                 * @param element    the WebElement being used for the action
                 * @param driver     WebDriver
                 * @param keysToSend
                 */
                @Override
                public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

                }

                /**
                 * Called after {@link WebElement#clear WebElement.clear()}, {@link WebElement#sendKeys
                 * WebElement.sendKeys(...)}}. Not called, if an exception is thrown.
                 *
                 * @param element    the WebElement being used for the action
                 * @param driver     WebDriver
                 * @param keysToSend
                 */
                @Override
                public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

                }

                /**
                 * This action will be performed each time before  {@link WebDriver.TargetLocator#window(String)}
                 *
                 * @param windowName
                 * @param driver     WebDriver
                 */
                @Override
                public void beforeSwitchToWindow(String windowName, WebDriver driver) {

                }

                /**
                 * This action will be performed each time after  {@link WebDriver.TargetLocator#window(String)}
                 *
                 * @param windowName
                 * @param driver     WebDriver
                 */
                @Override
                public void afterSwitchToWindow(String windowName, WebDriver driver) {

                }

                /**
                 * Called before {@link TakesScreenshot#getScreenshotAs(OutputType)}
                 * allows the implementation to determine which type of output will be generated
                 *
                 * @param target target type, @see OutputType
                 */
                @Override
                public <X> void beforeGetScreenshotAs(OutputType<X> target) {

                }

                /**
                 * Called after {@link TakesScreenshot#getScreenshotAs(OutputType)}
                 * allows the implementation to determine which type of output was generated
                 * and to access the output itself
                 *
                 * @param target     target type, @see OutputType
                 * @param screenshot screenshot output of the specified type
                 */
                @Override
                public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

                }

                /**
                 * Called before {@link WebElement#getText()} method is being called
                 *
                 * @param element - {@link WebElement} against which call is being made
                 * @param driver  - instance of {@link WebDriver}
                 */
                @Override
                public void beforeGetText(WebElement element, WebDriver driver) {

                }

                /**
                 * Called right after {@link WebElement#getText()} method is being called
                 *
                 * @param element - {@link WebElement} against which call is being made
                 * @param driver  - instance of {@link WebDriver}
                 * @param text    - {@link String} object extracted from respective {@link WebElement}
                 */
                @Override
                public void afterGetText(WebElement element, WebDriver driver, String text) {

                }
            };
            e_driver.register(eventListener);
            driver = e_driver;

            //driver.get("https://www.google.com/");
            //driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(WebDriverutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            //driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
            LogManager prop = null;
            driver.get(prop.getProperty("https://ui.freecrm.com"));
            driver.get("https://ui.freecrm.com");

        }
        }


    @AfterMethod
    public void teardown() {
driver.quit();
driver.switchTo().frame("MainFrame");
    }
}