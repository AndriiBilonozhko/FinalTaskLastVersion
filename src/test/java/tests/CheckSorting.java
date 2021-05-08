package tests;

import blocks.Product;
import org.testng.annotations.Test;
import pages.AllProductPage;
import pages.MainPage;

import java.util.List;

public class CheckSorting extends BaseTest {

    @Test
    public void checkSorting()  {
        MainPage mainPage = new MainPage();
        AllProductPage allProductPage = new AllProductPage();
        mainPage.clickOnAllProductsButton()
                .clickOnDropDownList()
                .clickOnFilterNameAtoZ();
            List<Product> nameOfProducts = allProductPage.getProductsOnPage();
            for (Product product : nameOfProducts) {
                String actualAlphabeticallySortingProducts = product.getName().getText();
            }
    }
}
