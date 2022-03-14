package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.vytrack.utilities.VytrackUtils.*;

public class US8_Mehmet_Version2 {


    @Test(priority = 1)
    public void TestCase_1() throws InterruptedException {

// All browsers get Url
        for (int i = 1; i < 4; i++) {
            if (i == 1) {
                loginAsSalesManager();
            } else if (i == 2) {
                loginAsDriver();
            } else {
                loginAsStoreManger();
            }
// Getting activities
            WebElement activities = Driver.getDriver().findElement(By.xpath("//a[@href='/calendar/event']//span"));
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(activities).perform();
// Clicking calendar
            WebElement calendar = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
            calendar.click();
// Clicking Create Calender Event Button
            Thread.sleep(2000);
            WebElement createCalenderEvent = Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
            createCalenderEvent.click();
// Checking repeat checkbox
            Thread.sleep(2000);
            WebElement repeat = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[2]"));
            repeat.click();
// Getting Value of Attribute
            WebElement repeatEvery = Driver.getDriver().findElement(By.cssSelector("input[value='1']"));
            String actualValue = repeatEvery.getAttribute("value");
            System.out.println("Actual Value is: " + actualValue);
            Assert.assertTrue(actualValue.equals("1"));

            Thread.sleep(3000);
            Driver.closeDriver();

        }

    }


    @Test(priority = 2)
    public void TestCase_2() throws InterruptedException {

// All browsers get Url
        for (int i = 1; i < 4; i++) {
            if (i == 1) {
                loginAsSalesManager();
            } else if (i == 2) {
                loginAsDriver();
            } else {
                loginAsStoreManger();
            }
// Getting activities
            WebElement activities = Driver.getDriver().findElement(By.xpath("//a[@href='/calendar/event']//span"));
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(activities).perform();
// Clicking calendar
            WebElement calendar = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
            calendar.click();
// Clicking Create Calender Event Button
            Thread.sleep(2000);
            WebElement createCalenderEvent = Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
            createCalenderEvent.click();
// Checking repeat checkbox
            Thread.sleep(2000);
            WebElement repeat = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[2]"));
            repeat.click();
// Getting Value of Attribute
            WebElement repeatEvery = Driver.getDriver().findElement(By.cssSelector("input[value='1']"));
            String actualValue = repeatEvery.getAttribute("value");
            System.out.println("Actual Value is: " + actualValue);
            Assert.assertTrue(actualValue.equals("1"));
// Getting the result
            Thread.sleep(2000);
            WebElement repeatEvery1 = Driver.getDriver().findElement(By.xpath("//input[@class='recurrence-subview-control__number']"));
            repeatEvery1.clear();
// Checking if the text is the same
            WebElement ThisValueShouldNotBeBlank = Driver.getDriver().findElement(By.xpath("//span[starts-with(@style,'top: 445px; left:')]/span"));
            String actualThisValueShouldNotBeBlank = ThisValueShouldNotBeBlank.getText();
            System.out.println("Actual text is: " + actualThisValueShouldNotBeBlank);
            Assert.assertTrue(actualThisValueShouldNotBeBlank.equals("This value should not be blank."));

            Thread.sleep(3000);
            Driver.closeDriver();
        }

    }


}
