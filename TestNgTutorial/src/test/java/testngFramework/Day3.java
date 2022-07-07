package testngFramework;

import org.testng.annotations.Test;

public class Day3 {
    @Test(dependsOnMethods = {"mydivision"})
    public void myclass()
    {
        System.out.println("Class in college");
    }
    @Test
    public void mycolllage()

    {
        System.out.println("Collage in Pune");
    }
    @Test
    public void mydivision()

    {
        System.out.println("Classe have  various divisions");
    }
}
