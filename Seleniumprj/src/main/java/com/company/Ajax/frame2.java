package com.company.Ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id='frame1']")));
        //System.out.println(driver.findElement(By.cssSelector("iframe[id='frame1']")).getText());

        driver.switchTo().frame("Child Iframe");
        System.out.println(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")).getText());

    }
}

