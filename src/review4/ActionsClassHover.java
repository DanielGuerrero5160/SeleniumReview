package review4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClassHover {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        //how to enter username and password upon the authentication pop-up
        driver.get("https://demo.opencart.com/");//the admin:admin@ is the username and password
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement componentsTab=driver.findElement(By.xpath("//a[text()='Components']"));
        Actions actions=new Actions(driver);
        //hover over a tab
        actions.moveToElement(componentsTab).perform();
        //move to an element in the dropdown of the tab and click it
        WebElement option=driver.findElement(By.xpath("//a[contains(text(),'Monitors')]"));
        actions.moveToElement(option).click().perform();
    }
}
