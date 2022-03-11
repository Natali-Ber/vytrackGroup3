package com.vytrack.tests;

import com.google.common.base.Verify;
import com.vytrack.pages.VytrackPage;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Calendar;

public class CY3_64_Atakan extends VytrackUtils {

    VytrackPage vytrackPage;
    String messageSample = "scrum daily meeting";

    @Test(priority = 1)
    public void description_Field_DriverTest() throws InterruptedException {
        loginAsDriver();
        //    1 Drivers are on the homepage
        vytrackPage = new VytrackPage();
        //    2 Click the “Calendar Events” under the Activities
        vytrackPage.action(vytrackPage.activitiesBtn);
        vytrackPage.calendarEventsBtn.click();
        //    3 Click the “Create Calendar Event” button
        Thread.sleep(2000);
        vytrackPage.creatCalendarEventBtn.click();
        //    4 Write a message in the Description field
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe")));
        vytrackPage.descriptionInputBox.click();
        vytrackPage.descriptionInputBox.sendKeys(messageSample);
        //    5 Verify the message is written in the input box
        Assert.assertTrue(vytrackPage.inputLine.isDisplayed());

    }

    @Test(priority = 2)
    public void description_Field_storeManagerTest() throws InterruptedException {
        loginAsStoreManger();
        //    1 Users are on the homepage
        vytrackPage = new VytrackPage();
        //    2 Click the “Calendar Events” under the Activities
        vytrackPage.action(vytrackPage.activitiesBtn);
        vytrackPage.calendarEventsBtn.click();
        //    3 Click the “Create Calendar Event” button
        Thread.sleep(2000);
        vytrackPage.creatCalendarEventBtn.click();
        //    4 Write a message in the Description field
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe")));
        vytrackPage.descriptionInputBox.click();
        vytrackPage.descriptionInputBox.sendKeys(messageSample);
        //    5 Verify the message is written in the input box
        Assert.assertTrue(vytrackPage.inputLine.isDisplayed());

    }

    @Test(priority = 3)
    public void description_Field_salesManagerTest() throws InterruptedException {
        loginAsSalesManager();
        //    1 Users are on the homepage
        vytrackPage = new VytrackPage();
        //    2 Click the “Calendar Events” under the Activities
        vytrackPage.action(vytrackPage.activitiesBtn);
        vytrackPage.calendarEventsBtn.click();
        //    3 Click the “Create Calendar Event” button
        Thread.sleep(2000);
        vytrackPage.creatCalendarEventBtn.click();
        //    4 Write a message in the Description field
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe")));
        vytrackPage.descriptionInputBox.click();
        vytrackPage.descriptionInputBox.sendKeys(messageSample);
        //    5 Verify the message is written in the input box
        Assert.assertTrue(vytrackPage.inputLine.isDisplayed());

    }

   @AfterMethod
   public void tearDown() throws InterruptedException {
       Thread.sleep(2000);
       Driver.closeDriver();
   }
   }



