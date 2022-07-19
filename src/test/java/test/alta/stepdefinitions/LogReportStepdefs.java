package test.alta.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.alta.pages.LogReport;
import test.alta.pages.LoginPage;
import test.alta.pages.Screen;

public class LogReportStepdefs {
    LogReport logReport = new LogReport();
    LoginPage loginPage = new LoginPage();

    @Given("I am on home Page")
    public void iAmOnHomePage() throws InterruptedException {
        loginPage.validateHeaderHome();
    }

    @When("I click menu log report")
    public void iClickMenuLogReport() {
        logReport.clickMenuLogReport();
    }

    @Then("I validate elements elements")
    public void iValidateElementsElements() {
        logReport.validateSubmittedReport();
    }
}
