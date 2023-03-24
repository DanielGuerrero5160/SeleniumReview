package review5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CustomCssSelectors {
    public static void main(String[] args) {
        //how to locate elements using CSS
        //CSS to find by id ##value of ID

        System.setProperty("webdriver.chrome.driver","/Users/danielguerrero/Desktop/Selenium Review/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        //how to enter username and password upon the authentication pop-up
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");//the admin:admin@ is the username and password
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement firstName=driver.findElement(By.cssSelector("input#input-firstname"));//or we can write #input-firstname
        //the CSS in the firstname element is better, we are specifying tagName#value in ID

        //class in CSS => .   EX: .classValue or we can write as tagName.classValue
        //for multiple classes (when there is a space between the values of a class in an element) we separte each one by a .
        //ex. formcontrol.otherclassvalue.lastclass value
        //we cna also put the tage name before it tagName.c1.c2.c3.c4
        //it does not matter what the order of the class values is, we can put them in any order
        //EX: .c2.c1.c5.c3 -DOES NOT MATTER THE ORDER THEY ARE IN THE DOM
    }
}
