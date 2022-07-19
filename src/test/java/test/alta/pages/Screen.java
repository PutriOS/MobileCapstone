package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class Screen extends BasePageObject {

    private By next(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    }

    private By getStarted(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Get Started\"]");
    }

    @Step
    public void clickNext(){
        click(next());
    }

    @Step
    public void clickgetStarted(){
        click(getStarted());
    }
}
