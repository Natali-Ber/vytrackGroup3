package com.vytrack.tests;

import com.google.common.base.Verify;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Calendar;

public class CY3_64_Atakan extends VytrackUtils{

    @Test
    public void description_Field_Test() throws InterruptedException {

        String messageSample="scrum daily meeting";
        for (int i = 1; i < 4; i++) {
            if (i == 1) {
                loginAsStoreManger();
            } else if (i == 2) {
                loginAsDriver();
            } else {
                loginAsSalesManager();
            }
            //    1 Users are on the homepage
            WebElement activities = Driver.getDriver().findElement(By.xpath("//a[@href='/calendar/event']//span"));
            //    2 Click the “Calendar Events” under the Activities
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(activities).perform();
            WebElement calender = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
            calender.click();
            //    3 Click the “Create Calendar Event” button
            Thread.sleep(2000);
            WebElement createCalenderEvent = Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
            createCalenderEvent.click();
            Thread.sleep(2000);
            //    4 Write a message in the Description field
            Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe")));
            WebElement descriptionInputBox=  Driver.getDriver().findElement(By.id("tinymce"));
            descriptionInputBox.click();
            descriptionInputBox.sendKeys(messageSample);
            //   Driver.getDriver().switchTo().parentFrame();
            //    5 Verify the message is written in the input box
            WebElement inputLine= Driver.getDriver().findElement(By.xpath("//body[@id='tinymce']/p"));
            String actualText=inputLine.getText();

            Assert.assertEquals(messageSample,actualText);
            System.out.println("input : " +messageSample +"\nshown on the page : "+actualText);

            Assert.assertTrue(inputLine.isDisplayed());
            System.out.println("inputLine is Displayed = " + inputLine.isDisplayed());

            Thread.sleep(2000);
            Driver.closeDriver();

        }

    }

}

