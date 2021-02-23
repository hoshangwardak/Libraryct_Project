package com.libraryct.step_Definitions;

import com.libraryct.pages.LibrarianLandingPage;
import com.libraryct.pages.Login;
import com.libraryct.pages.StudentLandingPage;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GroupUsersVerification {

    Login login = new Login();
    LibrarianLandingPage librarianLandingPage = new LibrarianLandingPage();

    @Given("the user Librarian on the homepage")
    public void the_user_librarian_on_the_homepage() {
        login.loginAsLibrarian();
    }

    @When("the user click users module")
    public void the_user_click_users_module() {
        librarianLandingPage.usersLink.click();
    }

    @When("the user click User Group dropDown")
    public void the_user_click_user_group_drop_down() {
        librarianLandingPage.groupCategoriesDropDown.click();
    }

    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> expectedGroupCategory) {
        Select select = new Select(librarianLandingPage.groupCategoriesDropDown);
        List<String> actualGroupCategory = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(actualGroupCategory, expectedGroupCategory);
        System.out.println("actualGroupCategory = " + actualGroupCategory);
        System.out.println("expectedGroupCategory = " + expectedGroupCategory);
    }
}
