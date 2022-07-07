import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxOne {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D://chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        System.out.println(driver.findElement((By.id("ctl00_mainContent_chk_friendsandfamily"))).isSelected());
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement((By.id("ctl00_mainContent_chk_friendsandfamily"))).isSelected());

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


    }
}
