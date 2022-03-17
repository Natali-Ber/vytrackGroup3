package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import com.vytrack.utilities.ConfigurationReader;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CY3_65_Elif extends TestBase {

    @Test          // ==CY3-97==
    public void loginStoreManager() {

        //Log in as a store
        VytrackUtils.loginAsStoreManger();

        //Go to "Fleet" tab
        WebElement fleetTableElement = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetTableElement.click();
        BrowserUtils.sleep(2);

        //Click "Vehicle Odometer" option
        WebElement vehicleOdometerOption = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Odometer']"));
        vehicleOdometerOption.click();
        BrowserUtils.sleep(2);

        //Verify the managers see this message:
        WebElement resultText = Driver.getDriver().findElement(By.xpath("(//div[@class='message'])[2]"));
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed.");
        String expectedText = "You do not have permission to perform this action.";
        String actualText = resultText.getText();
        Assert.assertEquals(actualText, expectedText, "Actual result test is not as expected!!!");
        System.out.println(actualText);


    }

    @Test        // ==CY3-97==
    public void loginSalesManager() {

        //Log in as a store
        VytrackUtils.loginAsSalesManager();

        //Go to "Fleet" tab
        WebElement fleetTableElement2 = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetTableElement2.click();
        BrowserUtils.sleep(2);

        //Click "Vehicle Odometer" option
        WebElement vehicleOdometerOption = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Odometer']"));
        vehicleOdometerOption.click();
        BrowserUtils.sleep(2);

        //Verify the managers see this message:
        WebElement resultText = Driver.getDriver().findElement(By.xpath("(//div[@class='message'])[2]"));
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed.");
        String expectedText = "You do not have permission to perform this action.";
        String actualText = resultText.getText();
        Assert.assertEquals(actualText, expectedText, "Actual result test is not as expected!!!");
        System.out.println(actualText);


    }

    @Test     //==CY3-98==
    public void LoginDriver() {

        //Log in as a driver
        VytrackUtils.loginAsDriver();

        //Go to "Fleet" tab
        WebElement fleetTableElement = Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetTableElement.click();
        BrowserUtils.sleep(2);

        //Click "Vehicle Odometer" option
        WebElement vehicleOdometerOption = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Odometer']"));
        vehicleOdometerOption.click();
        BrowserUtils.sleep(2);

        //Verify the default page number is 1
        WebElement page = Driver.getDriver().findElement(By.xpath("//input[@value='1']"));
        BrowserUtils.sleep(2);


    }

    @Test      //==CY3-99==
    public void CheckPage() {

        //Log in as a driver
        VytrackUtils.loginAsDriver();

        //Go to "Fleet" tab
        WebElement fleetTableElement = Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetTableElement.click();
        BrowserUtils.sleep(2);

        //Click "Vehicle Odometer" option
        WebElement vehicleOdometerOption = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Odometer']"));
        vehicleOdometerOption.click();
        BrowserUtils.sleep(2);

        //Verify the default view per page is 25
        WebElement viewPerPage = Driver.getDriver().findElement(By.xpath("//button[@data-toggle='dropdown']"));
        BrowserUtils.sleep(2);




    }




}


