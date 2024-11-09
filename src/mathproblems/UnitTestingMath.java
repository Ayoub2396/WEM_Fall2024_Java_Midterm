package mathproblems;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTestingMath {
    /*public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

    }*/
    @BeforeClass
    public static void beforeTest(){
        System.out.println("Unit testing for mathproblems begin");
    }

        Factorial fact1=new Factorial();
    // list out all the assertion for all of the math problem classes
    @Test
    public  void recurios(){
        int fact=fact1.recursionFactorial(5);
        Assert.assertEquals(120,fact);

    }
    @Test
    public void factoriel(){
        int input=5;
        int expected=120;
        int fa=fact1.iterativeFactorial( input);

        Assert.assertEquals(expected,fa);


    }


    @AfterClass
    public static void afterTest(){
        System.out.println("Unit testing done!!");
    }


}
