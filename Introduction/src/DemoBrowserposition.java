import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoBrowserposition {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Assert.assertEquals();
        //driver.get("www.google.com");
        //Thread.sleep(3000);

        Point p = new Point(100, 200);
        driver.manage().window().setPosition(p);
    }
}
