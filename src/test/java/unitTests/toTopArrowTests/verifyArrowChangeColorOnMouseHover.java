package unitTests.toTopArrowTests;

import Pages.HomePage;
import baseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class verifyArrowChangeColorOnMouseHover extends BaseTest {

    @Test
    public void test() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        Actions actions = new Actions(driver);
        String hoverArrowCollor = "#735d3a";
        // Moving to the arrow element to trigger hover effect
        actions.moveToElement(homePage.getToTopArrow()).perform();
        // Slowing down execution to pick up right color value. Without it Selenium will gather value
        // between default element color and the value of color in hover state.
        Thread.sleep(3000);
        // Getting the color value of the arrow button while hovering.
        String hoverColorValue = homePage.getToTopArrow().getCssValue("fill");
        // Converting the default Selenium color read value from rgb to hex value
        String hoverColorValueHex = Color.fromString(hoverColorValue).asHex();
        // Asserting two values. The one that is located in the original web code with the one gathered by automation.
        Assert.assertEquals(hoverColorValueHex, hoverArrowCollor);


    }
}
