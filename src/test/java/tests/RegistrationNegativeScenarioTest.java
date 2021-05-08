package tests;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.MainPage;

public class RegistrationNegativeScenarioTest extends BaseTest {

    @Test
    public void checkInvalidFormTextAndColorOfFirstNameField() {
        MainPage mainPage = new MainPage();
        SoftAssertions sa = new SoftAssertions();
        String firstName = "Jame3s";
        String secondName = "sdsaq";
        String email = "asdkasdvksasdsd@gmail.com";
        String password = "12345";
        String birthdayDate = "12/12/1995";
        LogInPage logInPage =
                mainPage.clickSingInButton()
                        .clickCreateNewAccountButton()
                        .chooseSocialTitle()
                        .inputFirstName(firstName)
                        .inputLastName(secondName)
                        .inputEmail(email)
                        .inputPassword(password)
                        .inputBirthdayDate(birthdayDate)
                        .clickCustomerPrivacyButton()
                        .clickAgreeButton()
                        .clickSaveButtonWithIncorrectDate();
        String actualTextInvalidMessage = logInPage.getTextFromInvalidForm();
        String actualColorOfField = logInPage.getColorOfFirstNameField();
        sa.assertThat(actualTextInvalidMessage).isEqualTo("Invalid format.");
        sa.assertThat(actualColorOfField).isEqualTo("rgb(255, 76, 76)");
        sa.assertAll();
    }
}
