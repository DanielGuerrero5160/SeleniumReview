package review2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.navigate().to("https://www.facebook.com/");
        String pageTitle= driver.getTitle();
        System.out.println("The title of the page is: "+pageTitle);




    }
}