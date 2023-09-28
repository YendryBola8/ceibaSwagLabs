package org.example.actions;

import org.example.locators.HomeSwagLabsLocators;
import org.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class HomeSwagLabsActions {

    HomeSwagLabsLocators homeSwagLabsLocators = null;

    public HomeSwagLabsActions() {
        this.homeSwagLabsLocators = new HomeSwagLabsLocators();
        PageFactory.initElements(HelperClass.getDriver(), homeSwagLabsLocators);
    }

    public void login_credencials(String strUserName, String strPassword){
        homeSwagLabsLocators.userName.clear();
        homeSwagLabsLocators.userName.sendKeys(strUserName);

        homeSwagLabsLocators.password.clear();
        homeSwagLabsLocators.password.sendKeys(strPassword);
    }


    public void clikc_login() {
        homeSwagLabsLocators.btnLogin.click();
    }
}
