package com.Browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

public class BrowserConfig {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        browder_maximun_size();
        open_website("http://google.com");
        open_website("http://facebook.com");
        //close_browser();
        browser_quit();
        //firefox_launch();
        //open_website("http://google.com");


    }
    public static void chrome_launch(){
      System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
      driver=new ChromeDriver();
    }

    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./Drivers/");
        driver=new FirefoxDriver();
    }
    public static void open_website(String URL){
        driver.get(URL);
    }

    public static void close_browser(){
        driver.close();
    }

    public static void browser_quit(){
        driver.quit();
    }

    public static void browder_maximun_size(){

        int max_height = driver.manage().window().getSize().getHeight();
        int max_width = driver.manage().window().getSize().getWidth();
        System.out.print("Maximun Height :"+max_height + "Maximun Width :"+max_width);
    }

}
