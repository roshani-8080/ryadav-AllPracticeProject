import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D://chromedriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://sso.entratadev.com/auth/view_login?SAMLRequest=jZJRa9swFIX%2FijFkb4kV280SzfYIzQqBtA9tt4e9iBvppjFYkqd73e6pv32KS2m6wtiLEPdwPs49UkVgu16uBz66W%2Fw1IHHy23aO5CjU6RCc9EAtSQcWSbKWd%2BvrncxnQvbBs9e%2BS88s%2F3YAEQZuvUuT7aZOVbnIF6acgzZ7gctS7wvA1TLPsSgOxapYCbNawGGRF8s0%2BYGBorNOIyjaiQbcOmJwHEcin09FORWf7%2BdCCiEvyp9psonbtA54dB2Ze5JZRuRn6DgAg8HHmfY2g7j9eMR5q4ExTdavQS%2B9o8FiuMPw2Gr8frt7Q%2BmujQ4wtnWzGOQB%2FwZ%2Ftd4MHdZn7Ij8BLb%2FAnqM1fmH1ilgRtvzKATk2KAaQldP8qtJcfXCmBSb064GglEG6Lj38TZ1%2BJQ21al3ORYSmsvd9tvNvVpvrrc3z1I%2B%2F2%2FWKjunVHog9lY5b7Cp7NBxqw4xso8Sh6hhTIGnQrKmOvigURFq74zq4xM%2F%2BWDiPHvvy94xs48fr%2FkD&RelayState=https%3A%2F%2Fclientadmin.stage.entratadev.com%2F%3Fmodule%3Dauthentication%26action%3Dlogin_attempt%26return_url%3D%252F%253Fmodule%253Dstandard_dashboard-new");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ryadav01");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Xento123");
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@class='target ca-quick-search']")).sendKeys("ar55");
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();







    }
    }
