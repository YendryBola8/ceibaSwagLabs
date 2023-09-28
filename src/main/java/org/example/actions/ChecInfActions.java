package org.example.actions;

import org.example.locators.CartPageLocators;
import org.example.locators.ChecInfLocators;
import org.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class ChecInfActions {

    ChecInfLocators checInfLocators = null;
    CartPageLocators cartPageLocators = null;

    public ChecInfActions(){
        this.checInfLocators = new ChecInfLocators();
        this.cartPageLocators = new CartPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), checInfLocators);
        PageFactory.initElements(HelperClass.getDriver(), cartPageLocators);
    }

    public void click_checkout(){
        cartPageLocators.btnCheckout.click();
    }

    public void addName(){
        checInfLocators.firstName.clear();
        checInfLocators.firstName.sendKeys("FirstName");
    }

    public void addLastName(){
        checInfLocators.lastName.clear();
        checInfLocators.lastName.sendKeys("LastName");
    }

    public void postCode(){
        checInfLocators.posCode.clear();
        checInfLocators.posCode.sendKeys("110111");
    }

    public void click_continue(){
        checInfLocators.btnContinue.click();
    }

    public void click_finish(){
        checInfLocators.btnFinish.click();
        // Thank you for your order!
    }
}
