package tests;

import blocks.Product;
import org.testng.annotations.Test;
import pages.AllProductPage;
import pages.MainPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckSorting extends BaseTest {

    @Test
    public void checkSorting() throws InterruptedException {
        MainPage mainPage = new MainPage();
        AllProductPage allProductPage = new AllProductPage();

        mainPage.clickAllProductsButton()
                .clickDropDownList()
                .clickFilterNameAtoZ();

            List<Product> nameOfProducts = allProductPage.getProductsOnPage();
            for (Product product : nameOfProducts) {
                String actualAlphabeticallySortingProducts = product.getName().getText();
            }


    }
}
