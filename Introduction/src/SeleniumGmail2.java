//import org.apache.bcel.generic.Select;
//import org.apache.james.mime4j.message.Message;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumGmail2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D://chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://accounts.google.com/signup?hl=en-GB"); //Navigating to web page.

        driver.findElement(By.id("FirstName")).sendKeys("");  //Entering First Name.

        WebElement TxtBoxContent = driver.findElement(By.id("errormsg_0_LastName")); //Object creation of web element.

        TxtBoxContent.getText();  //Fetching value of error message through "TxtBoxContent" object.

        Object obj= new Object();   //Creating New Object.

        obj=driver.findElement(By.id("FirstName"));    // Assigning value to Object.

        if(obj==null)
        {
            System.out.println(TxtBoxContent);   //Comparing First Name Blank Field.
        }
        Thread.sleep(1000);

        driver.findElement(By.id("LastName")).sendKeys("");    //Entering Last Name.

        Object obj1= new Object();  //Creating New Object

        obj1=driver.findElement(By.id("LastName"));   // Assigning value to Object.

        if(obj1==null)
        {
            System.out.println(TxtBoxContent);   //Comparing First Name Blank Field.
        }
        Thread.sleep(1000);

        driver.findElement(By.id("GmailAddress")).sendKeys(""); //Entering Unique New Email Id.



        Thread.sleep(1000);

        driver.findElement(By.id("Passwd")).sendKeys(""); //Entering Password.

        Object obj3=new Object();   //Creating New Object.

        obj3=driver.findElement(By.id("Passwd"));  // Assigning value to Object.

        if(obj3==null)
        {
            System.out.println(TxtBoxContent);  //Comparing Password Blank Field.
        }
        Thread.sleep(1000);

        driver.findElement(By.id("PasswdAgain")).sendKeys(""); //Entering Confirm Password.

        Object obj4=new Object();   //Creating New Object.

        obj4=driver.findElement(By.id("PasswdAgain")); // Assigning value to Object.

        if(obj4==null)
        {
            System.out.println(TxtBoxContent);   //Comparing Confirm Password Blank Field.
        }
        Thread.sleep(1000);

        driver.findElement(By.id("BirthDay")).sendKeys(""); //Entering BirthDay.

        Object obj5=new Object();  //Creating New Object.

        obj5=driver.findElement(By.id("BirthDay"));  //Assigning value to new object.

        if(obj5==null)
        {
            System.out.println(TxtBoxContent);  //Comparing Blank Birthday.
        }
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#BirthMonth > div.goog-inline-block.goog-flat-menu-button.jfk-select")).sendKeys("");  //Entering BirthMonth

        Object obj6=new Object();  //Creating New Object.

        obj6=driver.findElement(By.cssSelector("#BirthMonth > div.goog-inline-block.goog-flat-menu-button.jfk-select")); //Assigning value to Object.

        if(obj6==null)
        {
            System.out.println(TxtBoxContent);  //Comparing Blank Birth Month.
        }
        Thread.sleep(1000);


        driver.findElement(By.id("BirthYear")).sendKeys(""); //Entering Birth year.

        Object obj7=new Object();  //Creating New Object.

        obj7=driver.findElement(By.id("BirthYear"));  //Assigning Value to Element.

        if(obj7==null)
        {
            System.out.println(TxtBoxContent);  //Comparing Blank Birth Year.
        }
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#Gender > div.goog-inline-block.goog-flat-menu-button.jfk-select")).sendKeys("");  //Entering Gender.

        Object obj8=new Object();  //Creating New Object.

        obj8=driver.findElement(By.cssSelector("#Gender > div.goog-inline-block.goog-flat-menu-button.jfk-select")); //Assigning Value to Object

        if(obj8==null)
        {
            System.out.println(TxtBoxContent);  //Comparing Gender Blank
        }
        Thread.sleep(1000);

        driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys(""); //Entering Phone Number.

        Object obj9=new Object();  //Creating new Object.

        obj9=driver.findElement(By.id("RecoveryPhoneNumber"));  //Assigning Value to object.

        if(obj9==null)
        {
            System.out.println(TxtBoxContent);  //Comparing Blank Phone No.
        }
        Thread.sleep(1000);

        driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("");  //Entering Recovery Mail.

        Object obj10=new Object();  //Creating New Object.

        obj10=driver.findElement(By.id("RecoveryEmailAddress")); //Assigning Value to Object.

        if(obj10==null)
        {
            System.out.println(TxtBoxContent); //Comparing Blank Recovery Field.
        }
        driver.findElement(By.cssSelector("#SkipCaptcha")).click();  //Skip CAPTCHA Image

        Thread.sleep(1000);

        driver.findElement(By.id("TermsOfService")).click(); // Selecting Terms & Condition Checkbox.

        Thread.sleep(1000);

        driver.findElement(By.id("submitbutton")).click(); //Click on Submit Button.

        driver.findElement(By.id("next-button")).click();  //Click on next Button.



        Thread.sleep(30000);  //Wait for OTP on mobile & Fill OTP.

        driver.findElement(By.name("VerifyPhone")).click();  //Click SUBMIT && Email Created.
    }

}


