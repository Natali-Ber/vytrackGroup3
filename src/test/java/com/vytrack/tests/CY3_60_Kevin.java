package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CY3_60_Kevin extends TestBase {

    // As a user, I want to view edit car info icons from the Vehicle page


    @Test
    public void testCase60() throws InterruptedException {

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

        // 5. Hovers over the Fleet option
        WebElement hoverMouse = Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(hoverMouse);

        Thread.sleep(3000);

        //6. Presses on Vehicle option
        WebElement vehicle = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[3]"));
        actions.moveToElement(vehicle);
        actions.click().build().perform();

        Thread.sleep(3000);

        // 7. Hovers over hamburger icon and displays icons
        WebElement hamburger = Driver.getDriver().findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]"));
        hamburger.click();
        hamburger.click();

        Thread.sleep(2000);

        WebElement threeIconPopUp = Driver.getDriver().findElement(By.xpath("(//a[@title='Edit'])[1]"));

        if(threeIconPopUp.isDisplayed()){
            System.out.println("Passed, Icon is displayed!!!!");
        }else{
            System.out.println("Failed, Icon is not Displayed");
        }


    }




}
