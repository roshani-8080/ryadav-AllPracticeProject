package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
    WebDriver driver;
    public Loginpage(WebDriver driver){
        this.driver=driver;
    }

    By username=By.id("user_email");
    By passward=By.id("user_password");
    By loginbtn=By.cssSelector("input[value='Log In']");


    public WebElement useremail()
    {
        return driver.findElement(username);
    }
    public WebElement userpassward()
    {
        return driver.findElement(passward);
    }
    public WebElement loginbutton()
    {
        return driver.findElement(loginbtn);
    }
}
