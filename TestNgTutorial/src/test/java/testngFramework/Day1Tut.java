package testngFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1Tut {
 //   @Parameters({"URL"})
    @Test
  // public void m1(String urlname,String pass)
    public void m1()

    {
        System.out.println("Hello");
       // System.out.println(urlname);
      //  System.out.println(pass);
    }
    @Test
    public void m2()
    {
        System.out.println("Bye");
    }



    @Test(dataProvider = "mydata")
    public void Demo7(String username,String Password)
    {
        System.out.println("Demo7");
        System.out.println(username);
        System.out.println(Password);
    }


    @DataProvider()
    public Object[][] mydata() {
        Object[][] data = new Object[3][2];
        data[0][0] = "Firstname";
        data[0][1] = "Password";

        data[1][0] = "Secondname";
        data[1][1] = "Password2";

        data[2][0] = "Thirdname";
        data[2][1] = "Password3";
        return data;
    }

}
