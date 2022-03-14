package com.vytrack.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US13_Vehicle_Costs_Pages {

    @Test
    public void Test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager59");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);

        WebElement fleetTab=driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span"));
        Actions actions = new Actions(driver);

        actions.moveToElement(fleetTab).perform();


        driver.findElement(By.xpath("//span[.='Vehicle Costs']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//span[.='Type']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//span[.='Total Price']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//span[.='Date']")).isDisplayed());
    }

    @Test
    public void Test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager59");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+Keys.ENTER);

        WebElement fleetTab=driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span"));
        Actions actions = new Actions(driver);

        actions.moveToElement(fleetTab).perform();


        driver.findElement(By.xpath("//span[.='Vehicle Costs']")).click();

        WebElement topSlct= driver.findElement(By.xpath("//tr[@class='grid-header-row']/th[1]//input"));
        topSlct.click();
        Assert.assertTrue(topSlct.isSelected());
        for (int i = 1; i < 25; i++) {
            Assert.assertTrue(driver.findElement(By.xpath("//tbody[@class='grid-body']/tr["+i+"]//input")).isSelected());
        }

    }



}
