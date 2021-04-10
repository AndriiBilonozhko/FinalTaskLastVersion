import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class GetOurLatestNewsAndSpecialSales extends BaseTest {


    @Test
    public void getOurLatestNewsAndSpecialSales() throws InterruptedException {

        MainPage mainPage = new MainPage();


Boolean isErrorTrue=
                mainPage.setEmail("asdaghb")
                        .clickSubscribeButton()
                        .isErrorMessageExist();
                Assert.assertFalse(isErrorTrue);

    }
}
