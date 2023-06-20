package Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MultiBrowser {
    static  String browser="FireFox";

    static String baseurl="https://opensource-demo.orangehrmlive.com/";
     static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

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
