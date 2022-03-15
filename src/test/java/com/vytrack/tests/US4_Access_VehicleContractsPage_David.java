package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
AC1: Store managers and Sales managers access the Vehicle contracts page.
Expected URL: https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract
Expected title: All - Vehicle Contract - Entities - System - Car - Entities - System.

AC2: Drivers should NOT able to access the Vehicle contracts page, the app should display “You do not have permission to perform this action.”*/

public class US4_Access_VehicleContractsPage_David{


    @Test(priority = 1)
    public void login_as_store_manager() throws InterruptedException {

        VytrackUtils.loginAsStoreManger();

        WebElement fleetPage = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));

        fleetPage.click();

        WebElement vehicleContractsBtn = Driver.getDriver().findElement(By.xpath("(//a[@href='/entity/Extend_Entity_VehicleContract'])[3]//span"));


        vehicleContractsBtn.click();

        Thread.sleep(4000);



        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String currentTitle = Driver.getDriver().getTitle();
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        Assert.assertEquals(currentTitle,expectedTitle);

        Driver.closeDriver();



    }





    @Test(priority = 2)
    public void login_as_sales_manager() throws InterruptedException {


        VytrackUtils.loginAsSalesManager();

        WebElement fleetPage = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));

        fleetPage.click();

        WebElement vehicleContractsBtn = Driver.getDriver().findElement(By.xpath("(//a[@href='/entity/Extend_Entity_VehicleContract'])[3]//span"));


        vehicleContractsBtn.click();

        Thread.sleep(4000);



        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String currentTitle = Driver.getDriver().getTitle();
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        Assert.assertEquals(currentTitle,expectedTitle);

        Driver.closeDriver();




    }






    @Test(priority = 3)
    public void login_as_truck_driver() throws InterruptedException {

        VytrackUtils.loginAsDriver();

        WebElement fleetPage = Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']"));

        fleetPage.click();

        WebElement vehicleContractsBtn = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[4]"));

        Thread.sleep(3000);


        vehicleContractsBtn.click();


        WebElement errorMessage = Driver.getDriver().findElement(By.xpath(("(//div[@class='message'])[2]")));

        Thread.sleep(4000);

        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "You do not have permission to perform this action.";

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

        Driver.closeDriver();


    }
}
