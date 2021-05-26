package com.Amazon.Pages;

import com.Amazon.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="nav-link-accountList")
    public WebElement signInBtn;


    @FindBy(id = "ap_email")
    public WebElement loginButton;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement passwordButton;

    @FindBy(id="signInSubmit")
    public WebElement singButton;


}
