package unitTests.testimonialSectionTests;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifySectionHeadingIsDisplayed extends BaseTest {

    @Test
    public void test(){

        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.getH2TestimonialHeading().isDisplayed());
    }
}
