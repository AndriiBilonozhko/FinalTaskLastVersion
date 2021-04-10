import blocks.Language;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

import java.util.ArrayList;
import java.util.List;

public class CheckLanguageIntoLanguageDropList extends BaseTest {


    @Test
    public void CheckCountOfLanguagesInDropDownMenu() {

        MainPage mainPage = new MainPage();

String expectedLanguage="Україська";
String actualLanguage=
                mainPage.clickDropDownMenuWithLanguages()
                        .getLanguageOutOfTheDropList(expectedLanguage);
        Assert.assertEquals(actualLanguage,expectedLanguage);

    }
}
