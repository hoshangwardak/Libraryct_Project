package com.libraryct.step_Definitions;

import com.libraryct.pages.LibrarianBooksPage;
import com.libraryct.pages.LibrarianLandingPage;
import com.libraryct.pages.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BookRecords_StepDefinitions {

    Login login = new Login();
    LibrarianLandingPage librarianLandingPage = new LibrarianLandingPage();
    LibrarianBooksPage librarianBooksPage = new LibrarianBooksPage();

    @Given("user is logged in as Librarian")
    public void user_is_logged_in_as_librarian() {
        login.loginAsLibrarian();
    }

    @When("user clicks on Books module")
    public void user_clicks_on_books_module() {
        librarianLandingPage.booksModule.click();

    }

    @Then("user should see the default record as {string}")
    public void user_should_see_the_default_record_as(String expected) {

        Select select = new Select(librarianBooksPage.recordsSelect);
        String actualDefaultRecord = select.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDefaultRecord, expected);
    }

    @Then("user should be able to see records for {int} options")
    public void user_should_be_able_to_see_records_for_options(Integer int1) {
        Select select = new Select(librarianBooksPage.recordsSelect);
        select.selectByValue(String.valueOf(int1));

    }

}
