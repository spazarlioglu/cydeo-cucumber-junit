package com.cydeo.utilities;

import com.sun.jna.WString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    /*
 This method will accept int (in seconds) and execute Thread.sleep
 for given duration
  */
    public static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch(InterruptedException e){

        }

    }
    public static void switchWindowAndVerify( String expectedInUrl, String expectedTitle){
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();
        //System.out.println(windows);

        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL: "+Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl))
                break;
        }

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    /*
   This method accepts a String "expectedTitle" and Asserts if it is true
    */
    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    /*
   Creating a utility method for ExplicitWait, so we don't have to repeat the lines
    */
    public static void waitForInvisibilityOf(WebElement webElement){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    /**
     * This method will accept a String as expected value  and verify actual URL Contains the value
     * @param expectedInUrl
     */
    public static void verifyTitleContains(String expectedInUrl){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInUrl));
    }

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){
        Select select=new Select(dropdownElement);
        List< WebElement> actualOptionsAsWebElement=select.getOptions();
        List<String> actualOptionsAsString=new ArrayList<>();

        for(WebElement each: actualOptionsAsWebElement){
            actualOptionsAsString.add(each.getText());
        }
        return actualOptionsAsString;
    }
}
