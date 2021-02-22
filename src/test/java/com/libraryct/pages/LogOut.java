package com.libraryct.pages;

import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

    public LogOut() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "navbarDropdown")
    public WebElement logOutDropDown;

    @FindBy(linkText = "Log Out")
    public WebElement logOut;

    public void logOut() {
        logOutDropDown.click();
        BrowserUtils.sleep(1);
        logOut.click();
    }


}
