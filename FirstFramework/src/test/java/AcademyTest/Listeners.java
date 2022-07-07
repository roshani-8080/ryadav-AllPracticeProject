package AcademyTest;

import Academy.Base;
import Academy.ExtentReportNG;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends Base implements ITestListener {
    ExtentTest test;
    ExtentReports reports=ExtentReportNG.getReport();
    ThreadLocal<ExtentTest> extenttst=new ThreadLocal<ExtentTest>();
    @Override
    public void onTestStart(ITestResult result) {
        test=reports.createTest(result.getMethod().getMethodName());
        extenttst.set(test);


        //ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
      //  ITestListener.super.onTestSuccess(result);
        extenttst.get().log(Status.PASS,"Test Passed");


    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
        WebDriver driver=null;
       String testMethod=result.getMethod().getMethodName();
        try {
            driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            extenttst.get().addScreenCaptureFromPath(getscreenshotpath(testMethod,driver),result.getMethod().getMethodName());
           // getscreenshotpath(testMethod,driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  ITestListener.super.onTestFailure(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        //ITestListener.super.onFinish(context);
        reports.flush();
    }
}
