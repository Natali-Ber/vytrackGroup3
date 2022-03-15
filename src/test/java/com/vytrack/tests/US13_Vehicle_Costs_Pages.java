package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US13_Vehicle_Costs_Pages extends TestBase {

    @Test
    public void asDriver(){


        VytrackUtils.loginAsDriver();

        WebElement fleetTab=Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(fleetTab).perform();


        Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']")).click();

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='Type']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='Total Price']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='Date']")).isDisplayed());
    }

    @Test
    public void asSalesManager(){


        VytrackUtils.loginAsSalesManager();

        WebElement fleetTab=Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(fleetTab).perform();


        Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']")).click();

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='Type']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='Total Price']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='Date']")).isDisplayed());
    }

    @Test
    public void asStoreManger(){


        VytrackUtils.loginAsStoreManger();

        WebElement fleetTab=Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(fleetTab).perform();


        Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']")).click();

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='Type']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='Total Price']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='Date']")).isDisplayed());
    }







}
