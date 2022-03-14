package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import com.vytrack.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CY3_59_Busra extends TestBase {

    @Test
    public void verify_columns_as_sales_manager(){

        //Login as a sales manager
        VytrackUtils.loginAsSalesManager();

        // go to Fleet tab
        WebElement fleetTableElement = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTableElement).perform();
        BrowserUtils.sleep(2);

        //click Vehicles Model

        WebElement vehiclesModelModule = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles Model']"));
        vehiclesModelModule.click();
        BrowserUtils.sleep(2);

        // Verify managers 10 columns
        List<String> actualHeadersFromVehicleModelTable = WebTableUtils.getHeadersFromVehicleModelTable();
        System.out.println(actualHeadersFromVehicleModelTable);

        List<String> expectedHeadersFromVehicleModelTable = new ArrayList<>(Arrays.asList(
                "MODEL NAME","MAKE", "CAN BE REQUESTED", "CVVI", "CO2 FEE (/MONTH)", "COST (DEPRECIATED)",
                "TOTAL COST (DEPRECIATED)", "CO2 EMISSIONS", "FUEL TYPE", "VENDORS"));

        Assert.assertEquals(actualHeadersFromVehicleModelTable,expectedHeadersFromVehicleModelTable);

    }

    @Test
    public void verify_column_as_store_manager(){

        //Login as a store manager
        VytrackUtils.loginAsStoreManger();

        // go to Fleet tab
        WebElement fleetTableElement = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTableElement).perform();
        BrowserUtils.sleep(2);

        //click Vehicles Model

        WebElement vehiclesModelModule = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles Model']"));
        vehiclesModelModule.click();
        BrowserUtils.sleep(2);

        // Verify managers 10 columns
        List<String> actualHeadersFromVehicleModelTable = WebTableUtils.getHeadersFromVehicleModelTable();
        System.out.println(actualHeadersFromVehicleModelTable);

        List<String> expectedHeadersFromVehicleModelTable = new ArrayList<>(Arrays.asList(
                "MODEL NAME","MAKE", "CAN BE REQUESTED", "CVVI", "CO2 FEE (/MONTH)", "COST (DEPRECIATED)",
                "TOTAL COST (DEPRECIATED)", "CO2 EMISSIONS", "FUEL TYPE", "VENDORS"));

        Assert.assertEquals(actualHeadersFromVehicleModelTable,expectedHeadersFromVehicleModelTable);

    }

}
