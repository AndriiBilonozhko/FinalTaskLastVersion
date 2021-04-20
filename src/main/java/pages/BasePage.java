package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    private WebElement singInButton;

    @FindBy(xpath = "//div[@class ='user-info']//span")
    private WebElement userLoginField;

    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public static WebDriver getDriver() {
        return driver;


    }


    public void scrollToElement(WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    protected Boolean isErrorExist(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        return (Boolean) js.executeScript("return arguments[0].checkValidity();", element);

    }

    public SingInPage clickSingInButton() {
        singInButton.click();
        return new SingInPage();
    }

    public String getTextFromUserLoginField() {
        return userLoginField.getText();

    }
}
