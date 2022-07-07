package com.company.Ajax;

import net.bytebuddy.implementation.bytecode.ShiftLeft;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        Actions a=new Actions(driver);

        //Moves to specific Element
        WebElement mv=driver.findElement(By.id("nav-link-accountList"));
        a.moveToElement(mv).build().perform();
        Thread.sleep(3000);
        //To capture textbox and enter all leetters in caps
        a.moveToElement(driver.findElement(By.id("nav-search-bar-form"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

        //a.moveToElement(driver.findElement(By.id("nav-search-bar-form"))).click().sendKeys(Keys.).sendKeys("Hello").build().perform();

        Thread.sleep(3000);
        //For right click on that element
        a.moveToElement(driver.findElement(By.id("nav-search-bar-form"))).doubleClick().build().perform();
                //.build().perform();
        a.moveToElement(mv).contextClick().build().perform();






    }
}
