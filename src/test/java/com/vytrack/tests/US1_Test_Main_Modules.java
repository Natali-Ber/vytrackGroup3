package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.VytrackUtils;
import org.testng.annotations.Test;

public class US1_Test_Main_Modules extends TestBase {

    @Test
    public void verifying_modules_as_sales_manager(){
        VytrackUtils.loginAsSalesManager();

    }

}
