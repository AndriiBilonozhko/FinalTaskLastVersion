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

            //TODO soft sserts
            assertThat(product.getNewPrice().isDisplayed());
            assertThat(product.getOldPrice().isDisplayed());


            String actualPrice = product.getNewPrice().getText().replace("€", "");
            String oldPrice = product.getOldPrice().getText().replace("€", "");
            double doubleOldPrice = Double.parseDouble(oldPrice);
            String discount = product.getDiscount().getText().replace("-", "").substring(0, 2);
            double doubleDiscount = Double.parseDouble(discount);
            double price = doubleOldPrice - (doubleOldPrice * doubleDiscount / 100);
            String expectedPrice = String.valueOf(price).substring(0,5);

            assertThat(actualPrice).isEqualTo(expectedPrice);
        }
    }

}
