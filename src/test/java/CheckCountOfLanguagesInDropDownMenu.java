import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

import java.util.List;
import java.util.stream.Collectors;

public class CheckCountOfLanguagesInDropDownMenu extends BaseTest {
    String expectedResult = "Українська";

    @Test
    public void CheckCountOfLanguagesInDropDownMenu() {

        MainPage mainPage = new MainPage();

        mainPage.clickDropDownMenuWithLanguages();
        List<WebElement> language = mainPage.getLanguagesContainers();
        List<String> languageList = language.stream().map(s -> s.getText()).collect(Collectors.toList());
        Assert.assertEquals(language.size(), 46);
        Assert.assertTrue(languageList.contains(expectedResult), "List doesn`t contain language " + expectedResult);

    }


}
