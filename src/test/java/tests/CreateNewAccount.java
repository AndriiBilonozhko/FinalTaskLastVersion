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
        String expectedAccountName = firstName + " " + secondName;
        String actualAccountName =
                mainPage.clickSingInButton()
                        .clickCreateNewAccountButton()
                        .chooseSocialTitle()
                        .inputFirstName(firstName)
                        .inputLastName(secondName)
                        .inputEmail("aswidd@gmail.com") //TODO all methods parameters as variables
                        .inputPassword("12345")
                        .inputBirthdayDate("12/12/1995")
                        .clickCustomerPrivacyButton()
                        .clickAgreeButton()
                        .clickSaveButton()
                        .getTextFromUserLoginField();
        Assert.assertEquals(actualAccountName, expectedAccountName);
    }
}
