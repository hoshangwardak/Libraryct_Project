package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUsersPage {

    public AddUsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn default']")
    public WebElement closeButton;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//select[@id='user_group_id']")
    public WebElement userGroupDropDown;

    @FindBy(xpath = "//select[@id='status']")
    public WebElement status;

    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement startDate;

    @FindBy(xpath = "(//input[@class='form-control'])[5]")
    public WebElement endDate;

    @FindBy(xpath = "//textarea[@id='address']")
    public WebElement address;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//tr[1]//td[3]")
    public WebElement actualName;













}
