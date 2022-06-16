package com.WebELement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin {
    public static WebDriver driver;

    public static void main(String[] args) {
        chrome_launch();
        open_website("https://www.facebook.com/");
        //close_website();
        login_Testcase01();

    }
    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        driver=new ChromeDriver();
    }
    public static void open_website(String URL){
        driver.get(URL);
    }
    public static void close_website(){
        driver.close();
    }

    public static void login_Testcase01(){
        WebElement email= driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        WebElement login_btn = driver.findElement(By.name("login"));

        email.sendKeys("abc@gmail.com");
        password.sendKeys("589856");
        login_btn.click();
    }
}
