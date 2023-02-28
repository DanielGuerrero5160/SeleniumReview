package review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();

    }
}
