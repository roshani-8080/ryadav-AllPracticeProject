package testngFramework;

import org.testng.annotations.*;

public class Day2Tut {
    @BeforeSuite
    public void Beforest(){
        System.out.println("I will start execution first");
    }
    @AfterSuite
    public void Afterst(){
        System.out.println("I will End the Execution");
    }
    @BeforeClass
    public void Beforecls(){
        System.out.println("I will start Class Execution");
    }
    @AfterClass
    public void Aftercls()
    {
        System.out.println("I will End the Class Execution");
    }
    @BeforeTest
    public void Beforetst(){
        System.out.println("Start test execution");
    }
    @AfterTest
    public void Aftertst()
    {
        System.out.println("End test execution");
    }
    @BeforeMethod
    public void Beforemth()
    {
        System.out.println("Method Started");
    }
    @AfterMethod
    public void Aftermth()
    {
        System.out.println("Method Ended");
    }
    @Test(enabled = false)
    public void Demom1()
    {
        System.out.println("Demom1");
    }
    @Test(dependsOnMethods = {"Demom5"})
    public void Demom2()
    {
        System.out.println("Demom2");
    }

    @Test(groups = {"smoke"})
    public void Demom3()
    {
        System.out.println("Demom3");
    }
    @Test(timeOut = 3000)
    public void Demom4()
    {
        System.out.println("Demom4");
    }
    @Test(groups = {"smoke"})
    public void Demom5()
    {
        System.out.println("Demom5");
    }
    @Parameters({"URL1","URL2"})
    @Test
    public void Demo6(String demourl,String entrata1)
    {
        System.out.println("Demo6");
        System.out.println(demourl);
        System.out.println(entrata1);
    }

    }




