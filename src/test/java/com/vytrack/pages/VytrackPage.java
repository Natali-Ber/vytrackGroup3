package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackPage {

    public VytrackPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/calendar/event']//span")
    public WebElement activitiesBtn;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEventsBtn;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement creatCalendarEventBtn;

    @FindBy(id = "tinymce")
    public WebElement descriptionInputBox;

    @FindBy(xpath = "//body[@id='tinymce']/p")
    public WebElement inputLine;

    @FindBy(xpath = "//frame")
    public WebElement descriptionFrame;

    public void action(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }




}
