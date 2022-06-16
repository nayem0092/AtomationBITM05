package com.GetGUID;

import com.Browers.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetGuid extends BrowserConfig {
    public static void main(String[] args) {
        chrome_launch();
        open_website("https://the-internet.herokuapp.com/");
        get_guid();
        close_browser();
    }

    public static void get_guid(){
        String parentGUID= driver.getWindowHandle();
        System.out.println(parentGUID);

        driver.findElement(By.linkText("Click Here")).click();
        Set<String> allGuids= driver.getWindowHandles();
        System.out.println(allGuids);
    }
}
