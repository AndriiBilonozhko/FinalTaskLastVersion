import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MainPage;

public class CreateNewAccount extends BaseTest {



    @Test

    public void createNewAccount(){

        MainPage mainPage = new MainPage();
        String firstName = "Andrii";
        String secondName = "Bilonozhko";
        String expectedAccountName= firstName+" "+secondName;

String actualAccountName=
        mainPage.clickSingInButton()
                .clickCreateNewAccountButton()
                .ChooseSocialTitle()
                .inputFirstName(firstName)
                .inputLastName(secondName)
                .inputEmail("asdd@gmail.com")
                .inputPassword("12345")
                .inputBirthdayDate("12/12/1995")
                .clickCustomerPrivacyButton()
                .clickAgreeButton()
                .clickSaveButton()
                .getTextFromUserLoginField();

        Assert.assertEquals(actualAccountName, expectedAccountName);

    }
}
