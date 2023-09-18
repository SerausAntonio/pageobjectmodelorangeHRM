package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BaseClass {
    public LoginPage(){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath="//*[@class='orangehrm-login-branding']/img")
    WebElement logo;

    @FindBy(xpath ="//*[@name='username']")
    WebElement userName;

    @FindBy(xpath = "//*[@name ='password']")
    WebElement passWord;

    @FindBy(xpath="//*[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath="//*[text()='Forgot your password? ']")
    WebElement forgotloginlnk;

    @FindBy(css=".orangehrm-forgot-password-title")
    WebElement resetPassWord;



    public boolean validateLogo(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOf(logo));

       return (logo.isDisplayed());
    }

    public void loginTest(){
        userName.sendKeys("Admin");
        passWord.sendKeys("admin123");
        loginBtn.click();
       // return new HomePage();
    }
    public Boolean forgotPassword(){
        forgotloginlnk.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOf(resetPassWord));
        return resetPassWord.isDisplayed();
    }

}
