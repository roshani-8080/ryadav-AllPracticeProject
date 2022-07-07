package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExtentReportDemo {
    ExtentReports extentReports;


    @BeforeTest
    public void bfrtst()
    {
//ExtentReports,ExtentsparkReporter
        String path=System.getProperty("user.dir")+"//reports//index.html";

        ExtentSparkReporter reporter=new ExtentSparkReporter(path);
        reporter.config().setReportName("Automation Results");
        reporter.config().setDocumentTitle("TestResults");

        extentReports=new ExtentReports();
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Tester","Roshani");


    }
    @Test
    public void firstdemo()
    {
        extentReports.createTest("First Demo");
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        System.out.println("First Demo");
        driver.close();
        extentReports.flush();
    }
    @Test
    public void seconddemo()
    {
        SoftAssert a=new SoftAssert();

        extentReports.createTest("Second Demo");
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println("Second Demo");
        a.assertTrue(false);
        driver.close();
        extentReports.flush();
        a.assertAll();
    }

}
