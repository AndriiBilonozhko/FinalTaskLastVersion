package tests;

import org.testng.annotations.Test;
import pages.MainPage;

public class PriceDropCheck extends BaseTest{


    @Test

    public void priceDropCheck() throws InterruptedException {
        MainPage mainPage = new MainPage();

        mainPage.clickPricesDropButton();

    }

}
