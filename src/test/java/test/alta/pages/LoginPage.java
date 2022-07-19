package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class LoginPage extends BasePageObject {

    private By email(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");}

    private By password(){
        return MobileBy.xpath("//android.view.View/android.widget.EditText[2]");
    }

    private By buttonLogin(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sign In\"]");
    }

    private By errorEmail(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Please enter your email address\"]");
    }

    private By errorPassword1(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"This field is required\"]");
    }

    private By errorPassword2(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Password must be at least 8 characters in length\"]");
    }

    private By errorEmail2(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Please enter a valid email address\"]");
    }

    private By headerHome(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Today Outpatient\"]");
    }

    private By LogOut(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Log Out\"]");
    }

    @Step
    public void inputFieldEmail(String input){
        sendKeys(email(), input);
    }

    @Step
    public void inputFieldpassword(String input){
        sendKeys(password(), input);
    }

    @Step
    public void clickLoginButton() {
        click(buttonLogin());
    }

    @Step
    public void clickEmail() {
        click(email());
    }

    @Step
    public void clickPassword() {
        click(password());
    }

    @Step
    public void validateErrorEmail1() {
        Assertions.assertTrue(isDisplayed(errorEmail()));
    }

    @Step
    public void validateErrorEmail2() {
        Assertions.assertTrue(isDisplayed(errorEmail2()));
    }

    @Step
    public void validateErrorPassword1() {
        Assertions.assertTrue(isDisplayed(errorPassword1()));
    }

    @Step
    public void validateErrorPassword2() {
        Assertions.assertTrue(isDisplayed(errorPassword2()));
    }

    public void clickLogOut() {
        click(LogOut());
    }

    @Step
    public void validateHeaderHome() {
        Assertions.assertTrue(isDisplayed(headerHome()));
    }

    @Step
    public void validateLoginPage() {
        Assertions.assertTrue(isDisplayed(buttonLogin()));
    }

}
