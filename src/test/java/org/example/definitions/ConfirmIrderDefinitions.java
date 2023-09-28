package org.example.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.actions.ChecInfActions;
import org.example.actions.HomeSwagLabsActions;
import org.example.actions.PageLogoutActions;
import org.example.actions.ProductSwagLabsActions;
import org.example.utils.HelperClass;
import org.testng.Assert;

public class ConfirmIrderDefinitions {
    HomeSwagLabsActions objHomePage = new HomeSwagLabsActions();
    ProductSwagLabsActions objArticule = new ProductSwagLabsActions();
    ChecInfActions objjChecInf = new ChecInfActions();
    PageLogoutActions objPageLogout = new PageLogoutActions();


    @Given("User is on login page {string}")
    public void user_open_page(String url) {
        HelperClass.openPage(url);
    }

    @Given("that an User enters username as {string} and password as {string}")
    public void goToHomePageLogin(String user, String pass) {
        objHomePage.login_credencials(user, pass);
    }

    @When("the user login with account")
    public void login_with_account() {
        objHomePage.clikc_login();
    }

    @When("the user select any article")
    public void select_any_article() {
        objArticule.click_any_product();
    }

    @When("the user confirm order on shopping cart")
    public void confirm_order_on_shopping_cart() {
        objArticule.click_cart();
        objjChecInf.click_checkout();
        objjChecInf.addName();
        objjChecInf.addLastName();
        objjChecInf.postCode();
        objjChecInf.click_continue();
        objjChecInf.click_finish();
    }

    @Then("the user should be to see confirm purchase message {string}")
    public void confirm_purchase_message(String message) throws InterruptedException{
        Assert.assertEquals(objPageLogout.getMenssage(), message);
        Thread.sleep(2000);
        objPageLogout.menu();
        objPageLogout.logout();
    }

}
