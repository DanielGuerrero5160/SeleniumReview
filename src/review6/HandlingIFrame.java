package review6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingIFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //switch to first iframe
        WebElement packagesFrame=driver.findElement(By.xpath("//iframe[@name='packageListFrame']"));
        driver.switchTo().frame(packagesFrame);
        //click on element in frame
        WebElement packagesLink=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi' and @target='packageFrame']"));
        packagesLink.click();
        //switch back to main page
        driver.switchTo().defaultContent();
        //switch to second frame
        WebElement lowerFrame=driver.findElement(By.xpath("//iframe[@title='All classes and interfaces (except non-static nested types)']"));
        driver.switchTo().frame(lowerFrame);
        //click on element
        WebElement hasBiDi= driver.findElement(By.xpath("//span[text()='HasBiDi']"));
        hasBiDi.click();
        //go back to main page
        driver.switchTo().defaultContent();
        //switch to final frame
        WebElement finalframe=driver.findElement(By.xpath("//iframe[@name='classFrame']"));
        driver.switchTo().frame(finalframe);
        //click on element
        WebElement firefox= driver.findElement(By.xpath("//a[text()='FirefoxDriver']"));
        firefox.click();

    }
}
