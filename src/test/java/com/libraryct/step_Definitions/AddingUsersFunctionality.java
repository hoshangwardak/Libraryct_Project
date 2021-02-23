package com.libraryct.step_Definitions;

import com.libraryct.pages.LibrarianLandingPage;
import com.libraryct.pages.Login;
import com.libraryct.pages.AddUsersPage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class AddingUsersFunctionality {

    Login login = new Login();
    LibrarianLandingPage librarianLandingPage = new LibrarianLandingPage();
    AddUsersPage addUsersPage = new AddUsersPage();

    @Given("user is on the library landing page")
    public void user_is_on_the_library_landing_page() {
        login.loginAsLibrarian();
    }

    @When("user clicks on the Users link")
    public void userClicksOnTheUsersLink() {
        librarianLandingPage.usersLink.click();
    }

    @When("user should click on the Add User button")
    public void user_should_click_on_the_add_user_button() {
        librarianLandingPage.addUserButton.click();
    }

    @When("User fills out the form as followed from the table below:")
    public void user_fills_out_the_form_as_followed_from_the_table_below() {
        // Intentionally left blank
    }

    @When("User enters {string} in the inputBox")
    public void user_enters_in_the_input_box(String fullName) {
        addUsersPage.fullName.sendKeys(fullName);
    }

    @And("User enters {string} password in the inputBox")
    public void userEntersPasswordInTheInputBox(String password) {
        addUsersPage.password.sendKeys(password);
    }

    @And("User enters {string} email in the inputBox")
    public void userEntersEmailInTheInputBox(String email) {
        addUsersPage.email.sendKeys(email);
    }

    @And("User selects {string} userGroup from dropDown menu")
    public void userSelectsUserGroupFromDropDownMenu(String userGroup) {
        Select select = new Select(addUsersPage.userGroupDropDown);
        select.selectByVisibleText(userGroup);
    }

    @And("User selects {string} status from dropDown menu")
    public void userSelectsStatusFromDropDownMenu(String status) {
        Select select = new Select(addUsersPage.status);
        select.selectByVisibleText(status);
    }

    @And("User enters {string} startDate in the inputBox")
    public void userEntersStartDateInTheInputBox(String startDate) {
        addUsersPage.startDate.sendKeys(startDate);
    }

    @And("User enters {string} endDate in the inputBox")
    public void userEntersEndDateInTheInputBox(String endDate) {
        addUsersPage.endDate.sendKeys(endDate);
    }

    @And("User enters {string} address in the inputBox")
    public void userEntersAddressInTheInputBox(String address) {
        addUsersPage.address.sendKeys(address);
    }

    @And("User clicks on the Save Changes button")
    public void user_clicks_on_the_save_changes_button() {
        addUsersPage.saveChangesButton.click();
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedName) {
        BrowserUtils.libraryCtVerifyName(Driver.getDriver(), expectedName);
        System.out.println(expectedName);
    }

    @When("user clicks on the Edit User button")
    public void userClicksOnTheEditUserButton() {
        librarianLandingPage.editUserButton.click();
    }

    @And("User edits the form as required")
    public void userEditsTheFormAsRequired() {
        // Intentionally left blank
    }

    @Then("User clicks on the close button")
    public void userClicksOnTheCloseButton() {
        addUsersPage.closeButton.click();
    }

}
