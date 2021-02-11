 package com.FormTemplates.Registration.pageObjects;

 import com.FormTemplates.Registration.utils.DriverFactory;
 import org.junit.Assert;
 import org.openqa.selenium.JavascriptExecutor;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.ui.ExpectedConditions;
 import org.openqa.selenium.support.ui.WebDriverWait;

 import java.io.IOException;

 public class BasePage extends DriverFactory {
     protected WebDriverWait wait;
     protected JavascriptExecutor jsExecutor;
     public static String webData = null;

     public BasePage() throws IOException {
         this.wait = new WebDriverWait(driver, 15);
         jsExecutor = ((JavascriptExecutor) driver);
     }

     public BasePage loadUrl(String url) throws Exception {
         driver.get(url);
         return new BasePage();
     }

     public BasePage navigateTo(String url) throws Exception {
         driver.navigate().to(url);
         return new BasePage();
     }

     public boolean WaitUntilWebElementIsVisible(WebElement element) {
         try {
             this.wait.until(ExpectedConditions.visibilityOf(element));
             System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
             return true;
         } catch (Exception e) {
             System.err.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
             Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
             return false;
         }
     }
    // wait method
     //Throws IOException
     public void waitAndClickElement(WebElement element) throws InterruptedException, IOException {
         boolean clicked = false;
         int attempts = 0;
         while (!clicked && attempts < 10) {
             try {
                 this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                 System.out.println("Successfully clicked on the WebElement: " + "<" + element.toString() + ">");
                 clicked = true;
             } catch (Exception e) {
                 System.err.println("Unable to wait and click on WebElement, Exception: " + e.getMessage());
                 Assert.fail(
                         "Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
             }
             attempts++;
         }
     }










 }