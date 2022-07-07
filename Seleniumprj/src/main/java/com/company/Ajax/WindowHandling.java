package com.company.Ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows= driver.getWindowHandles();
        Iterator<String>i1=windows.iterator();

        String p1=i1.next();
        String c1= i1.next();
        driver.switchTo().window(c1);
        Thread.sleep(5000);

        Actions a= new Actions(driver);
        a.moveToElement(driver.findElement(By.className("dropdown-toggle"))).build().perform();
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

        String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(p1);

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailId);




    }
}
