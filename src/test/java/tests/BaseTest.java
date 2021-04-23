package tests;

import DriverFactory.DriverFactory;
import Listerner.MyListerner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

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
