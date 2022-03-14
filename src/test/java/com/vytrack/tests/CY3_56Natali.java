package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CY3_56Natali extends TestBase {


    @Test(priority = 1)
    public void CY3_56_1TruckDriver() throws InterruptedException {

        //1. User locate TruckDriver Username and Password
        WebElement username = Driver.getDriver().findElement(By.id("prependedInput"));
        username.sendKeys("user14");

        WebElement password = Driver.getDriver().findElement(By.id("prependedInput2"));

        password.sendKeys("UserUser123");

        //2.User  click LOG IN button
        WebElement loginclick = Driver.getDriver().findElement(By.id("_submit"));
        loginclick.click();


        //3.locating  User click question icon on the right top of the homepage
        WebElement questionIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa-question-circle']"));
        Thread.sleep(2000);
        questionIcon.click();

        //4.create Array list for window Hendles
       ArrayList<String> allWindowHandles = new ArrayList<>(Driver.getDriver().getWindowHandles());

        //5.switch driver for my second page
                Driver.getDriver().switchTo().window(allWindowHandles.get(1));


        //6. Getting URL for second window
        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        String expectedURL = "https://doc.oroinc.com/";


        //7. Confirm actual URL and expected URL
        Assert.assertEquals(actualURL, expectedURL, "URL aren't match");



    }


    @Test  (priority = 2)
    public void CY3_56_1StoreManager() throws InterruptedException {

        //1. User locate StoreManager Username and Password
        // NEXT 6 STEPS SAME as first test
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("storemanager61");
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");

        WebElement loginclick = Driver.getDriver().findElement(By.xpath("//button[@id='_submit']"));
        loginclick.click();


        WebElement questionIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa-question-circle']"));
        Thread.sleep(2000);
        questionIcon.click();

        ArrayList<String> allWindowHandles = new ArrayList<>(Driver.getDriver().getWindowHandles());

        Driver.getDriver().switchTo().window(allWindowHandles.get(1));


        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        String expectedURL = "https://doc.oroinc.com/";

        Assert.assertEquals(actualURL, expectedURL, "URL aren't match");



    }
    @Test(priority = 3)
    public void CY3_56_1SalesManager() throws InterruptedException {

        //1. User locate SalesManager Username and Password
        // NEXT 6 STEPS SAME
        WebElement username = Driver.getDriver().findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager121 ");

        WebElement password = Driver.getDriver().findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");


        WebElement loginclick = Driver.getDriver().findElement(By.id("_submit"));
        loginclick.click();


        WebElement questionIcon= Driver.getDriver().findElement(By.xpath("//i[@class='fa-question-circle']"));
        Thread.sleep(2000);
        questionIcon.click();

        ArrayList<String> allWindowHandles = new ArrayList<>(Driver.getDriver().getWindowHandles());

        Driver.getDriver().switchTo().window(allWindowHandles.get(1));


        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        String expectedURL = "https://doc.oroinc.com/";

        Assert.assertEquals(actualURL, expectedURL, "URL aren't match");



    }

}
