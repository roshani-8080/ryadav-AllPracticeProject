package com.company.Ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
        Thread.sleep(2000);
       // System.out.println(driver.findElements(By.tagName("frame")).size());//how many frames avail on webpage
      //  Thread.sleep(2000);
        driver.switchTo().frame("frame-top");



        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.id("content")).getText());




    }
}
