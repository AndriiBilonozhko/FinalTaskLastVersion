package tests;

import DriverFactory.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void createDriver() {
       DriverFactory.init();
    }

    @AfterMethod(alwaysRun = true)
    public void quite() {
        DriverFactory.getDriver().quit();
    }

}
