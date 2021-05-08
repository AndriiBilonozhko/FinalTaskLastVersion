package tests;


import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import pages.MainPage;

public class CheckCategories extends BaseTest {

    @Test
    public void checkCategories()  {
        MainPage mainPage = new MainPage();
        SoftAssertions sa = new SoftAssertions();
        boolean resultMenCategories =
                mainPage.hoverOverTopMenuLinks("CLOTHES")
                        .isCategoryDisplaying("MEN");
        boolean resultWomenCategories =
                mainPage.isCategoryDisplaying("WOMEN");
        sa.assertThat(resultMenCategories).as(" Categories MEN of clothes button not displayed").isTrue();
        sa.assertThat(resultWomenCategories).as(" Categories Women of clothes button not displayed").isTrue();
        boolean resultHomeAccessoriesButton =
                mainPage.hoverOverTopMenuLinks("ACCESSORIES")
                        .isCategoryDisplaying("STATIONERY");
        boolean resultStationeryButton = mainPage.isCategoryDisplaying("HOME_ACCESSORIES");
        sa.assertThat(resultHomeAccessoriesButton).as(" Categories Home Accessories of Accessories button not displayed").isTrue();
        sa.assertThat(resultStationeryButton).as(" Categories Stationery of Accessories button not displayed").isTrue();
        boolean resultArtButton =
                mainPage.hoverOverTopMenuLinks("ART")
                        .isEmptyFieldUnderArtButton();
        sa.assertThat(resultArtButton).as("Categories under Art button not empty").isTrue();
        sa.assertAll();
    }
}
