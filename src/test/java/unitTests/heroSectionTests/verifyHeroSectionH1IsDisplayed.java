package unitTests.heroSectionTests;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyHeroSectionH1IsDisplayed extends BaseTest {

    @Test
    public void test(){
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.getH1Heading().isDisplayed());
    }
}
