import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class GetOurLatestNewsAndSpecialSales extends BaseTest {

    MainPage mainPage = new MainPage();
    @Test
    public void getOurLatestNewsAndSpecialSales() {

        WebElement inputEmailField = mainPage.getInputEmailField();
        mainPage.scrollToElement(inputEmailField);
        inputEmailField.sendKeys("tttt@ttt");

        String actualText =
                mainPage.clickSubscribeButton()
                        .getTextFromSuccessfullySubscribedFieldWithText();
        Assert.assertEquals(actualText, "You have successfully subscribed to this newsletter.");
    }
}
