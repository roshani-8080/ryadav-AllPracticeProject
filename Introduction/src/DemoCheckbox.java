import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCheckbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(3000);

        WebElement wb = driver.findElement(By.id("checkboxes"));
        System.out.println(wb.isDisplayed());
        System.out.println(wb.isEnabled());
        System.out.println(wb.isSelected());

        wb.click();
        Thread.sleep(3000);
        driver.close();

    }
}