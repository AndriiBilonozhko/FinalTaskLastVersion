package tests;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.MainPage;

public class
colorAndInvalidMessageOfFirstNameField extends BaseTest {
    public class EventListenerTest {
        private EventFiringWebDriver decoratedDriver;

    }
    @Test
    public void invalidFormTextOfFirstNameField() {

        MainPage mainPage = new MainPage();
        LogInPage logInPage = new LogInPage();

        String actualTextInvalidMessage =
                mainPage.clickSingInButton()
                        .clickCreateNewAccountButton()
                        .ChooseSocialTitle()
                        .inputFirstName("Jame3s")
                        .inputLastName("sdsaq")
                        .inputEmail("asdkasdvksasdsd@gmail.com")
                        .inputPassword("12345")
                        .inputBirthdayDate("12/12/1995")
                        .clickCustomerPrivacyButton()
                        .clickAgreeButton()
                        .clickSaveButtonWithIncorrectDate()
                        .getTextInvalidForm();

        String actualColorOfField = logInPage.getColorOfFirstNameField();

        Assert.assertEquals(actualTextInvalidMessage, "Invalid format.");
        Assert.assertEquals(actualColorOfField, "rgb(255, 76, 76) ");

    }

}
