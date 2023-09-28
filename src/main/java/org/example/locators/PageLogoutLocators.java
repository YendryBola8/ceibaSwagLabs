package org.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLogoutLocators {

    @FindBy(id = "back-to-products")
    public WebElement btnBackHome;

    @FindBy(id = "react-burger-menu-btn")
    public WebElement btnMenu;

    @FindBy(id = "logout_sidebar_link")
    public WebElement btnlogout;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/h2")
    public WebElement txtValidate;

}
