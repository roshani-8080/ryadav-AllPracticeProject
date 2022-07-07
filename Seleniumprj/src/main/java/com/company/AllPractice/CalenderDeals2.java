package com.company.AllPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDeals2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.path2usa.com/travel-companions");

        driver.manage().window().maximize();
//April 23
        driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
    }
}

