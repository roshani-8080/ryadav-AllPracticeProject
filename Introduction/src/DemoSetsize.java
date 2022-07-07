import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSetsize {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //driver.get("www.google.com");
        //Thread.sleep(3000);

        Dimension d = new Dimension(100, 200);
        driver.manage().window().setSize(d);
    }
}