package Academy;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
public WebDriver driver;
public  Properties prop;
public  ChromeOptions options;
    public WebDriver initialize() throws IOException {
         prop=new Properties();
        FileInputStream fis=new FileInputStream("D:\\FirstFramework\\src\\main\\resources\\data.properties");

        prop.load(fis);
        String browserName=prop.getProperty("browser");

        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
            options=new ChromeOptions();
            driver = new ChromeDriver(options);
        }

        else if (browserName.equals("firefox"))
        {

        }
        else if (browserName.equals("IE"))
        {

        }

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return driver;
    }

    public String getscreenshotpath(String testcasename, WebDriver driver) throws IOException {
        TakesScreenshot ts= (TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        String dest=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";

        FileUtils.copyFile(src,new File(dest));

        return dest;
    }
}
