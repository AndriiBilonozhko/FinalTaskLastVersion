package tests;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.MainPage;

import java.util.List;
import java.util.stream.Collectors;

public class CheckCountOfLanguagesInDropDownMenu extends BaseTest {
    String expectedResult = "Українська";

    @Test
    public void checkCountOfLanguagesInDropDownMenu() {
        SoftAssertions sa = new SoftAssertions();
        MainPage mainPage = new MainPage();
        List<WebElement> language = mainPage.clickOnDropDownMenuWithLanguages()
                .getLanguagesContainers();
        List<String> languageList = language.stream().map(s -> s.getText()).collect(Collectors.toList());
        sa.assertThat(language.size()).isEqualTo(44);
        sa.assertThat(languageList).as("List doesn`t contain language " + expectedResult).contains(expectedResult);
        sa.assertAll();
    }
}
