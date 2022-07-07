import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D://chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        int i=0;
        /* while(i<4) {
            driver.findElement(By.id("hrefIncChd")).click();
            i++;

        }*/
       /* for(int i=0;i<4;i++)
        {
            driver.findElement(By.id("hrefIncChd")).click();

        }*/

        do{
            driver.findElement(By.id("hrefIncChd")).click();
            i++;

        }
        while(i<4);


    }
}
