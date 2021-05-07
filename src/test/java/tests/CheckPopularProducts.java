package tests;

import blocks.Product;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CheckPopularProducts extends BaseTest {


    @Test
    public void checkPopularProducts()  {
        MainPage mainPage = new MainPage();
        List<Product> nameOfProducts = mainPage.getProductsOnPage();
        //TODO soft aserts
        for (Product product : nameOfProducts) {
            assertThat(product.getName().isDisplayed());
            assertThat(product.getNewPriceWe().isDisplayed());

            double actualPrice = product.getNewPrice();
            assertThat(actualPrice).isGreaterThan(0.00);

        }

    }
}
