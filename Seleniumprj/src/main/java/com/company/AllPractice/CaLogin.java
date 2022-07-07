package com.company.AllPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class CaLogin {
    public static void LaunchBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");

    }
    public static void openurl(WebDriver driver)
    {
        driver.get("https://clientadmin.stage.entratadev.com/?module=authentication-new&action=post_logout");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='click here']")).click();

    }
    public static void Login(WebDriver driver){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ryadav01");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Entrata123");
        driver.findElement(By.id("signin-submit")).click();

    }
    public static void MyEntrata(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='My Entrata']")).click();
        Thread.sleep(2000);
    }

    public static void Reviews(WebDriver driver) throws InterruptedException {
        driver.findElement(By.cssSelector("li[id='reviews']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='My Reviews']")).click();
    }
    public static void ProgressReports(WebDriver driver)
    {
        System.out.println(driver.findElement(By.xpath("//a[text()='Progress Reports']")).isDisplayed());

    }

    public static void LearningGoals(WebDriver driver){
        System.out.println(driver.findElement(By.xpath("//a[text()='My Learning Goals']")).isDisplayed());

    }
    public static void TabelDetails(WebDriver driver){
        List<WebElement> th =driver.findElements(By.xpath("//tr[@class='valign-header']/th"));////tbody/tr/th -xpath can be use
        //List<WebElement> th =driver.findElements(By.xpath("//tbody/tr/th"));
        System.out.println(th.size());

        for (WebElement wb:th){
            String s=wb.getText();
            System.out.println(s);
            System.out.println(wb.isDisplayed());
        }
    }

    public static void employeeTOReview (WebDriver driver){
        driver.findElement(By.id("employees_to_be_reviewed")).click();

    }
    /*public static void tabelDetailsone(WebDriver driver){
        List<WebElement> th1 =driver.findElements(By.xpath("//tr[@class='valign-header']/th"));////tbody/tr/th -xpath can be use
        //List<WebElement> th1 =driver.findElements(By.xpath("//tbody/tr/th"));
        System.out.println(th1.size());

        for (WebElement wb1:th1){
            String s1=wb1.getText();
            System.out.println(s1);
            System.out.println(wb1.isDisplayed());
        }

    }*/
    public static void testSurveys(WebDriver driver)
    {
        driver.findElement(By.cssSelector("li[id='tests_tab']")).click();
    }
    public static void testSurveysTable(WebDriver driver){
        List<WebElement> tst =driver.findElements(By.xpath("//table/tbody/tr/th"));
        System.out.println(tst.size());

        for(WebElement wb2:tst){
            String s2=wb2.getText();
            System.out.println(s2);
            System.out.println(wb2.isDisplayed());
        }
    }

    public static void main(String[] args) throws InterruptedException {
            LaunchBrowser();
            WebDriver driver = new ChromeDriver();
           // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            openurl(driver);
            Login(driver);
            MyEntrata(driver);
            Reviews(driver);
            ProgressReports(driver);
            LearningGoals(driver);
            TabelDetails(driver);
            employeeTOReview(driver);
            ProgressReports(driver);
            LearningGoals(driver);
            Thread.sleep(2000);
          // tabelDetailsone(driver);
             testSurveys(driver);



    }
}
