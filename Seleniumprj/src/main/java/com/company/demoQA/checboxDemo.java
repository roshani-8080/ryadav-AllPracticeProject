package com.company.demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checboxDemo {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//li[contains(.,'Check Box')]")).click();
        Thread.sleep(2000);
        //svg[class='rct-icon rct-icon-expand-close']
        driver.findElement(By.cssSelector("svg[class='rct-icon rct-icon-uncheck']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("svg[class='rct-icon rct-icon-expand-close']")).click();

        driver.findElement(By.cssSelector("svg[class='rct-icon rct-icon-check']")).click();
      //  driver.close();






    }
}
