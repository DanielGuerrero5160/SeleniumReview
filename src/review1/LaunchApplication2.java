package review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
//driver.get("https://www.google.com/");

        driver.navigate().to("https://www.google.com/");//this does the same thing as the get method
        //the .to() method is nested inside the get method.


    }
}
