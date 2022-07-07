package com.company.Ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.id("frame1")));
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
    }
}
