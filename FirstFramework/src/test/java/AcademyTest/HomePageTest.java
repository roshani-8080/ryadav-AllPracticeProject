package AcademyTest;

import Academy.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;
import pageObjects.LandingPage;
import pageObjects.Loginpage;

import java.io.IOException;

public class HomePageTest extends Base {
    public WebDriver driver;
    public static Logger log= LogManager.getLogger(Base.class.getName());


    @BeforeTest
    public void startbrowser() throws IOException {
        driver = initialize();
        driver.manage().window().maximize();


   }

    @Test(dataProvider ="getdata")
    public void basepageNavigation(String user,String pass) throws InterruptedException, IOException {
        /*driver = initialize();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();*/
        driver.get(prop.getProperty("url"));

        driver.navigate().refresh();

        LandingPage lp = new LandingPage(driver);
        Thread.sleep(3000);
        //lp.nothanks().click();
        lp.loginoption().click();
        Loginpage lop = new Loginpage(driver);
        lop.useremail().sendKeys(user);
        lop.userpassward().sendKeys(pass);
        //System.out.println(text);
        log.info("Data inserted");

        Thread.sleep(3000);
        lop.loginbutton().click();


    }

    @DataProvider
    public Object[][] getdata() {
        Object[][] data = new Object[2][2];
        data[0][0] = "pqr@gmail.com";
        data[0][1] = "1234";
        //data[0][2] = "First user";


        data[1][0] = "lmn@gmail.com";
        data[1][1] = "1234";
       // data[1][2] = "Second user";
        return data;

    }
 @AfterTest
public void closebrowser()
    {
        driver.close();
    }
}
