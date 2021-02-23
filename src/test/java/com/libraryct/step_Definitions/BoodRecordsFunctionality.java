package com.libraryct.step_Definitions;

import com.libraryct.pages.LibrarianLandingPage;
import com.libraryct.pages.Login;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BoodRecordsFunctionality {

    Login login = new Login();
    LibrarianLandingPage librarianLandingPage = new LibrarianLandingPage();

    @Given("The librarian on the homepage")
    public void the_librarian_on_the_homepage() {
        login.loginAsLibrarian();
    }

    @When("librarian clicks on books link")
    public void librarian_clicks_on_books_link() {
        librarianLandingPage.usersLink.click();
    }

    @Then("verify that the default record is {int}")
    public void verify_that_the_default_record_is(Integer defaultValue) {
        librarianLandingPage.getDefaultValue(defaultValue);
    }

    @Then("Show records for the following count")
    public void show_records_for_the_following_count(List<String> options) {

        Select select = new Select(librarianLandingPage.showRecords);
        List<WebElement> webElements = select.getOptions();
        List<String> actualTexts = BrowserUtils.getElementsText(webElements);
        Assert.assertEquals("Failed, Assertion failed on options",options,actualTexts);
        System.out.println(actualTexts);
        System.out.println(options);
    }

}
