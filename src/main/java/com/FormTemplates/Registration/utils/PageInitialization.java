package com.FormTemplates.Registration.utils;
import com.FormTemplates.Registration.pageObjects.StudentRegistrationForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageInitialization {
    public WebDriver driver;
    public StudentRegistrationForm studentRegForm;

    public PageInitialization() {
        driver = DriverFactory.driver;
        studentRegForm = PageFactory.initElements(driver, StudentRegistrationForm.class);
    }
}
