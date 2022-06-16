package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(priority = 4,description = "Emanil and passward valid")
    public void testCase_Valid_001(){
        System.out.println("Test Case 1 Executed");
    }
    @Test(priority = 3,description = "Emanil and inpassward valid")
    public void testCase_InValid_002(){
        System.out.println("Test Case 2 Executed");
        //String Expected_title="Google";
        //Assert.assertEquals("Facebook",Expected_title);

    }
    @Test(priority = 2,description = "Emanil and inpassward valid")
    public void testCase_InValid_003(){
        System.out.println("Test Case 3 Executed");

    }

    @Test(enabled = false,priority = 1,description = "Emanil and inpassward valid")
    public void testCase_InValid_004(){
        System.out.println("Test Case 4 Executed");

    }
}
