import blocks.Product;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.MainPage;

import java.util.List;
import java.util.stream.Collectors;

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
