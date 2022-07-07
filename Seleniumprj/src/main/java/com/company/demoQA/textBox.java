package com.company.demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBox {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//li[contains(.,'Text Box')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("userName")).sendKeys("Roshani");
        Thread.sleep(2000);

        driver.findElement(By.id("userEmail")).sendKeys("ryadav01@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.id("currentAddress")).sendKeys("Pune");
        Thread.sleep(2000);

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);



        driver.findElement(By.id("permanentAddress")).sendKeys("Satara");
        Thread.sleep(2000);
        //driver.findElement(By.id("submit")).click();
         driver.findElement(By.xpath("//button[text()='Submit']")).click();



    }
}
