package Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";

        //Lunch the Chrome Browser
        WebDriver driver=new ChromeDriver();
        //open the Url into Browser
        driver.get(baseurl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title=driver.getTitle();
        System.out.println("Page Title is"+title);
        //Print the current Url
        System.out.println("Current Url"+driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source"+driver.getPageSource());

        //Find the Email Field Element
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("admin@123.com");

        //Type the password field and type the password
        driver.findElement(By.name("password")).sendKeys("12345");

        //close The Browser
        driver.close();


    }
}
