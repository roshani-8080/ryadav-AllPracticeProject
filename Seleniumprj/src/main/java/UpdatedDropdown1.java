import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropdown1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D://chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement wb=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        //driver.findElement(By.id("divpaxinfo")).click();
        Select sel=new Select(wb);


        sel.selectByIndex(1);
        System.out.println(sel.getFirstSelectedOption().getText());

        sel.selectByVisibleText("AED");
        System.out.println(sel.getFirstSelectedOption().getText());

        sel.selectByValue("USD");
        System.out.println(sel.getFirstSelectedOption().getText());




    }
}