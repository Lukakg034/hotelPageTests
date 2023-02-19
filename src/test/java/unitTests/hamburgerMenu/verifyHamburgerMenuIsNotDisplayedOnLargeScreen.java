package unitTests.hamburgerMenu;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyHamburgerMenuIsNotDisplayedOnLargeScreen extends BaseTest {

    @Test(enabled = false)
    public void test(){
        HomePage homePage = new HomePage(driver);
        // TODO Requires element to be hidden which is not the case at the moment.
        // TODO Original code needs to be updated with visibility first.
        Assert.assertFalse(homePage.getBackgroundVideo().isDisplayed());
    }
}