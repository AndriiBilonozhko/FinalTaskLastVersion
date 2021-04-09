import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class CheckLanguagesInDropDownMenu extends BaseTest {


    @Test
    public void CheckLanguagesInDropDownMenu() {

        MainPage mainPage = new MainPage();

        int countOfLanguage =
                mainPage.clickDropDownMenuWithLanguages()
                        .getCounOfLanguage();
        Assert.assertEquals(countOfLanguage, 46);
    }


}
