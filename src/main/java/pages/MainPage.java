package pages;

import lombok.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//span[@class='expand-more']")
    private WebElement dropDownMenuWithLanguages;

    @FindBy(xpath = "//ul[contains(@class,'dropdown')]")
    private List<WebElement> languagesContainers;


    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public MainPage setEmail(String eMail) {
        inputEmailField.sendKeys(eMail);
        return this;
    }

    public MainPage clickSubscribeButton() {
        subscribeButton.click();
        return this;
    }

    public String getTextFromSuccessfullySubscribedFieldWithText() {
        return successfullySubscribedFieldWithText.getText();
    }

    public MainPage clickDropDownMenuWithLanguages() {
        dropDownMenuWithLanguages.click();
        return this;
    }

//    public List<Language> getAllLanguagesOnPage() {
//        Language language = new Language();
//        List<Language> languages = language.getLanguages(languagesContainers);
//        return languages;
//    }
}

