package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CY3_60_Kevin {

    // As a user, I want to view edit car info icons from the Vehicle page

    @Test
    public void testCase60(){

        // 1. Takes user to vyTrack website
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");

        // 2. Inputs Username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='_username']"));
        inputUsername.sendKeys("storemanager59");

        // 3. Inputs Password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='_password']"));
        inputPassword.sendKeys("UserUser123");

        // 4. Clicks on Login
        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//*[@id='_submit']"));
        logInButton.click();



    }




}
