package AcademyTest;

import Academy.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;

public class TitleValidationTest extends Base {
    public WebDriver driver;

    public static Logger log= LogManager.getLogger(Base.class.getName());

    @BeforeTest
    public void startbrowser() throws IOException {
        driver = initialize();
        log.info("Driver Initialized");
        driver.get(prop.getProperty("url"));
        log.info("Navigated to home page");
        driver.manage().window().maximize();

    }

    @Test
    public void ValidateTitle() {

        LandingPage l = new LandingPage(driver);
        l.nothanks().click();
        Assert.assertEquals(l.gettitle().getText(), "FEATURED COURSES123");
        log.info("Successfully Validated");

    }

    @AfterTest
    public void closebrowser3() {
        driver.close();


    }
}


