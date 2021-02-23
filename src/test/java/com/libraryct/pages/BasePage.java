package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Dashboard")
    public WebElement Dashboard;
    @FindBy(linkText = "Users")
    public  WebElement Users;
    @FindBy(linkText = "Books")
    public  WebElement Books;

}
