package com.company.javascriptexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0,700)\n");

        Thread.sleep(2000);

        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500\n" +
                "\n");
    }
}
