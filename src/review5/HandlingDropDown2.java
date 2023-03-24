package review5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingDropDown2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        //how to enter username and password upon the authentication pop-up
        driver.get("https://www.orangehrm.com/contact-sales/");//the admin:admin@ is the username and password
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement countryDropDown=driver.findElement(By.cssSelector("select#Form_getForm_Country"));

        Select select=new Select(countryDropDown);
       List<WebElement> countryList =select.getOptions();
       for(WebElement country:countryList){
           String countryName=country.getText();
           if(countryName.equals("Australia")){
               country.click();
               break;
           }
       }



    }
}
