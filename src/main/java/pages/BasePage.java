package pages;

import DriverFactory.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static DriverFactory.DriverFactory.getDriver;

public class BasePage {

    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    private WebElement singInButton;

    @FindBy(xpath = "//div[@class ='user-info']//span")
    private WebElement userLoginField;

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void scrollToElement(WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
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
