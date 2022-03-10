package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us8_Mehmet extends VytrackUtils {

    @Test(priority = 1)
    public void Us8_salesManager() throws InterruptedException {
        loginAsSalesManager();

        WebElement activities = Driver.getDriver().findElement(By.xpath("//a[@href='/calendar/event']//span"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(activities).perform();

        WebElement calender = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
        calender.click();
        Thread.sleep(2000);
        WebElement createCalenderEvent = Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        createCalenderEvent.click();
        Thread.sleep(2000);


        WebElement repeat = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        repeat.click();

        WebElement repeatEvery = Driver.getDriver().findElement(By.cssSelector("input[value='1']"));

        String expectedValue = "1";
        String actualValue = repeatEvery.getAttribute("value");
        System.out.println("Expected Value is: " + actualValue);

        Assert.assertEquals(actualValue, expectedValue);

        Thread.sleep(2000);
        WebElement repeatEvery1 = Driver.getDriver().findElement(By.xpath("//input[@class='recurrence-subview-control__number']"));
        repeatEvery1.clear();

        WebElement ThisValueShouldNotBeBlank = Driver.getDriver().findElement(By.xpath("//span[@id='temp-validation-name-592-error']/span/span"));

        String expectedThisValueShouldNotBeBlank = "This value should not be blank.";
        String actualThisValueShouldNotBeBlank = ThisValueShouldNotBeBlank.getText();
        System.out.println("Expected text is: " + actualThisValueShouldNotBeBlank);

        Assert.assertEquals(actualThisValueShouldNotBeBlank, expectedThisValueShouldNotBeBlank);


        Thread.sleep(5000);
        Driver.closeDriver();


    }

    @Test(priority = 2)
    public void Us8_driver() throws InterruptedException {

        loginAsDriver();

        WebElement activities = Driver.getDriver().findElement(By.xpath("//a[@href='/calendar/event']//span"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(activities).perform();

        WebElement calender = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
        calender.click();

        Thread.sleep(2000);
        WebElement createCalenderEvent = Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        createCalenderEvent.click();
        Thread.sleep(2000);

        WebElement repeat = Driver.getDriver().findElement(By.id("recurrence-repeat-view294"));
        repeat.click();

        WebElement repeatEvery = Driver.getDriver().findElement(By.cssSelector("input[value='1']"));
        String expectedValue = "1";
        String actualValue = repeatEvery.getAttribute("value");
        System.out.println("Expected Value is: " + actualValue);

        Assert.assertEquals(actualValue, expectedValue);

        Thread.sleep(2000);
        WebElement repeatEvery1 = Driver.getDriver().findElement(By.xpath("//input[@class='recurrence-subview-control__number']"));
        repeatEvery1.clear();

        WebElement ThisValueShouldNotBeBlank = Driver.getDriver().findElement(By.xpath("//span[@id='temp-validation-name-318-error']/span/span"));
        String expectedThisValueShouldNotBeBlank = "This value should not be blank.";
        String actualThisValueShouldNotBeBlank = ThisValueShouldNotBeBlank.getText();
        System.out.println("Expected text is: " + actualThisValueShouldNotBeBlank);

        Assert.assertEquals(actualThisValueShouldNotBeBlank, expectedThisValueShouldNotBeBlank);

        Thread.sleep(5000);
        Driver.closeDriver();
    }

    @Test(priority = 3)
    public void Us8_storeManager() throws InterruptedException {

        loginAsStoreManger();

        WebElement activities = Driver.getDriver().findElement(By.xpath("//a[@href='/calendar/event']//span"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(activities).perform();

        WebElement calender = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
        calender.click();

        Thread.sleep(3000);
        WebElement createCalenderEvent = Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        createCalenderEvent.click();

        Thread.sleep(2000);
        WebElement repeat = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        repeat.click();

        WebElement repeatEvery = Driver.getDriver().findElement(By.cssSelector("input[value='1']"));
        String expectedValue = "1";
        String actualValue = repeatEvery.getAttribute("value");
        System.out.println("Expected Value is: " + actualValue);

        Assert.assertEquals(actualValue, expectedValue);

        Thread.sleep(2000);
        WebElement repeatEvery1 = Driver.getDriver().findElement(By.xpath("//input[@class='recurrence-subview-control__number']"));
        repeatEvery1.clear();

        WebElement ThisValueShouldNotBeBlank = Driver.getDriver().findElement(By.xpath("//span[@id='temp-validation-name-1300-error']/span/span"));
        String expectedThisValueShouldNotBeBlank = "This value should not be blank.";
        String actualThisValueShouldNotBeBlank = ThisValueShouldNotBeBlank.getText();
        System.out.println("Expected text is: " + actualThisValueShouldNotBeBlank);

        Assert.assertEquals(actualThisValueShouldNotBeBlank, expectedThisValueShouldNotBeBlank);

        Thread.sleep(5000);
        Driver.closeDriver();
    }


}
