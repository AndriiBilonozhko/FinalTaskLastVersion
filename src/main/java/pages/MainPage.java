package pages;

import blocks.Product;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static DriverFactory.DriverFactory.getDriver;
import static blocks.Product.getProduct;

@Slf4j
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

    @FindBy(xpath = "//a[contains(@href,'3-clothes')]")
    private WebElement clothesButton;

    @FindBy(xpath = "//a[contains(@href,'6-accessories')]")
    private WebElement accessoriesButton;

    @FindBy(xpath = "//a[contains(@href,'9-art')]")
    private WebElement artButton;

    @FindBy(xpath = "//a[contains(@href,'4-men')]")
    private WebElement menCategoryButton;

    @FindBy(xpath = "//a[contains(@href,'5-women')]")
    private WebElement womenCategoryButton;

    @FindBy(xpath = "//a[contains(@href,'7-stationery')]")
    private WebElement stationeryButton;

    @FindBy(xpath = "//a[contains(@href,'8-home-accessories')]")
    private WebElement homeAccessoriesButton;

    @FindBy(xpath = "//div[contains(@class,'popover')]")
    private WebElement fieldUnderClothesAndAccessoriesButton;

    @FindBy(xpath = "//div[@itemprop='itemListElement']")
    private List<WebElement> productContainer;

    @FindBy(xpath = "//a[contains(@href, 'prices-drop')]")
    private WebElement pricesDropButton;

    @FindBy(xpath = "//a[contains(@class,'all-product')]")
    private WebElement allProductsButton;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public MainPage setEmail(String eMail) throws InterruptedException {
        WebElement element = inputEmailField; //TODO why extra variable
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

    public Boolean isErrorMessageExist() {  //TODO remove spaces everywhere

        return isErrorExist(inputEmailField);


    }

    public int getCountOfLanguage() {
        return languagesContainers.size();


    }


    public String getLanguageOutOfTheDropList(String language) {
        if (languagesContainers.contains(language)) ;
        return language;
        //TODO remove spaces everywhere
    }

    public MainPage moveToClothesButton() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(clothesButton).build().perform();
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return this;
    }

    public MainPage moveToAccessoriesButton() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(accessoriesButton).build().perform();
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return this;
    }

    public MainPage moveToArtButton() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(artButton).build().perform();
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return this;
    }


    public boolean isCategoriesManButtonOfClothesFieldDisplayed() {
        return
                menCategoryButton.isDisplayed();

    }

    public boolean isCategoriesWomenButtonOfClothesFieldDisplayed() {
        return
                womenCategoryButton.isDisplayed();

    }

    public boolean isCategoriesStationeryButtonOfAccessoriesFieldDisplayed() {
        return
                stationeryButton.isDisplayed();

    }

    public boolean isCategoriesHomeAccessoriesButtonOfAccessoriesFieldDisplayed() {
        return
                homeAccessoriesButton.isDisplayed();

    }

    public boolean isEmptyFieldUnderArtButton() {

        return fieldUnderClothesAndAccessoriesButton.getText().isEmpty();

    }


    public List<Product> getProductsOnPage() {

        List<Product> allProducts = getProduct(productContainer);
        return allProducts;
    }

    public PricesDropPage clickPricesDropButton() throws InterruptedException {
        WebElement element = pricesDropButton;
        scrollToElement(pricesDropButton);

        pricesDropButton.click();
        return new PricesDropPage();

    }

    public AllProductPage clickAllProductsButton() throws InterruptedException {
        WebElement element = allProductsButton;
        scrollToElement(allProductsButton);

        allProductsButton.click();
        return new AllProductPage();

    }

}



