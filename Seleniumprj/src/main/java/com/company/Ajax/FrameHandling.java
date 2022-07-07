package com.company.Ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable");
        driver.manage().window().maximize();

        System.out.println(driver.findElements(By.tagName("iframe")).size());//how many frames avail on webpage
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));


        WebElement src=driver.findElement(By.id("draggable"));
        WebElement des=driver.findElement(By.id("droppable"));

        Actions a=new Actions(driver);
        a.dragAndDrop(src,des).build().perform();


        driver.switchTo().defaultContent();//for come out from frame


        //driver.switchTo().frame(0);

       // driver.switchTo().frame()



    }
}

