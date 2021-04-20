package tests;

import blocks.Product;
import org.testng.annotations.Test;
import pages.MainPage;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CheckPopularProducts extends BaseTest {
    MainPage mainPage = new MainPage();

    @Test
    public void checkPopularProducts() {

        List<Product> nameOfProducts = mainPage.getProductsOnPage();
        for (Product product : nameOfProducts) {
            assertThat(product.getName().isDisplayed());
        }

    }
}
