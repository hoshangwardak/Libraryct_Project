package com.libraryct.step_Definitions;

import com.libraryct.pages.LibrarianLandingPage;
import com.libraryct.pages.Login;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StatusOptionsVerification {

    Login login = new Login();
    LibrarianLandingPage librarianLandingPage = new LibrarianLandingPage();

    @Given("user Librarian is on the homepage")
    public void user_librarian_is_on_the_homepage() {
        login.loginAsLibrarian();
    }

    @When("user clicks on users module")
    public void user_clicks_on_users_module() {
        librarianLandingPage.usersLink.click();
    }

    @When("user clicks on Status dropDown")
    public void user_clicks_on_status_drop_down() {
        librarianLandingPage.statusDropDown.click();
    }

    @Then("user should see the following options:")
    public void user_should_see_the_following_options(List<String> expectedStatusOptions) {
        Select select = new Select(librarianLandingPage.statusDropDown);
        List<String> actualStatusOptions = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(actualStatusOptions, expectedStatusOptions);
        System.out.println("actualStatusOptions = " + actualStatusOptions);
        System.out.println("expectedStatusOptions = " + expectedStatusOptions);

    }
}
