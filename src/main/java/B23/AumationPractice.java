package B23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AumationPractice {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();


    }
}
