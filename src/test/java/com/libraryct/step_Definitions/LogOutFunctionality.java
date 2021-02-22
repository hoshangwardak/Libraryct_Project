package com.libraryct.step_Definitions;

import com.libraryct.pages.LogOut;
import com.libraryct.pages.Login;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutFunctionality {

    Login login = new Login();
    LogOut logOut = new LogOut();

    @Given("user is logged in as student or librarian")
    public void user_is_logged_in_as_student_or_librarian() {
        login.getStudentUsername(ConfigurationReader.getProperty("studentUsername"));
        login.getStudentPassword(ConfigurationReader.getProperty("studentPassword"));
        login.signIn();

    }

    @When("user clicks on logout dropDown and on logout button")
    public void user_clicks_on_logout_drop_down_and_on_logout_button() {
        BrowserUtils.sleep(2);
        logOut.logOut();
    }

    @Then("user should be redirected to login page and see {string} in the url")
    public void user_should_be_redirected_to_login_page_and_see_in_the_url(String expected) {

        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("Failed, Logout",actual.contains(expected));

    }
}
