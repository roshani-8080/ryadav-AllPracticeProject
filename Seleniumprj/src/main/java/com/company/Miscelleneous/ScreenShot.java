package com.company.Miscelleneous;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ScreenShot {

        public static void main(String[] args) throws Exception {
            System.setProperty("webdriver.chrome.driver","D://chromedriver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            try{
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("D:\\Screenshot\\screenShot1.png"));
                System.out.println("Screenshot is captured and stored in your D: Drive");
            }
            catch (Exception e)
            {
                System.out.println("Error in loading the Google page");
            }
        }
    }
