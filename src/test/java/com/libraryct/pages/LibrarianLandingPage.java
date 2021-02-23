package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LibrarianLandingPage  {

    public LibrarianLandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title']")
    public List<WebElement> librarianModules;

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement dashboardLink;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement usersLink;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement booksLink;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUserButton;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement editUserButton;

    @FindBy(xpath = "//th")
    public List<WebElement> tablesColumns;

    @FindBy(xpath = "(//select)[3]")
    public WebElement showRecords;

    @FindBy(xpath = "//select[@id='user_groups']")
    public WebElement groupCategoriesDropDown;

    @FindBy(xpath = "//select[@id='user_status']")
    public WebElement statusDropDown;

    @FindBy(xpath = "(//tr)[1]//th")
    public List<WebElement> tableHeader;

    public void getDefaultValue(int defaultValue) {
        Select select = new Select(showRecords);
        Assert.assertTrue("Failed, parsing not successful",Integer.parseInt(select.getFirstSelectedOption().getText()) == defaultValue);
    }




}
