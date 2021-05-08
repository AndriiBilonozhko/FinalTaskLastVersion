package tests;

import blocks.Product;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import pages.MainPage;

import java.util.List;

public class CheckPopularProducts extends BaseTest {

    @Test
    public void checkPopularProducts() {
        MainPage mainPage = new MainPage();
        SoftAssertions sa = new SoftAssertions();
        List<Product> nameOfProducts = mainPage.getProductsOnPage();
        for (Product product : nameOfProducts) {
            sa.assertThat(product.getName().isDisplayed());
            sa.assertThat(product.getNewPriceWe().isDisplayed());
            double actualPrice = product.getNewPrice();
            sa.assertThat(actualPrice).isGreaterThan(0.00);
            sa.assertAll();
        }
    }
}
