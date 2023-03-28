package review6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingDatePicker {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        //how to enter username and password upon the authentication pop-up
        driver.get("https://www.redbus.in/");//the admin:admin@ is the username and password
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement date=driver.findElement(By.xpath("//label[text()='Date']"));
        date.click();

         driver.findElement(By.xpath("//td[@class='next']"));
        while (true){
            String monthYear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            String[] ym=monthYear.split(" ");
            if(ym[0].equalsIgnoreCase("Aug")&& ym[1].equalsIgnoreCase("2023")){
          List<WebElement> days= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr//td"));
          for (WebElement day:days){
              if (day.getText().equalsIgnoreCase("19")){
                  day.click();
                  break;
              }

          }
            }else{
                driver.findElement(By.xpath("//td[@class='next']")).click();
            }

        }

    }
}
