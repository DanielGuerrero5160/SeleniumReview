package review4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        //how to enter username and password upon the authentication pop-up
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");//the admin:admin@ is the username and password
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement chooseFileM=driver.findElement(By.xpath("//input[@multiple]"));
        chooseFileM.sendKeys("/Users/danielguerrero/Desktop/SelemiumTest/src/screenshot/iou.png");





    }
}
