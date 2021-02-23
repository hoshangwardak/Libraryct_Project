package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LibrarianBooksPage {

    public LibrarianBooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement recordsSelect;
}
