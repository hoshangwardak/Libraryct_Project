package com.libraryct.step_Definitions;

import com.libraryct.pages.Login;
import com.libraryct.pages.StudentLandingPage;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchBooksFunctionality {

    Login login = new Login();
    StudentLandingPage studentLandingPage = new StudentLandingPage();

    @Given("student is logged in")
    public void student_is_logged_in() {
        login.loginAsStudent();
    }

    @When("student clicks on the Books Categories dropDown")
    public void student_clicks_on_the_books_categories_drop_down() {
        studentLandingPage.bookCategories.click();
    }

    @Then("student sees the following options:")
    public void student_sees_the_following_options(List<String> allExpectedCategories) {

        Select select = new Select(studentLandingPage.bookCategories);

        List<String> allActualCategories = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(allActualCategories,allExpectedCategories);
        System.out.println("allActualCategories = " + allActualCategories);
        System.out.println("allExpectedCategories = " + allExpectedCategories);

    }

}
