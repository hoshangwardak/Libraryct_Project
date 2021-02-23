package com.libraryct.step_Definitions;

import com.libraryct.pages.LibrarianLandingPage;
import com.libraryct.pages.Login;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ManagementTableHeaderVerification {

    Login login = new Login();
    LibrarianLandingPage librarianLandingPage = new LibrarianLandingPage();

    @Given("user librarian is on the homepage")
    public void user_librarian_is_on_the_homepage() {
        login.loginAsLibrarian();
    }

    @When("user clicks on the users module")
    public void user_clicks_on_the_users_module() {
        librarianLandingPage.usersLink.click();
    }

    @Then("user should see the following column names:")
    public void user_should_see_the_following_column_names(List<String> expectedTableHeader) {
        List<String> actualTableHeader = BrowserUtils.getElementsText(librarianLandingPage.tableHeader);
        Assert.assertEquals(actualTableHeader,expectedTableHeader);
        System.out.println("actualTableHeader = " + actualTableHeader);
        System.out.println("expectedTableHeader = " + expectedTableHeader);
    }
}
