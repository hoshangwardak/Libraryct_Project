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


    public static void getCurrentUrl() {
        Driver.getDriver().getCurrentUrl();
    }


}
