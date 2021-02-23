package com.libraryct.step_Definitions;

import com.libraryct.pages.Login;
import com.libraryct.pages.StudentLandingPage;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sun.rmi.runtime.Log;

import java.util.List;

public class TableDefaultValueVerification {

    Login login = new Login();
    StudentLandingPage studentLandingPage = new StudentLandingPage();

    @Given("the user on the homepage")
    public void the_user_on_the_homepage() {
        login.loginAsStudent();
    }

    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> expectedTableHeader) {
        List<String> actualTabelHeader = BrowserUtils.getElementsText(studentLandingPage.tableHeader);
        Assert.assertEquals(actualTabelHeader,expectedTableHeader);
        System.out.println(actualTabelHeader);
        System.out.println(expectedTableHeader);
    }

}
