package tests;

import blocks.Product;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PricesDropPage;

import java.util.List;

public class PriceDropCheck extends BaseTest {

    @Test
    public void checkPriceDropCheck()  {
        MainPage mainPage = new MainPage();
        SoftAssertions sa = new SoftAssertions();
        PricesDropPage pricesDropPage = new PricesDropPage();
        mainPage.clickOnPricesDropButton();
        List<Product> nameOfProducts = pricesDropPage.getProductsOnPage();
        for (Product product : nameOfProducts) {
            sa.assertThat(product.getNewPriceWe().isDisplayed());
            sa.assertThat(product.getOldPriceWe().isDisplayed());
            sa.assertThat(product.getNewPrice()).isEqualTo(product.countExpectedPrice());
            sa.assertAll();
        }
    }
}
