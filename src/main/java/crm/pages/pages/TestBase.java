package crm.pages.pages;
import org.openqa.
import com.sun.tools.javac.code.Attribute;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import utilities.properties;
import org.openqa.selenium.logging.LocalLogs;
import javax.swing.text.Utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static properties prop;
    public static EventFiringWebDriver e_driver;

    public static WebDriverEventListener event_Listner;

    public <browser> TestBase() {
        try {
            prop = new properties();
            //FileInputStream ip = new FileInputStream( );
            new FileInputStream("constant");
            System.getProperty("C:\\Users\\Ramanjaneyulu\\eclipse-workspace\\Automation framework\\src\\main\\java\\utilities");
            FileInputStream ip = null;
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         static void initialization() {

            String browserName = prop.getProperty("browser");//chrome//Firefox
            if (browserName.equals("chrome")) {
                System.setProperty("WebDriver.chrome.driver", " ");
                System.getProperty("C:\\Users\\Ramanjaneyulu\\Desktop\\driver\\chromedriver.exe");
            }

            driver = new ChromeDriver();

            if (browserName.equals("Firefox")) {
                System.setProperty("webDriver.gecko.driver", " ");
                System.getProperty(" C:\\Users\\Ramanjaneyulu\\Desktop\\driver\\geckodriver.exe");
                driver = new FirefoxDriver();

            }

            e_driver = new EventFiringWebDriver();
            event_Listner = new WebDriverEventListener() {
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
                 * Called before {@link WebDriver#get get(String url)} respectively
                 * {@link WebDriver.Navigation#to navigate().to(String url)}.
                 *
                 * @param url    URL
                 * @param driver WebDriver
                 */
                @Override
                public void beforeNavigateTo(String url, WebDriver driver) {

                }

                /**
                 * Called after {@link WebDriver#get get(String url)} respectively
                 * {@link WebDriver.Navigation#to navigate().to(String url)}. Not called, if an
                 * exception is thrown.
                 *
                 * @param url    URL
                 * @param driver WebDriver
                 */
                @Override
                public void afterNavigateTo(String url, WebDriver driver) {

                }

                /**
                 * Called before {@link WebDriver.Navigation#back navigate().back()}.
                 *
                 * @param driver WebDriver
                 */
                @Override
                public void beforeNavigateBack(WebDriver driver) {

                }

                /**
                 * Called after {@link WebDriver.Navigation navigate().back()}. Not called, if an
                 * exception is thrown.
                 *
                 * @param driver WebDriver
                 */
                @Override
                public void afterNavigateBack(WebDriver driver) {

                }

                /**
                 * Called before {@link WebDriver.Navigation#forward navigate().forward()}.
                 *
                 * @param driver WebDriver
                 */
                @Override
                public void beforeNavigateForward(WebDriver driver) {

                }

                /**
                 * Called after {@link WebDriver.Navigation#forward navigate().forward()}. Not called,
                 * if an exception is thrown.
                 *
                 * @param driver WebDriver
                 */
                @Override
                public void afterNavigateForward(WebDriver driver) {

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
                 * Called before {@link WebDriver#findElement WebDriver.findElement(...)}, or
                 * {@link WebDriver#findElements WebDriver.findElements(...)}, or {@link WebElement#findElement
                 * WebElement.findElement(...)}, or {@link WebElement#findElement WebElement.findElements(...)}.
                 *
                 * @param by      locator being used
                 * @param element will be <code>null</code>, if a find method of <code>WebDriver</code> is called.
                 * @param driver  WebDriver
                 */
                @Override
                public void beforeFindBy(By by, WebElement element, WebDriver driver) {

                }

                /**
                 * Called after {@link WebDriver#findElement WebDriver.findElement(...)}, or
                 * {@link WebDriver#findElements WebDriver.findElements(...)}, or {@link WebElement#findElement
                 * WebElement.findElement(...)}, or {@link WebElement#findElement WebElement.findElements(...)}.
                 *
                 * @param by      locator being used
                 * @param element will be <code>null</code>, if a find method of <code>WebDriver</code> is called.
                 * @param driver  WebDriver
                 */
                @Override
                public void afterFindBy(By by, WebElement element, WebDriver driver) {

                }

                /**
                 * Called before {@link WebElement#click WebElement.click()}.
                 *
                 * @param element the WebElement being used for the action
                 * @param driver  WebDriver
                 */
                @Override
                public void beforeClickOn(WebElement element, WebDriver driver) {

                }

                /**
                 * Called after {@link WebElement#click WebElement.click()}. Not called, if an exception is
                 * thrown.
                 *
                 * @param element the WebElement being used for the action
                 * @param driver  WebDriver
                 */
                @Override
                public void afterClickOn(WebElement element, WebDriver driver) {

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
                 * Called before {@link RemoteWebDriver#executeScript(String, Object[]) }
                 *
                 * @param script the script to be executed
                 * @param driver WebDriver
                 */
                @Override
                public void beforeScript(String script, WebDriver driver) {

                }

                /**
                 * Called after {@link RemoteWebDriver#executeScript(String, Object[]) }.
                 * Not called if an exception is thrown
                 *
                 * @param script the script that was executed
                 * @param driver WebDriver
                 */
                @Override
                public void afterScript(String script, WebDriver driver) {

                }

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
                 * Called whenever an exception would be thrown.
                 *
                 * @param throwable the exception that will be thrown
                 * @param driver    WebDriver
                 */
                @Override
                public void onException(Throwable throwable, WebDriver driver) {

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
            }

            e_driver.register(event_Listner);
            driver.get("//https://freecrm.co.in/");
            driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().deleteAllCookies();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        //driver.get(prop.getProperty());
            System.out.println("code is succesful");
        }

    }

}





