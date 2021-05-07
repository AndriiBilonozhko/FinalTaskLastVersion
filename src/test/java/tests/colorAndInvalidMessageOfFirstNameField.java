package tests;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.MainPage;

public class colorAndInvalidMessageOfFirstNameField extends BaseTest { //TODO rename
    public class EventListenerTest { //TODO what is this?
        private EventFiringWebDriver decoratedDriver;

    }
    @Test
    public void checkInvalidFormTextOfFirstNameField() {

        MainPage mainPage = new MainPage();

        LogInPage logInPage =
                mainPage.clickSingInButton()
                        .clickCreateNewAccountButton()
                        .ChooseSocialTitle()
                        .inputFirstName("Jame3s")//TODO all fields to up
                        .inputLastName("sdsaq")
                        .inputEmail("asdkasdvksasdsd@gmail.com")
                        .inputPassword("12345")
                        .inputBirthdayDate("12/12/1995")
                        .clickCustomerPrivacyButton()
                        .clickAgreeButton()
                        .clickSaveButtonWithIncorrectDate();
//                        .getTextInvalidForm();
        String actualTextInvalidMessage = logInPage.getTextInvalidForm(); //TODO rename
        String actualColorOfField = logInPage.getColorOfFirstNameField();

        Assert.assertEquals(actualTextInvalidMessage, "Invalid format.");
        Assert.assertEquals(actualColorOfField, "rgb(255, 76, 76)");

    }

}
