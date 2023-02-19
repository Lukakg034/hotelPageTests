package unitTests.serviceSectionTests;

import Pages.HomePage;
import baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class verifyServiceSectionH3AreDispayed extends BaseTest {

    @Test
    public void test(){
        HomePage homePage = new HomePage(driver);

        List <String> h3ExpectedHeadings = Arrays.asList("Promotion", "Hotel restaurant",
            "Rent a car", "Family package", "Business package", "Conferences");

        for (int i=0; i<h3ExpectedHeadings.size(); i++) {
            String h3ExpectedHeading = h3ExpectedHeadings.get(i);
            WebElement h3Element = homePage.getServiceSectionH3Headings().get(i);
            String h3Text = h3Element.getText();
            Assert.assertEquals(h3Text, h3ExpectedHeading);
//            System.out.println(h3Text);
        }


//        for (WebElement h3Heading : homePage.getServiceSectionH3Headings()) {
//            String h3HeadingText = h3Heading.getText();
//            h3Headings.add(h3HeadingText);
//        }
//
//        for (String h3HeadingText : h3Headings) {
//            System.out.println(h3HeadingText);
//        }
//        for (String h3HeadingText : h3Headings) {
//            Assert.assertTrue(h3HeadingText);
//        }
    }
}
