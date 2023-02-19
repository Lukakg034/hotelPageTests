package pageTest;
import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyPageIsDisplayed extends BaseTest{

    @Test
    public void test(){
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.getBackgroundVideo().isDisplayed());
    }
}
