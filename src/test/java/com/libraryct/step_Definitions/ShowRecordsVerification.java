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

public class ShowRecordsVerification {

    LibrarianLandingPage librarianLandingPage = new LibrarianLandingPage();
    Login login = new Login();


    @Given("The librarian on the homepage")
    public void theLibrarianOnTheHomepage() {
        login.getEnvironment("qa1");
        login.loginAsLibrarian();

    }

    @When("librarian clicks on books link")
    public void librarianClicksOnBooksLink() {

        librarianLandingPage.booksLink.click();
    }

    @Then("verify that the default record is {int}")
    public void verifyThatTheDefaultRecordIs(int ten) {
        librarianLandingPage.getDefaultValue(ten);

    }

    @Then("Show records for the following options")
    public void showRecordsForTheFollowingOptions(List<String> options) {
        Select select = new Select(librarianLandingPage.showRecords);
        List<WebElement> webElements = select.getOptions();
        List<String> actualTexts = BrowserUtils.getElementsText(webElements);
        Assert.assertEquals("Failed, Assertion failed on options",options,actualTexts);
        System.out.println(actualTexts);
        System.out.println(options);
    }
}


