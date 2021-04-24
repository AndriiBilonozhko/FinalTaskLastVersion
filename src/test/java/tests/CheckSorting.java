package tests;

import blocks.Product;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MainPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckSorting extends BaseTest{

    @Test
    public void checkSorting() throws InterruptedException {
        MainPage mainPage =new MainPage();
        HomePage homePage = new HomePage();

        mainPage.clickAllProductsButton()
                .clickDropDownList()
                .clickFilterNameAtoZ();

//        List<Product> nameOfProducts = homePage.getProductsOnPage();
//        for (Product product : nameOfProducts) {
//
//
//        }
    }
}
