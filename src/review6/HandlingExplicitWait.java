package review6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HandlingExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.janbaskdemo.com/");
        driver.manage().window().maximize();
        WebElement personButton=driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        personButton.click();
        WebDriverWait wait=new WebDriverWait(driver,20);//creating an instance of the explicit wait
       WebElement loginButton= driver.findElement(By.xpath("//a[text()='Login']"));
       //then give the wait conditions, in this case, to be clickable
       wait.until(ExpectedConditions.elementToBeClickable(loginButton));
       //when the condition is passed, then it will move onto the click method
       loginButton.click();

    }
}
