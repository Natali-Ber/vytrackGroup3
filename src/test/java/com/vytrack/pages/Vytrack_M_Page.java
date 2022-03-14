package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Vytrack_M_Page {

    public Vytrack_M_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/calendar/event']//span")
    public WebElement activitiesBtn;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEventsBtn;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement creatCalendarEventBtn;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement repeatCheckBox;

    @FindBy(css = "input[value='1']")
    public WebElement repeatEvery;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement repeatEvery1;


    @FindBy(xpath = "//span[starts-with(@style,'top: 445px; left:')]/span")
    public WebElement errorMessage;


    public void action(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }


}
