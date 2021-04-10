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

    @FindBy(xpath = "//i[contains(@class,'expand-more')]")
    private WebElement dropDownMenuWithLanguages;

    @FindBy(xpath = ".//ul[contains(@class,'dropdown')]/li")
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
        dropDownMenuWithLanguages.click();
        return this;
    }

    public Boolean isErrorMessageExist() {

        return isErrorExist(inputEmailField);


    }

    public int getCountOfLanguage() {
        return languagesContainers.size();


    }


    public String getLanguageOutOfTheDropList(String language) {
        if (languagesContainers.contains(language)) ;
        return language;

    }

}

