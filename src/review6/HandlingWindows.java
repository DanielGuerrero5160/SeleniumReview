package review6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement startFreeTrailButton=driver.findElement(By.xpath("(//a[@aria-label='Start my free trial with Salesforce CRM'])[1]"));
        startFreeTrailButton.click();
       Set<String> windowIDs=driver.getWindowHandles();
       for (String id:windowIDs){
           driver.switchTo().window(id);
           if(driver.getTitle().contains("Free CRM")){
               driver.findElement(By.name("UserFirstName")).sendKeys("Dagobert");
               driver.findElement(By.name("UserLastName")).sendKeys("Duck");
           }
       }
driver.quit();
    }
}
