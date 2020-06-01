import com.relevantcodes.extentreports.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import java.util.List;

public interface ExtentReportsListener extends IReporter   {
    void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
                        String outputDirectory);

    void stop();

    void flush();
}
