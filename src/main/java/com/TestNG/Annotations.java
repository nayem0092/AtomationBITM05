package com.TestNG;

import org.testng.annotations.*;

public class Annotations {
    @BeforeClass
    public void browser_config(){
        System.out.println("Browser launch Succesdfully");
    }

   @Test(priority = -1)
   public void login_test_valid_001(){
       System.out.println("Login Valid test passed");

   }

    @Test(priority = 1)
    public void login_test_Invalid_002(){
        System.out.println("Login Invalid Test Passed");

    }
   @AfterClass
   public void browser_close(){
       System.out.println("Test complete.Browser closed");

   }

}
