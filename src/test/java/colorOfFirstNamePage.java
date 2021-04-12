import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class colorOfFirstNamePage extends BaseTest {


    @Test
    public void colorOfFirstNamePage() {

        MainPage mainPage = new MainPage();
        String actualTextInvalidMessage =
                mainPage.clickSingInButton()
                        .clickCreateNewAccountButton()
                        .ChooseSocialTitle()
                        .inputFirstName("James3")
                        .inputLastName("sdsaq")
                        .inputEmail("asdkasdvksasdsd@gmail.com")
                        .inputPassword("12345")
                        .inputBirthdayDate("12/12/1995")
                        .clickCustomerPrivacyButton()
                        .clickAgreeButton()
                        .clickSaveButtonWithIncorrectDate()
                        .getTextInvalidForm();
                     //   .getColorOfFirstNameField();


      //  Assert.assertTrue(!actualColorField.isEmpty());
        Assert.assertEquals(actualTextInvalidMessage, "Invalid format.");

    }

}
