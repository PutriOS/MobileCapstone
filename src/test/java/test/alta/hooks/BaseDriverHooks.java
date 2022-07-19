package test.alta.hooks;

import io.cucumber.java.After;
import test.alta.driver.DriverPool;
import test.alta.pageobject.BasePageObject;

import java.util.Optional;

public class BaseDriverHooks {
    public DriverPool driverPool = new DriverPool();
    public BasePageObject driver = new BasePageObject();

    @After
    public void afterTest() {
        driver.getDriver().closeApp();
    }

    public void quitWebdrivers(DriverPool drivers) {

        Optional.ofNullable(drivers.getAndroidDriver())
                .ifPresent(
                        driver -> {
                            driver.quit();
                            drivers.setAndroidDriver(null);
                        });
    }
}