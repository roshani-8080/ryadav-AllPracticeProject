import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D://chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("rahul shetty");

        List<WebElement> Lis=driver.findElements(By.cssSelector("li[class='sbct'] div"));
        int wb=Lis.size();


        for (WebElement list1 :Lis)
        {
            if(list1.getText().equalsIgnoreCase("rahul shetty academy")) {
                list1.click();
                break;
            }
        }


    }
}
