package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class SubscribeWithInvalidEmailTest extends BaseTest {

    @Test
    public void subscribeWithInvalidEmail()  {
        MainPage mainPage = new MainPage();
        Boolean isErrorTrue =
                mainPage.setEmail("asdaghb")
                        .clickSubscribeButton()
                        .isErrorMessageExist();
        Assert.assertFalse(isErrorTrue);
    }
}
