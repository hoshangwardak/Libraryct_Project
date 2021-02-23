package com.libraryct.step_Definitions;

import com.libraryct.pages.LibrarianLandingPage;
import com.libraryct.pages.Login;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Category_stepDefinitions {
Login login=new Login();
LibrarianLandingPage librarianLandingPage=new LibrarianLandingPage();
    @Given("the user \\(Librarian) on the homepage")
    public void the_user_librarian_on_the_homepage() {
       login.loginAsLibrarian();
    }



    @When("the user click users moudle")
    public void the_user_click_users_moudle() {
       login.Users.click();
    }
    @When("the user click User Group dopdown")
    public void the_user_click_user_group_dopdown() {
        librarianLandingPage.groupCategoriesDropDown.click();

    }

Select select;
    @Then("the user should see the below options:")
    public void theUserShouldSeeTheBelowOptions(List<String>ExpectedDrops) {
        select= new Select(librarianLandingPage.groupCategoriesDropDown);
       List<WebElement>webElements =select.getOptions();
       List<String>actualText =BrowserUtils.getElementsText(webElements);
       Assert.assertEquals(actualText,ExpectedDrops);
    }
}

//failed
//Expected :[ALL, Librarian, Students]
//        Actual   :[All, Librarian, Students]
