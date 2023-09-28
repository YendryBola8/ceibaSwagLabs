package org.example.actions;

import org.example.locators.PageLogoutLocators;
import org.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class PageLogoutActions {

    PageLogoutLocators pageLogoutLocators = null;

    public PageLogoutActions(){
        this.pageLogoutLocators = new PageLogoutLocators();
        PageFactory.initElements(HelperClass.getDriver(), pageLogoutLocators);
    }

    public String getMenssage(){
        return pageLogoutLocators.txtValidate.getText();
    }

    public void backHome(){
        pageLogoutLocators.btnBackHome.click();
    }

    public void menu(){
        pageLogoutLocators.btnMenu.click();
    }

    public void logout(){
        pageLogoutLocators.btnlogout.click();
    }
}
