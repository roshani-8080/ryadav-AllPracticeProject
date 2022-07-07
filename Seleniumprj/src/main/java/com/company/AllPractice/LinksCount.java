package com.company.AllPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class LinksCount {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement wb = driver.findElement(By.id("gf-BIG"));//Limitining webdriver scope
        System.out.println(wb.findElements(By.tagName("a")).size());

        WebElement columndriver = wb.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());

        //Click on each link and checking pages are getting open

        for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
            String nwtab = Keys.chord(Keys.CONTROL, Keys.ENTER);

            columndriver.findElements(By.tagName("a")).get(i).sendKeys(nwtab);
            Thread.sleep(2000);

        }
               Set<String> s=driver.getWindowHandles();
               Iterator<String> it=s.iterator();
               while (it.hasNext())
               {
                   driver.switchTo().window(it.next());
                   System.out.println(driver.getTitle());



        }


    }

}
