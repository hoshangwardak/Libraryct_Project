package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LibrarianLandingPage {

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


}
