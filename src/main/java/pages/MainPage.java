package pages;

import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class MainPage extends BasePage {

    @FindBy(xpath = "//input[@type='email']")
    private WebElement inputEmailField;

    @FindBy(xpath = "//input[@name='submitNewsletter']")
    private WebElement subscribeButton;

    @FindBy(xpath = "//p[contains(@class,'alert ')]")
    private WebElement successfullySubscribedFieldWithText;

    @FindBy(xpath = "//i[contains(@class,'expand-more')]")
    private WebElement dropDownMenuWithLanguages;

    @FindBy(xpath = "//ul[contains(@class,'dropdown')]")
    private List<WebElement> languagesContainers;


    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public MainPage setEmail(String eMail) throws InterruptedException {
        WebElement element = inputEmailField;
        scrollToElement(element);
        inputEmailField.sendKeys(eMail);
        return this;
    }

    public MainPage clickSubscribeButton() {
        subscribeButton.click();
        return this;
    }


    public MainPage clickDropDownMenuWithLanguages() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(dropDownMenuWithLanguages));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", dropDownMenuWithLanguages);

        return this;
    }

    public Boolean isErrorMessegeExist() {

        return isErrorExist(inputEmailField);


    }

    public int getCounOfLanguage() {
        return languagesContainers.size();


    }
}

//
//    public List<Language> getAllLanguagesOnPage() {
//        Language language = new Language();
//        List<Language> languages = language.getLanguages(languagesContainers);
//        return languages;
//    }


