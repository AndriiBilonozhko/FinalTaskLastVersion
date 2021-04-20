package tests;

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

        private EventFiringWebDriver decoratedDriver;



    @BeforeMethod
    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver originalDriver = new ChromeDriver();

        decoratedDriver = new EventFiringWebDriver(originalDriver);
        decoratedDriver.register(new MyListerner());

        decoratedDriver.manage().window().maximize();
        decoratedDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        decoratedDriver.get(" https://demo.prestashop.com/");

        try {
            new WebDriverWait(originalDriver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("loadingMessage")));
        } catch (Exception a) {
        }
        try {
            Boolean webElement = new WebDriverWait(originalDriver, 5).until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingMessage")));

        } catch (Exception a) {
        }

        decoratedDriver.switchTo().frame("framelive");
        BasePage.setDriver(decoratedDriver);
    }


    @AfterMethod(alwaysRun = true)
    public void quite() {
        decoratedDriver.quit();
    }

}
