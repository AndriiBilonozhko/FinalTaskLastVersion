package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class CheckCategories extends BaseTest {




    @Test
    public void CheckCategories() throws InterruptedException {

        MainPage mainPage = new MainPage();

        boolean resultMenCategories =
                mainPage.moveToClothesButton()
                        .isCategoriesManButtonOfClothesFieldDisplayed();

        boolean resultWomenCategories =
                mainPage.isCategoriesWomenButtonOfClothesFieldDisplayed();

        Assert.assertTrue(resultMenCategories, " Categories MEN of clothes button not displayed");
        Assert.assertTrue(resultWomenCategories, " Categories Women of clothes button not displayed");


        boolean resultHomeAccessoriesButton =
                mainPage.moveToAccessoriesButton()
                        .isCategoriesHomeAccessoriesButtonOfAccessoriesFieldDisplayed();

        boolean resultStationeryButton = mainPage.isCategoriesStationeryButtonOfAccessoriesFieldDisplayed();

        Assert.assertTrue(resultHomeAccessoriesButton, " Categories Home Accessories of Accessories button not displayed");
        Assert.assertTrue(resultStationeryButton, " Categories Stationery of Accessories button not displayed");


        boolean resultArtButton =
                mainPage.moveToArtButton()
                        .isEmptyFieldUnderArtButton();
        Assert.assertTrue(resultArtButton, "Categories under Art button not empty");
    }


}
