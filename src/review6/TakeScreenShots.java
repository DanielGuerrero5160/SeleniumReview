package review6;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakeScreenShots {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //take a screenshot and save it to a file
        TakesScreenshot ts=(TakesScreenshot) driver;
       File src=ts.getScreenshotAs(OutputType.FILE);
       //save the screenshot to a specified location
      File target= new File("/Users/danielguerrero/Desktop/Screenshots/iou.png");
      //the iou.png is just the name of the screenshot then .filetype, in this case PNG
        FileUtils.copyFile(src,target);
    }
}
