import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class AddToCart2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String[] products = {"Cucumber", "Carrot", "Brocoli", "Tomato"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();

        List<WebElement> wb = driver.findElements(By.cssSelector("h4.product-name"));//For finding all elements

        for (int i = 0; i < wb.size(); i++) {
            String[] name = wb.get(i).getText().split("- ");
            String Edited = name[0].trim();
            List L1 = Arrays.asList(products);

            System.out.println(Edited);
            int j = 0;
            if (L1.contains(Edited))
            //Converting array in arraylist for easy search

            {
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

                if (j==3)
                    break;


            }

        }


    }


}


