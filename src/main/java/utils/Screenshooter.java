package utils;

import DriverFactory.DriverFactory;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshooter {
    @Attachment("Screenshot on failure")
    public static byte[] makeScreenshotOnFailure() {
        return ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
