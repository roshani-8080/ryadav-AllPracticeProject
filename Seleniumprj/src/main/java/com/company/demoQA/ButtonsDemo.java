package com.company.demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Buttons']")).click();
        Actions a=new Actions(driver);

        a.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
        Thread.sleep(2000);
        a.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
        Thread.sleep(2000);
        //js.executeScript("window.scrollBy(0,100)");

        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
    }
}
