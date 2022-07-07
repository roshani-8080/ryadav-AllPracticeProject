import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AddToCart1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();

       List<WebElement> wb= driver.findElements(By.cssSelector("h4.product-name"));

       for(int i=0;i< wb.size(); i++)
       {
           String name=wb.get(i).getText();
           System.out.println(name);
           if(name.contains("Cucumber"))
           {
               driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
               break;

           }

       }





    }


    }
