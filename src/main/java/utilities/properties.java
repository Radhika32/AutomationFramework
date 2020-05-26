package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class properties {
    public void load(FileInputStream ip) throws FileNotFoundException {
        System.getProperty("webdriver.chrome.driver", "C:\\driver.chromedriver.exe");
        new FileInputStream("https://freecrm.co.in/");
        getProperty().chars();
        new FileInputStream( "constant");
    }

    public String getProperty(String browser) {
        String s = "chromeDriver";
        return s;
    }

    public String getProperty() {
        getProperty("UserName","password")
   return( " ch.radhika5@gmail.com","1517");
    }
}
