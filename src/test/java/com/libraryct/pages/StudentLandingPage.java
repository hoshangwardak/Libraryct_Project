package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StudentLandingPage {


    public StudentLandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@class='title']")
    public List<WebElement> studentsModules;

    @FindBy(xpath = "(//tr)//th")
    public List<WebElement> tableHeader;

    @FindBy(xpath = "//select[@id='book_categories']")
    public WebElement bookCategories;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement borrowingBooksLink;

    @FindBy(xpath = "(//tr)[1]//th")
    public List<WebElement> borrowingBooksTableHeader;


    public static void getCurrentUrl() {
        Driver.getDriver().getCurrentUrl();
    }


}
