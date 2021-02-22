package com.libraryct.step_Definitions;

import com.libraryct.pages.Login;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginFunctionality {

    Login login = new Login();


    @Given("the user login as a student")
    public void the_user_login_as_a_student() {

        //login.getEnvironment("qa1");
        login.getStudentUsername(ConfigurationReader.getProperty("studentUsername"));
        login.getStudentPassword(ConfigurationReader.getProperty("studentPassword"));
        login.signIn();
    }

    @Then("the user on  books.")
    public void the_user_on_books() {

        login.booksIsDisplayed("books");
    }

    @Given("the user login as a librarian#")
    public void the_user_login_as_a_librarian() {

        //login.getEnvironment("qa1");
        login.getStudentUsername(ConfigurationReader.getProperty("librarianUsername"));
        login.getStudentPassword(ConfigurationReader.getProperty("librarianPassword"));
        login.signIn();
    }

    @Then("the user on  Dashboard")
    public void the_user_on_dashboard() {

        login.dashboardIsDisplayed("dashboard");
    }




}
