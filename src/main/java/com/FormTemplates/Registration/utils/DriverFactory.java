package com.FormTemplates.Registration.utils;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class DriverFactory {
    public static WebDriver driver;
    public static PageInitialization pageInits;

    public WebDriver getDriver() {
        try {
            // Read Config
            ReadConfigFile file = new ReadConfigFile();
            System.out.println("*********************from getDriver Print configfile:"+file);
            //String browserName = file.getBrowser();
            String browserName = "chrome";

            switch (browserName) {

                case "chrome":
                    // code
                    if (null == driver) {
                        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\IdeaProjects\\Jotform\\Drivers\\chromedriver.exe");
                        ChromeOptions options = new ChromeOptions();
                        options.setPageLoadStrategy(PageLoadStrategy.NONE);
                        driver = new ChromeDriver(options);
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
                        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println("Unable to load browser: " + e.getMessage());
        } finally {

            pageInits = new PageInitialization();
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            pageInits = new PageInitialization();
        }
        return driver;
    }
}
