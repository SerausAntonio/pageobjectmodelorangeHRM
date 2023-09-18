package com.orangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
    WebDriver driver;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[text()='Admin']")
    WebElement adminTab;

    @FindBy(xpath="//*[text()='System Users']")
    WebElement title;



    public SystemUsersPage clickOnadminTab(){
        adminTab.click();
        return new SystemUsersPage();
    }
    public boolean checkTitle(){

        return title.isDisplayed();
    }


}
