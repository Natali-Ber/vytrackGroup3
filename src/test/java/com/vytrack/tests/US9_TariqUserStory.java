package com.vytrack.tests;

import com.vytrack.pages.VytrackPOM_US9_63;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US9_TariqUserStory {



    VytrackPOM_US9_63 VytrackProject;

    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        VytrackProject = new VytrackPOM_US9_63();
    }

    @Test(priority = 1)
    public void CreateCalendarEventPage_ASSalesManager() throws InterruptedException {
        VytrackUtils.loginAsSalesManager();
        Thread.sleep(2000);
        //Step#1 =  click calendarEvents under Activities button.
        Actions act = new Actions(Driver.getDriver());
        act.moveToElement(VytrackProject.ActivitiesButton)
                .moveToElement(VytrackProject.calendarEventsUnderActivitiesTab)
                .click().perform();
        Thread.sleep(2000);
        VytrackProject.createCalendarEvents.click();
        Thread.sleep(2000);
        VytrackProject.repeatButton.click();
        WebElement entryBox = VytrackProject.inputBox;
        entryBox.clear();
        Thread.sleep(2000);

        int InvalidNumber = 100;
        entryBox.sendKeys("" + InvalidNumber + "");
        Thread.sleep(2000);
        String Text = VytrackProject.CheckErrorMessage.getText();
        System.out.println("Text = " + Text);
        if (InvalidNumber < 1) {
            Assert.assertEquals(Text, "The value have not to be less than 1.");
        } else if (InvalidNumber > 99) {
            Assert.assertEquals(Text, "The value have not to be more than 99.");
        } else {
            Assert.assertEquals(Text, "Integer is above 1 and less the 99");
        }
        Driver.closeDriver();
    }

    @Test(priority = 2)
    public void CreateCalendarEventPageAS_StoreManager() throws InterruptedException {
        VytrackUtils.loginAsStoreManger();
        Thread.sleep(2000);
        //Step#1 =  click calendarEvents under Activities button.
        Actions act = new Actions(Driver.getDriver());
        act.moveToElement(VytrackProject.ActivitiesButton)
                .moveToElement(VytrackProject.calendarEventsUnderActivitiesTab)
                .click().perform();
        Thread.sleep(2000);
        VytrackProject.createCalendarEvents.click();
        Thread.sleep(2000);
        VytrackProject.repeatButton.click();
        WebElement entryBox = VytrackProject.inputBox;
        entryBox.clear();
        Thread.sleep(2000);

        int InvalidNumber = -50;

        entryBox.sendKeys("" + InvalidNumber + "");

        Thread.sleep(2000);
        String Text = VytrackProject.CheckErrorMessage.getText();
        System.out.println("Text = " + Text);
        if (InvalidNumber < 1) {
            Assert.assertEquals(Text, "The value have not to be less than 1.");
        } else if (InvalidNumber > 99) {
            Assert.assertEquals(Text, "The value have not to be more than 99.");
        } else {
            Assert.assertEquals(Text, "Integer is above 1 and less the 99");
        }
        Driver.closeDriver();
    }

    @Test (priority = 3)
    public void CreateCalendarEventPageAS_Driver() throws InterruptedException {
        VytrackUtils.loginAsDriver();
        Thread.sleep(2000);
        //Step#1 =  click calendarEvents under Activities button.
        Actions act = new Actions(Driver.getDriver());
        act.moveToElement(VytrackProject.ActivitiesButtonAS_Driver)
                .moveToElement(VytrackProject.calendarEventsUnderActivitiesTab)
                .click().perform();
        Thread.sleep(2000);
        VytrackProject.createCalendarEvents.click();
        Thread.sleep(2000);
        VytrackProject.repeatButton.click();
        WebElement entryBox = VytrackProject.inputBox;
        entryBox.clear();
        Thread.sleep(2000);

        int InvalidNumber = -150;

        entryBox.sendKeys("" + InvalidNumber + "");

        Thread.sleep(2000);
        String Text = VytrackProject.CheckErrorMessage.getText();
        System.out.println("Text = " + Text);
        if (InvalidNumber < 1) {
            Assert.assertEquals(Text, "The value have not to be less than 1.");
        } else if (InvalidNumber > 99) {
            Assert.assertEquals(Text, "The value have not to be more than 99.");
        } else {
            Assert.assertEquals(Text, "Integer is above 1 and less the 99");
        }
        Driver.closeDriver();
    }
}

// if more then one invalid number need to be checked.   remove line from 104
//        for (Integer i = 100; i < 110; i++) {
//            entryBox.clear();
//            entryBox.sendKeys("" + i + "");
//            WebElement errorText = Driver.getDriver().findElement(By.xpath("//span[@class='validation-failed']"));
//            String errormessage = errorText.getText();
//            System.out.println("errormessage = " + errormessage);
//
//            if (!(errormessage.contains("The value have not to be"))) {
//                System.out.println("User enter " + i + "" + errormessage);
//                break;
//            }
//        }



