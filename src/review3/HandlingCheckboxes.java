package review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingCheckboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();
        //clicking monday box
        WebElement mondayBox=driver.findElement(By.xpath("//input[@id='monday']"));
        mondayBox.click();
//making a list of checkboxes and clicking each one
        List<WebElement> elementList=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
        for(WebElement e:elementList){
            e.click();
        }

    }
}
