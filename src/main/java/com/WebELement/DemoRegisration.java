package com.WebELement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class DemoRegisration {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        open_website("https://demo.opencart.com/index.php?route=account/register");
        //close_website();
        Registration_Testcase01();
        close_website();

    }
    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        driver=new ChromeDriver();
    }
    public static void open_website(String URL){
        driver.get(URL);
    }


    public static void Registration_Testcase01() throws InterruptedException {
        WebElement first_name= driver.findElement(By.id("input-firstname"));
        WebElement last_name = driver.findElement(By.id("input-lastname"));
        WebElement email = driver.findElement(By.id("input-email"));
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        WebElement password = driver.findElement(By.id("input-password"));
        WebElement c_password = driver.findElement(By.id("input-confirm"));
        //WebElement subscribe = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div"));
        WebElement p_policy = driver.findElement(By.name("agree"));
        WebElement continue_btn = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));

        first_name.sendKeys("nayem");
        last_name.sendKeys("emran");
        email.sendKeys(generate_Random_String()+ "@gamil.com");
        Telephone.sendKeys("019998798");
        password.sendKeys("589856");
        c_password.sendKeys("589856");
        //subscribe.click();
        p_policy.click();
        Thread.sleep(5000);
        continue_btn.click();
    }
    public static void close_website(){
        driver.close();
    }

    public static String generate_Random_String(){
        String SALTCHAR ="abcefghABCDE12345";
        StringBuilder rstr= new StringBuilder();
        Random rnd= new Random();

        while (rstr.length()<10){
            int index=(int) (rnd.nextFloat()*SALTCHAR.length());
            rstr.append(SALTCHAR.charAt(index));
        }
        String newString= rstr.toString();
        return newString;
    }

}
