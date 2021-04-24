package pages;

import blocks.Product;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static DriverFactory.DriverFactory.getDriver;
import static blocks.Product.getProduct;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@itemprop='itemListElement']")
    private List<WebElement> productContainer;

    @FindBy(xpath = "//button[contains(@class, 'select-title')]")
    private WebElement dropDownList;

    @FindBy(xpath = "//a[contains(text(), 'Name, A to Z')]")
    private WebElement nameAtoZ;

    @FindBy(xpath = "//a[contains(text(), 'Name, Z to A')]")
    private WebElement nameZtoA;

    @FindBy(xpath = "//a[contains(text(), 'Price, low to high')]")
    private WebElement priceLowToHigh;

    @FindBy(xpath = "//a[contains(text(), 'Price, high to low')]")
    private WebElement priceHighToLow;


    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }


    public List<Product> getProductsOnPage() {

        List<Product> allProducts = getProduct(productContainer);
        return allProducts;
    }


    public HomePage clickDropDownList() {
        dropDownList.click();
        return this;
    }

    public HomePage clickFilterNameAtoZ() {
        nameAtoZ.click();
        return this;
    }

    public HomePage clickFilterNameZtoA() {
        nameZtoA.click();
        return this;
    }

    public HomePage clickFilterPriceLowToHigh() {
        priceLowToHigh.click();
        return this;
    }

    public HomePage clickFilterPriceHighToLow() {
        priceHighToLow.click();
        return this;
    }
}
