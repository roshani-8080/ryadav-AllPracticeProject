package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    By nthnx = By.xpath("//button[text()='NO THANKS']");
    By loginoption = By.cssSelector("a[href*='sign_in']");
    By title = By.xpath("//h2[text()='Featured Courses']");
    By navbar=By.xpath("//ul[@class='nav navbar-nav navbar-right']/li");


    public WebElement nothanks() {

        return driver.findElement(nthnx);

    }

    public WebElement loginoption() {
        return driver.findElement(loginoption);
    }

    public WebElement gettitle() {
        return driver.findElement(title);
    }
    public WebElement getnavbar() {
        return driver.findElement(navbar);
    }


}
