package tests;

import blocks.Product;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PricesDropPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceDropCheck extends BaseTest {


    @Test

    public void checkPriceDropCheck() throws InterruptedException {
        MainPage mainPage = new MainPage();
        PricesDropPage pricesDropPage = new PricesDropPage();


        mainPage.clickPricesDropButton();

        List<Product> nameOfProducts = pricesDropPage.getProductsOnPage();
        for (Product product : nameOfProducts) {

            //TODO soft asserts
            assertThat(product.getNewPriceWe().isDisplayed());
            assertThat(product.getOldPriceWe().isDisplayed());
            double actualPrice = product.getNewPrice();
            double oldPrice = product.getOldPrice();
            double discount = product.getDiscount();
            double price = oldPrice - (oldPrice * discount / 100);
            double expectedPrice = Double.parseDouble(String.valueOf(price).substring(0,5));
            assertThat(actualPrice).isEqualTo(expectedPrice);
        }
    }

}
