import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumGmail {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com&hl=en&dsh=S453348618%3A1639668857541749&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
        Thread.sleep(5000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        Dimension d=new Dimension(2000,950);
        driver.manage().window().setSize(d);

        Point P=new Point(30,100);
        driver.manage().window().setPosition(P);

        driver.findElement(By.id("firstName")).sendKeys("Roshani");
        driver.findElement(By.id("lastName")).sendKeys("Yadav");

        driver.findElement(By.xpath("//div[@class='Xb9hP']/input[@id='username']")).sendKeys("ryadav129938");
        Thread.sleep(2000);

        driver.findElement(By.name("Passwd")).sendKeys("Xento@123");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys(("Xento@123"));

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[contains(text(),'Show')]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
        Thread.sleep(3000);

       // Select sel=new Select(driver.findElement(By.xpath("//div[@class='VfPpkd-TkwUic VfPpkd-ksKsZd-mWPk3d-OWXEXe-AHe6Kc-XpnDCe VfPpkd-ksKsZd-mWPk3d']")));
       // sel.selectByIndex(3);

        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9021987043");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();



    }
}