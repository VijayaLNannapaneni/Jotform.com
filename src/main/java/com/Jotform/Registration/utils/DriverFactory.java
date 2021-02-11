package com.Jotform.Registration.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class DriverFactory {
    public static WebDriver driver;
    public static PageInitialization pageInits;
    public WebDriver getDriver() {          
    	System.setProperty("webdriver.chrome.driver", "C:\\workspace\\autotools\\Drivers\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);   
        pageInits = new PageInitialization();       
     return driver;
    }
}
