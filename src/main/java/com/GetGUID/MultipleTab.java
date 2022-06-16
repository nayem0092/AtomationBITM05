package com.GetGUID;

import com.Browers.BrowserConfig;
import org.openqa.selenium.By;

import java.util.Set;

public class MultipleTab extends BrowserConfig {
    public static void main(String[] args) {
        chrome_launch();
        open_website("https://the-internet.herokuapp.com/");
    }

    public static void switchWindow(){
        String parentGUID= driver.getWindowHandle();
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> allGuids= driver.getWindowHandles();


        for(String ChildGuid:allGuids){
            if (!ChildGuid.equals(parentGUID)){
                driver.switchTo().window(ChildGuid);
                driver.get("https://google.com");
            }
        }
    }
}
