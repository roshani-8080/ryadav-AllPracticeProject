package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaLogin {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://clientadmin.stage.entratadev.com/?module=standard_dashboard-new");
        Thread.sleep(5000);





    }
}
