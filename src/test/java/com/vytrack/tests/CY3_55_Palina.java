package com.vytrack.tests;


import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CY3_55_Palina extends TestBase {

    @Test(priority = 1)
    public void login_as_store_manager() {


        //Story1:  As a user, I should be accessing all the main modules of the app.
        //AC #1: store and sales managers should view 8 module names.
        //Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System
        VytrackUtils.loginAsStoreManger();

        List<WebElement> moduleNames = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        List<String> actualNames = new ArrayList<>();
        for (WebElement each : moduleNames) {

            actualNames.addAll(Arrays.asList(each.getText()));
        }

        List<String> expectedNames = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));


       Assert.assertEquals(actualNames, expectedNames);
    }

    @Test(priority = 2)
    public void login_as_sales_manager() {


        VytrackUtils.loginAsSalesManager();

        List<WebElement> moduleNames = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        List<String> actualNames = new ArrayList<>();
        for (WebElement each : moduleNames) {

            actualNames.addAll(Arrays.asList(each.getText()));
        }

        List<String> expectedNames = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));

        Assert.assertEquals(actualNames, expectedNames);

    }

    ////AC #2: drivers should view 4 module names
    //    //Expected module names: Fleet, Customers, Activities, System


    @Test(priority = 3)
    public void login_as_driver() {



        VytrackUtils.loginAsDriver();
        List<WebElement> moduleNames = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        List<String> actualNames = new ArrayList<>();
        for (WebElement each : moduleNames) {

            actualNames.addAll(Arrays.asList(each.getText()));
        }

        List<String> expectedNames = new ArrayList<>(Arrays.asList("Fleet", "Customers", "Activities", "System"));

        Assert.assertEquals(actualNames, expectedNames);



    }








}
