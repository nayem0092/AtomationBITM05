package com.DropDown;

import com.Browers.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BrowserConfig {
    public static void main(String[] args) {
        chrome_launch();
        open_website("https://the-internet.herokuapp.com/dropdown");
        selectOption();
    }
    public static void selectOption(){
        WebElement dropdown= driver.findElement(By.id("dropdown"));
        Select slt=  new Select(dropdown);
        slt.selectByIndex(1);
        slt.selectByValue("2");
        slt.deselectByVisibleText("Option 1");
    }
}
