package com.company.Ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        Thread.sleep(2000);

       // driver.findElement(By.id("draggable")).click();
        System.out.println(driver.findElement(By.id("droppable")).getText());
        Actions a=new Actions(driver);


        WebElement src=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));

        //Thread.sleep(2000);
        a.dragAndDrop(src,target).build().perform();
        System.out.println(driver.findElement(By.xpath("//p[text()='Dropped!']")).getText());


    }
}
