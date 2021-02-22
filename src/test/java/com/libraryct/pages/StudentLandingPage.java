package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class StudentLandingPage {

    public StudentLandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void getCurrentUrl() {
        Driver.getDriver().getCurrentUrl();
    }


}
