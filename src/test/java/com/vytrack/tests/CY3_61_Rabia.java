package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CY3_61_Rabia extends TestBase {

@Test
    public void  verifying_all_checkboxes_unchecked(){

    VytrackUtils.loginAsSalesManager();

    String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";

    WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
    Actions actions = new Actions(Driver.getDriver());
    actions.moveToElement(fleetTabElement).perform();
    String vehiclesElementLocator = "//span[normalize-space()='Vehicles' and contains(@class, 'title title-level-2')]";
    WebElement vehiclesElement = Driver.getDriver().findElement(By.xpath(vehiclesElementLocator));

    VytrackUtils.waitTillLoaderMaskDisappear();
    vehiclesElement.click();
    VytrackUtils.waitTillLoaderMaskDisappear();

    List<WebElement> checkedboxes = Driver.getDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
    for (WebElement checkedbox : checkedboxes) {
        Assert.assertTrue(!checkedbox.isSelected());

    }
}

}
