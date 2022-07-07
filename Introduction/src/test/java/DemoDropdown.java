import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DemoDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(3000);

        driver.findElement(By.linkText("Dropdown")).click();

        Select S= new Select(driver.findElement(By.id("dropdown")));
        //S.selectByValue("0");
        //S.selectByIndex(0);
        S.selectByVisibleText("Option 2");

        S.getOptions();


        //System.out.println(wb.isDisplayed());
        //System.out.println(wb.isEnabled());
        //wb.click();
    }
}
