import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class AutosuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D://chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.id("autosuggest")).sendKeys("Mal");
        Thread.sleep(2000);

        List <WebElement> lis= (List<WebElement>) driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement list1 :lis)
        {
            if(list1.getText().equalsIgnoreCase("Malaysia")) {
                list1.click();
                break;
            }
        }

    }

}
