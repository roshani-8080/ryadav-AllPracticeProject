import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//input[@id=id='u_r_b_Gg']")).sendKeys("Roshani");
        driver.findElement(By.xpath("//input[@id='u_r_d_d']")).sendKeys("Yadav");


    }

    }
