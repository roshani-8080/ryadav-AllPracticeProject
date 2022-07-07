package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class PracticeTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        driver.findElement(By.name("name")).sendKeys("Roshani");
        driver.findElement(By.name("email")).sendKeys("ryadav1@gmail.com");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("12345");
            //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='form-check-input']")).click();

        Select s1=new Select(driver.findElement(By.tagName("select")));
        s1.selectByVisibleText("Female");
        //Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Employed')]")).click();
        //Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("21-05-1994");
        //Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();
       //System.out.println(driver.findElement(By.xpath("//div[contains(text(),'successfully'))]")).getText());
        //System.out.println(driver.findElement(By.xpath("//strong[text()='Success!']")).getText());
        System.out.println(driver.findElement(By.className("alert")).getText());







    }
}
