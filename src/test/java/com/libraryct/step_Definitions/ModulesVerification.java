package com.libraryct.step_Definitions;

import com.libraryct.pages.LibrarianLandingPage;
import com.libraryct.pages.Login;
import com.libraryct.pages.StudentLandingPage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ModulesVerification {

    Login login = new Login();
    StudentLandingPage studentLandingPage = new StudentLandingPage();
    LibrarianLandingPage librarianLandingPage = new LibrarianLandingPage();

    @Given("the student on the home page")
    public void the_student_on_the_home_page() {
        login.loginAsStudent();
    }

    @Then("the user should see following students modules")
    public void the_user_should_see_following_students_modules(List<String> expectedModules) {

        List<String> actualModules = BrowserUtils.getElementsText(studentLandingPage.studentsModules);
        System.out.println("actualModules = " + actualModules);
        System.out.println("expectedModules = " + expectedModules);
        Assert.assertEquals("Failed, Student Modules",actualModules, expectedModules);



    }

    @Given("the librarian on the homepage")
    public void the_librarian_on_the_homepage() {
        login.loginAsLibrarian();
    }

    @Then("the user should see following librarian modules")
    public void the_user_should_see_following_librarian_modules(List<String> expectedModules) {
        List<String> actualModules = BrowserUtils.getElementsText(librarianLandingPage.librarianModules);
        System.out.println("actualModules = " + actualModules);
        System.out.println("expectedModules = " + expectedModules);
        Assert.assertEquals("Failed, Librarian Modules",actualModules, expectedModules);
    }


}
