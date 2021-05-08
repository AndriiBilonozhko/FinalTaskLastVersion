package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class CreateNewAccount extends BaseTest {

    @Test
    public void createNewAccount() {
        MainPage mainPage = new MainPage();
        String firstName = "Andrii";
        String secondName = "Bilonozhko";
        String email = "aswidd@gmail.com";
        String password = "12345";
        String birthdayDate = "12/12/1995";
        String expectedAccountName = firstName + " " + secondName;
        String actualAccountName =
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
                        .clickSaveButton()
                        .getTextFromUserLoginField();
        Assert.assertEquals(actualAccountName, expectedAccountName);
    }
}
