package tests;

import blocks.Product;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.testng.annotations.Test;
import pages.AllProductPage;
import pages.MainPage;

import java.util.Collections;
import java.util.List;

public class CheckSorting extends BaseTest {

    @Test
    public void checkSorting() {
        MainPage mainPage = new MainPage();
        AllProductPage allProductPage = new AllProductPage();

        mainPage.clickOnAllProductsButton();
        List<Product> nameOfProducts = allProductPage.getProductsOnPage();
        for (Product product : nameOfProducts) {

        }


    }
}
