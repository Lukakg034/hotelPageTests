package unitTests.toTopArrowTests;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyArrowIsPresentOnPage extends BaseTest {

    @Test
    public void test() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.getToTopArrow().isDisplayed());
    }
}
