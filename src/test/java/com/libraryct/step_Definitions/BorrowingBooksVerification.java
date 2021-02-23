package com.libraryct.step_Definitions;

import com.libraryct.pages.Login;
import com.libraryct.pages.StudentLandingPage;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class BorrowingBooksVerification {

    Login login = new Login();
    StudentLandingPage studentLandingPage = new StudentLandingPage();

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        login.loginAsStudent();
    }

    @When("the user clicks on Borrowing Books module")
    public void the_user_clicks_on_borrowing_books_module() {
        studentLandingPage.borrowingBooksLink.click();
    }

    @Then("the user shoulde see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> expectedTableHeader) {
        List<String> actualTableHeader = BrowserUtils.getElementsText(studentLandingPage.borrowingBooksTableHeader);
        Assert.assertEquals(actualTableHeader,expectedTableHeader);
        System.out.println("actualTableHeader = " + actualTableHeader);
        System.out.println("expectedTableHeader = " + expectedTableHeader);
    }
}
