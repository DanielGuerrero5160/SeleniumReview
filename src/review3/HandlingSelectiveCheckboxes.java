package review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingSelectiveCheckboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();
        List<WebElement> days=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
        for(WebElement e:days){
            if(e.getAttribute("id").equals("tuesday")||e.getAttribute("id").equals("thursday")||e.getAttribute("id").equals("saturday")) {
                e.click();
            }
        }
        //normal for loop for clicking all the checkboxes in the list
       // for (int i = 0; i < days.size(); i++) {
       //     days.get(i).click();

        //}
    }
}
