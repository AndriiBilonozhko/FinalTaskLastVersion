import org.testng.annotations.Test;
import pages.MainPage;

public class CheckLanguagesInDropDownMenu extends BaseTest {


    @Test

    public void CheckLanguagesInDropDownMenu() {

        MainPage mainPage= new MainPage();

        mainPage.clickDropDownMenuWithLanguages();
    }
}
