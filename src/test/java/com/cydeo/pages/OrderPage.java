package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BasePage{
    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(name = "quantity")
    public WebElement inputQuantity;

    @FindBy(name = "name")
    public WebElement inputName;

    @FindBy(name = "street")
    public WebElement inputStreet;

    @FindBy(name = "city")
    public WebElement inputCity;

    @FindBy(name = "state")
    public WebElement inputState;

    @FindBy(name = "zip")
    public WebElement inputZip;

    @FindBy(name = "card")
    public WebElement cardType;

    @FindBy(name = "cardNo")
    public WebElement cardNo;

    @FindBy(name = "cardExp")
    public WebElement cardExp;

    @FindBy(xpath = "//*[@id=\"root\"]/section/div/form/div/div[2]/button[1]")
    public WebElement processOrderButton;

    @FindBy(xpath = "//*[@id=\"root\"]/section/div/div[2]/div[2]/table/tbody/tr[1]/td[1]")
    public WebElement firstRow;




}
