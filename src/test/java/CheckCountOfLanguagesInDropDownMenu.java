import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class CheckCountOfLanguagesInDropDownMenu extends BaseTest {


    @Test
    public void CheckCountOfLanguagesInDropDownMenu() {

        MainPage mainPage = new MainPage();

        int countOfLanguage =
                mainPage.clickDropDownMenuWithLanguages()
                        .getCountOfLanguage();
        Assert.assertEquals(countOfLanguage, 46);


    }


}
