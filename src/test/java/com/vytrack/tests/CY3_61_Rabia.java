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

import java.util.List;

public class CY3_61_Rabia extends TestBase {

@Test
    public void  verifying_all_checkboxes_unchecked(){

    VytrackUtils.loginAsSalesManager();

    String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";

    WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
    Actions actions = new Actions(Driver.getDriver());
    VytrackUtils.waitTillLoaderMaskDisappear();
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

    @Test
    public void verify_all_checkedbox(){
        VytrackUtils.loginAsSalesManager();

        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";

        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        VytrackUtils.waitTillLoaderMaskDisappear();
        actions.moveToElement(fleetTabElement).perform();
        String vehiclesElementLocator = "//span[normalize-space()='Vehicles' and contains(@class, 'title title-level-2')]";
        WebElement vehiclesElement = Driver.getDriver().findElement(By.xpath(vehiclesElementLocator));

        VytrackUtils.waitTillLoaderMaskDisappear();
        vehiclesElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        Driver.getDriver().findElement(By.xpath("//table//thead[1]//th[1]")).click();
        BrowserUtils.sleep(5);

        for (int i = 1; i <=25 ; i++) {
            String locator="//table/tbody/tr["+i+"]/td[1]/input";
            WebElement element = Driver.getDriver().findElement(By.xpath(locator));
            BrowserUtils.scrollToElement(element);

            System.out.println(i);
            Assert.assertTrue(element.isSelected());
            System.out.println(i);

        }

    }

    @Test
    public void verify_any_checkedbox(){
        VytrackUtils.loginAsSalesManager();

        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";

        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        VytrackUtils.waitTillLoaderMaskDisappear();
        actions.moveToElement(fleetTabElement).perform();
        String vehiclesElementLocator = "//span[normalize-space()='Vehicles' and contains(@class, 'title title-level-2')]";
        WebElement vehiclesElement = Driver.getDriver().findElement(By.xpath(vehiclesElementLocator));

        VytrackUtils.waitTillLoaderMaskDisappear();
        vehiclesElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        for (int i = 1; i <=25 ; i++) {
            String locator="//table/tbody/tr["+i+"]/td[1]/input";
            WebElement element = Driver.getDriver().findElement(By.xpath(locator));
            element.click();
            BrowserUtils.scrollToElement(element);
            System.out.println(i+ ". element is clicked ");
            BrowserUtils.sleep(2);
            Assert.assertTrue(element.isSelected());


        }

    }

}
