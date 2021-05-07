package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

import java.util.List;
import java.util.stream.Collectors;

public class CheckCountOfLanguagesInDropDownMenu extends BaseTest {
    String expectedResult = "Українська";

    @Test
    public void CheckCountOfLanguagesInDropDownMenu() {//TODO code convention

        MainPage mainPage = new MainPage();

        List<WebElement> language = mainPage.clickDropDownMenuWithLanguages() //TODO rename field
                .getLanguagesContainers();
        List<String> languageList = language.stream().map(s -> s.getText()).collect(Collectors.toList());
        //TODO soft assert here
        Assert.assertEquals(language.size(), 46);
        Assert.assertTrue(languageList.contains(expectedResult), "List doesn`t contain language " + expectedResult);

    }


}
