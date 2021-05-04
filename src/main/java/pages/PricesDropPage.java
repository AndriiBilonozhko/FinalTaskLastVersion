package pages;

import blocks.Product;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static DriverFactory.DriverFactory.getDriver;
import static blocks.Product.getProduct;

public class PricesDropPage extends BasePage {


    @FindBy(xpath = "//div[@itemprop='itemListElement']")
    private List<WebElement> productContainer;


    public PricesDropPage() {
        PageFactory.initElements(getDriver(), this);
    }


    public List<Product> getProductsOnPage() {

        List<Product> allProducts = getProduct(productContainer);
        return allProducts;
    }

}
