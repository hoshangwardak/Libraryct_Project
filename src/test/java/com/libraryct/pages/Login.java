package com.libraryct.pages;

import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends BasePage {

    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailAddressInputBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    public void loginAsStudent() {
        emailAddressInputBox.sendKeys(ConfigurationReader.getProperty("studentUsername"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("studentPassword"));
        signInButton.click();
    }

    public void loginAsLibrarian() {
        emailAddressInputBox.sendKeys(ConfigurationReader.getProperty("librarianUsername"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        signInButton.click();
    }

    public void getEnvironment(String environment) {
        Driver.getDriver().get(ConfigurationReader.getProperty(environment));
    }

    public void getLibrarianUsername(String username) {
        emailAddressInputBox.sendKeys(username);
    }

    public void getLibrarianPassword(String password) {
        passwordInputBox.sendKeys(password);
    }

    public void signIn() {
        signInButton.click();
    }

    public void dashboardIsDisplayed(String expectedWord) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expectedWord));
        String actualDashboardUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("actualDashboardUrl = " + actualDashboardUrl);
        Assert.assertTrue(actualDashboardUrl.contains(expectedWord));
        Driver.closeDriver();
    }

    public void getStudentUsername(String username) {
        emailAddressInputBox.sendKeys(username);
    }

    public void getStudentPassword(String password) {
        passwordInputBox.sendKeys(password);
    }

    public void booksIsDisplayed(String expectedWord) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expectedWord));
        String actualBooksUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("actualBooksUrl = " + actualBooksUrl);
        Assert.assertTrue(actualBooksUrl.contains(expectedWord));
        Driver.closeDriver();
    }
}
