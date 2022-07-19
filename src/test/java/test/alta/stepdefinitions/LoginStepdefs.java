package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.alta.pages.LoginPage;
import test.alta.pages.Screen;

public class LoginStepdefs {
    LoginPage loginPage = new LoginPage();

    @Given("I am on Login Page")
    public void iAmOnLoginPage() throws InterruptedException {
        loginPage.validateLoginPage();
    }

    @When("I input Email {string} and Password {string}")
    public void iInputEmailAndPassword(String email, String password) {
        loginPage.clickEmail();
        loginPage.inputFieldEmail(email);
        loginPage.clickPassword();
        loginPage.inputFieldpassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
    }


    @Then("I validate elements {string}")
    public void iValidateElements(String element) throws InterruptedException {
        if(element.equals("login")){
            loginPage.validateHeaderHome();
        }else if(element.equals("email null")){
            loginPage.validateErrorEmail1();
        }else if(element.equals("email invalid")){
            loginPage.validateErrorEmail2();
        }else if(element.equals("password null")){
            loginPage.validateErrorPassword1();
        }else if ((element.equals("password digit invalid"))){
            loginPage.validateErrorPassword2();
        }
    }
}
