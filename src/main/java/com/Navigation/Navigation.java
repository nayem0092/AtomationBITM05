package com.Navigation;

import com.Browers.BrowserConfig;

public class Navigation extends BrowserConfig {
    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        open_website("https://www.google.com/");
        navigate_to();
        Thread.sleep(2000);
        navigate_back();
        Thread.sleep(2000);
        navigate_forward();
        Thread.sleep(2000);
        navigate_reload();
        Thread.sleep(2000);
        close_browser();

    }

    public static void navigate_to(){
        driver.navigate().to("https://demo.opencart.com/");

    }

    public static void navigate_back(){
        driver.navigate().back();
    }

    public static void navigate_forward(){
        driver.navigate().forward();

    }

    public static void navigate_reload(){
        driver.navigate().refresh();

    }
}
