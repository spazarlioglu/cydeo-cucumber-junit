package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/form/div[1]/input")
    public WebElement inputUsername;

    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div/form/div[2]/input" )
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/form/button")
    public WebElement loginButton;

    public void login(){
        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
    }


    public void login(String username,String password){
        this.inputUsername.sendKeys(username);
        this.inputPassword.sendKeys(password);
        this.loginButton.click();
    }

    public void loginWithConfig(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }
}
