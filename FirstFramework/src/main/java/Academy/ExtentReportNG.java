package Academy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
    static ExtentReports reports;

    public  static ExtentReports getReport(){


        String path = System.getProperty("user.dir") + "//reports//index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Framework Report");
        reporter.config().setDocumentTitle("Test cases");

        reports=new ExtentReports();
        reports.attachReporter(reporter);
        reports.setSystemInfo("Roshani Yadav","SDET");


        return reports;

    }

}
