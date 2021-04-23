package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static DriverFactory.DriverFactory.getDriver;

public class SingInPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'No account?')]")
    private WebElement createNewAccountButton;

    public SingInPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public LogInPage clickCreateNewAccountButton() {
        createNewAccountButton.click();
        return new LogInPage();
    }
}
