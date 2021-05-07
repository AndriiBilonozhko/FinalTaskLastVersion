package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

public class CheckCountOfLanguagesInDropDownMenu extends BaseTest {
    String expectedResult = "Українська";

    @Test
    public void checkCountOfLanguagesInDropDownMenu() {

        MainPage mainPage = new MainPage();

        List<WebElement> language = mainPage.clickDropDownMenuWithLanguages() //TODO rename field
                .getLanguagesContainers();
        List<String> languageList = language.stream().map(s -> s.getText()).collect(Collectors.toList());
        //TODO soft assert here
        assertEquals(language.size(), 46);
        assertTrue(languageList.contains(expectedResult), "List doesn`t contain language " + expectedResult);

    }


}
