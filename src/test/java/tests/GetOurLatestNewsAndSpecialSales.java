package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class GetOurLatestNewsAndSpecialSales extends BaseTest { //TODO rename


    @Test
    public void getOurLatestNewsAndSpecialSales() throws InterruptedException { //TODO InterruptedException not here

        MainPage mainPage = new MainPage();


        Boolean isErrorTrue =
                mainPage.setEmail("asdaghb")
                        .clickSubscribeButton()
                        .isErrorMessageExist();
        Assert.assertFalse(isErrorTrue);

    }
}
