package review6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HandlingDragDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        //how to enter username and password upon the authentication pop-up
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");//the admin:admin@ is the username and password
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement iframe= driver.findElement(By.xpath("//iframe[@id='aswift_0']"));
        WebElement rome=driver.findElement(By.xpath("//div[text()='Rome' and @id='box6']"));
        WebElement dropItaly=driver.findElement(By.xpath("//div[@id='box106']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(rome,dropItaly).perform();

       if(rome.getAttribute("style").equals("visibility: hidden; background-color: rgb(0, 255, 0);")){
           System.out.println("Button is green");
       }

    }
}
