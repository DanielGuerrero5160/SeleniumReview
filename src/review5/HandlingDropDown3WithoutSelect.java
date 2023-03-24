package review5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingDropDown3WithoutSelect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        //how to enter username and password upon the authentication pop-up
        driver.get("https://www.hdfcbank.com/");//the admin:admin@ is the username and password
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //create a webelement of the drop down
        WebElement productTypeDropDown=driver.findElement(By.xpath("//a[text()='Select Product Type']"));
        //click the drop down
        productTypeDropDown.click();
        //store list of all elements int the drop down.
        List<WebElement> products=driver.findElements(By.xpath("//div[@class='dropdown open']//li"));
        for(WebElement product:products){
            String text=product.getText();
            if(text.equals("EMI")){
                product.click();
                break;
            }
        }
    }
}
