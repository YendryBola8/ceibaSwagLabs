package org.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChecInfLocators {

    @FindBy(id = "cancel")
    public WebElement btnCancel;

    @FindBy(id = "continue")
    public WebElement btnContinue;

    @FindBy(id = "finish")
    public WebElement btnFinish;

    @FindBy(id = "first-name")
    public WebElement firstName;

    @FindBy(id = "last-name")
    public WebElement lastName;

    @FindBy(id = "postal-code")
    public WebElement posCode;

}
