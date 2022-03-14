package com.vytrack.tests;

import com.vytrack.pages.Vytrack_M_Page;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.vytrack.utilities.VytrackUtils.*;

public class US8_Mehmet_Version1 {


    Vytrack_M_Page vytrack_m_page;


    @Test(priority = 1)
    public void TestCase_1() throws InterruptedException {

        for (int i = 1; i < 4; i++) {
            if (i == 1) {
                loginAsSalesManager();
            } else if (i == 2) {
                loginAsDriver();
            } else {
                loginAsStoreManger();
            }
            vytrack_m_page = new Vytrack_M_Page();

            // Click calendar event activities
            vytrack_m_page.action(vytrack_m_page.activitiesBtn);

            Thread.sleep(2000);
            vytrack_m_page.calendarEventsBtn.click();
            // Click create calendar event button

            Thread.sleep(3000);
            vytrack_m_page.creatCalendarEventBtn.click();

            // Clicking repeat checkbox
            Thread.sleep(3000);
            vytrack_m_page.repeatCheckBox.click();

            // Getting Value of Attribute
            Assert.assertEquals(vytrack_m_page.repeatEvery.getAttribute("value"), "1");

            Thread.sleep(3000);
            Driver.closeDriver();

        }

    }

   @Test(priority = 2)
    public void TestCase_2() throws InterruptedException {

        for (int i = 1; i < 2; i++) {
            if (i == 1) {
                loginAsSalesManager();
            } else if (i == 2) {
                loginAsDriver();
            } else {
                loginAsStoreManger();
            }
            vytrack_m_page = new Vytrack_M_Page();

            // Click calendar event activities
            vytrack_m_page.action(vytrack_m_page.activitiesBtn);

            Thread.sleep(2000);
            vytrack_m_page.calendarEventsBtn.click();
            // Click create calendar event button

            Thread.sleep(3000);
            vytrack_m_page.creatCalendarEventBtn.click();

            // Clicking repeat checkbox
            Thread.sleep(3000);
            vytrack_m_page.repeatCheckBox.click();

            // Getting the result
            vytrack_m_page.repeatEvery1.clear();
            Thread.sleep(3000);
            // Checking if the text is the same
            Assert.assertEquals(vytrack_m_page.errorMessage.getText(), "This value should not be blank.");

            Thread.sleep(3000);
            Driver.closeDriver();


        }

    }

}