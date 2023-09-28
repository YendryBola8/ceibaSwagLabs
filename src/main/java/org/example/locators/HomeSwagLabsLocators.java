package org.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeSwagLabsLocators {

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement btnLogin;

}
