package com.Amazon.Pages;

import com.Amazon.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPage {

    public searchPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="searchDropdownBox")
    public WebElement departmentType;

    @FindBy(id="twotabsearchtextbox")
    public WebElement inputButton;

    @FindBy(id="nav-search-submit-button")
    public WebElement searchButton;

    @FindBy(className = "a-section a-spacing-small a-spacing-top-small")
    public WebElement result;

  //  @FindBy()
}
