package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class GetOurLatestNewsAndSpecialSales extends BaseTest { //TODO rename

    @Test
    public void getOurLatestNewsAndSpecialSales()  {
        MainPage mainPage = new MainPage();
        Boolean isErrorTrue =
                mainPage.setEmail("asdaghb")
                        .clickSubscribeButton()
                        .isErrorMessageExist();
        Assert.assertFalse(isErrorTrue);
    }
}
