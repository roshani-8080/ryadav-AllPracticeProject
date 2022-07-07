import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D://chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.4.0");

    }
}
