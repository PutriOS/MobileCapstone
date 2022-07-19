package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class LogReport extends BasePageObject {

    private By menuLogReport(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Report Log\"]");
    }

    private By submittedReport(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Submitted Report for RM/748/2022/00001\"]");
    }

    @Step
    public void validateHomePage(){
        Assertions.assertTrue(isDisplayed(menuLogReport()));
    }

    @Step
    public void clickMenuLogReport(){
        click(menuLogReport());
    }

    @Step
    public void validateSubmittedReport(){
        isDisplayed(submittedReport());
    }
}
