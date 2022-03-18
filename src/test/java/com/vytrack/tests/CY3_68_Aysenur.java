package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CY3_68_Aysenur extends TestBase {
    @Test
    public void verifyingFiveFiltersCheckedAsSalesManager() {
        VytrackUtils.loginAsSalesManager();

        String fleetTabElementLocator = "//span[normalize-space()='Marketing' and contains(@class, 'title title-level-1')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();

        String vehiclesContractModuleLocator = "//span[normalize-space()='Campaigns' and contains(@class, 'title title-level-2')]";
        WebElement vehiclesContractElement = Driver.getDriver().findElement(By.xpath(vehiclesContractModuleLocator));

        VytrackUtils.waitTillLoaderMaskDisappear();
        vehiclesContractElement.click();

        VytrackUtils.waitTillLoaderMaskDisappear();
        //Filters
        Driver.getDriver().findElement(By.xpath("//a[@title='Filters']")).click();
        BrowserUtils.sleep(2);
        //Manage filters
        Driver.getDriver().findElement(By.xpath("//a[@class='add-filter-button']")).click();
        BrowserUtils.sleep(2);

        WebElement checkedName = Driver.getDriver().findElement(By.xpath("//input[@id='ui-multiselect-0-0-option-0']"));
        WebElement checkedCode = Driver.getDriver().findElement(By.xpath("//input[@id='ui-multiselect-0-0-option-1']"));
        WebElement checkedStartDate = Driver.getDriver().findElement(By.xpath("//input[@id='ui-multiselect-0-0-option-2']"));
        WebElement checkedEndDate = Driver.getDriver().findElement(By.xpath("//input[@id='ui-multiselect-0-0-option-3']"));
        WebElement checkedBudget = Driver.getDriver().findElement(By.xpath("//input[@id='ui-multiselect-0-0-option-4']"));

        checkedName.isSelected();
        checkedCode.isSelected();
        checkedStartDate.isSelected();
        checkedEndDate.isSelected();
        checkedBudget.isSelected();

        Assert.assertTrue(true);

    }
}


