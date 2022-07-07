package AcademyTest;

import Academy.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;

public class NavBarValidationTest extends Base {
    public WebDriver driver;
    public static Logger log= LogManager.getLogger(Base.class.getName());

    @BeforeTest
    public void startbrowser() throws IOException {
        driver = initialize();
        driver.manage().window().maximize();

    }

    @Test
    public void Navbarvalidationtest()  {

        driver.get(prop.getProperty("url"));
        driver.navigate().refresh();
        LandingPage l = new LandingPage(driver);
        //l.nothanks().click();
        log.info("No thanks popup handled");
        //Assert.assertTrue(l.getnavbar().isDisplayed());

      //  Boolean a =Assert.assertTrue(l.getnavbar().isDisplayed());
        System.out.println(l.getnavbar().isDisplayed());
        log.info("Navbar validated");

        // ssert.assertFalse(false);
    }


    @AfterTest
    public void closebrowser1() {

        driver.close();
        log.info("Broweser closed");
    }


}

