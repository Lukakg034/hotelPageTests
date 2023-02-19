package unitTests.serviceSectionTests;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class verifySectionHeadingIsDisplayed extends BaseTest {

    @Test
    public void verifyServiceSectionH1IsDisplayed(){

        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.getH2ServiceHeading().isDisplayed());
    }
}
