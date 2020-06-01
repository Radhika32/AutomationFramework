
package utilities;

import com.sun.media.sound.InvalidFormatException;
import crm.pages.Loginpage;
import org.apache.commons.io.FileUtils;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.stylesheets.LinkStyle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestUtilities {


    private static final Object file = new Object();
    private static final Object FileInputStream = new Object();
    public static long PAGE_LOAD_TIMEOUT=30;
    public static String TESTDATA_SHEET_PATH=System.getProperty(("user.dir")+"\\generated-sources\\annotations\\workbook.xls");
    static Sheet workbook;
    public static WebDriver driver;
    private static Loginpage WorkbookFactory;
    private static Object File;

    public TestUtilities() {

            super(FileInputStream, File);
        }


        public void switchToFrame() {
            driver.switchTo().frame("mainframe");

        }
        public static void takeScreenshotAtEndOfTest() throws IOException {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty(("user.dir"),"//target//classes//Screenshots.png" ) ;
            FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
        }

        public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
            FileInputStream file = null;
            try {
                file = new FileInputStream(TESTDATA_SHEET_PATH);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            LinkStyle book;

            Object[][] data = new Object[workbook.getLastRowNum()][workbook.getRow(0).getLastCellNum()];
             System.out.println(workbook.getLastRowNum() + "--------" + workbook.getRow(0).getLastCellNum());
            for (int i = 0; i < workbook.getLastRowNum(); i++) {
                for (int k = 0; k < workbook.getRow(0).getLastCellNum(); k++) {
                    data[i][k] = workbook.getRow(i + 1).getCell(k).toString();
                    System.out.println(data[i][k]);
                }
            }
            return data;
        }
}