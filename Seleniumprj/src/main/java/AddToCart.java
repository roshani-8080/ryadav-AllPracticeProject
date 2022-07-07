import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//h4[text()='Carrot - 1 Kg']/following-sibling::div//button[text()='ADD TO CART']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("img[src='https://res.cloudinary.com/sivadass/image/upload/v1493548928/icons/bag.png']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahulshettyacademy");
        driver.findElement((By.cssSelector("button[class='promoBtn']"))).click();
        Thread.sleep(7000);
        System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();


        WebElement wb = driver.findElement(By.tagName("select"));
        //wb.click();
        Thread.sleep(2000);
        Select sel = new Select(wb);
        sel.selectByVisibleText("India");
        sel.getFirstSelectedOption();


        WebElement wb1 = driver.findElement(By.cssSelector("input[type='checkbox']"));
        wb1.click();
        System.out.println(wb1.isEnabled());
        System.out.println(wb1.isSelected());


        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//*[contains(text(),'successfully')]")).getText());


    }
}
