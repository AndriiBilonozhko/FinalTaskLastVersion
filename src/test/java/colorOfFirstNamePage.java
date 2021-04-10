import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class colorOfFirstNamePage extends BaseTest {



    @Test
    public void colorOfFirstNamePage(){

        MainPage mainPage=new MainPage();
String actualColorField=
        mainPage.clickSingInButton()
                .clickCreateNewAccountButton()
                .ChooseSocialTitle()
                .inputFirstName("James7")
                .inputLastName("sdsaq")
                .inputEmail("asdkkassd@gmail.com")
                .inputPassword("12345")
                .inputBirthdayDate("12/12/1995")
                .clickCustomerPrivacyButton()
                .clickAgreeButton()
                .clickSaveButtonWithIncorrectDate()
                .getColorOfFirstNameField();


        Assert.assertTrue(actualColorField !=null);


    }

}
