package utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;

import static jdk.internal.misc.OSEnvironment.initialize;

public class properties {
    private Object properties;
    private Object userName;
    private Object load;
    private Object FileNotFoundException;

    public String getProperty(String browser) throws FileNotFoundException {

        initialize();
        String password = new String();
        Object config = new Object();
        String userName = getProperty((String) config);
        Objects.equals(password, getProperty(WebDriverutil));

        System.getProperty("webdriver.chrome.driver", "C:\\driver.chromedriver.exe");
        new FileInputStream("https://freecrm.co.in/");
        getProperty("browser");
        new FileInputStream("constant");
        return password;
    }

}

    // private void getProperty (String username, String load){
            //  this.load;
               // FileInputStream ip;









