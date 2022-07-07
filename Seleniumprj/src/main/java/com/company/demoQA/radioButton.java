package com.company.demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);

      //  driver.findElement(By.xpath("//span[text()='Radio Button']/parent::li[@id='item-2']")).click();
        driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
        driver.findElement(By.className("custom-control-label")).click();
    }
}

