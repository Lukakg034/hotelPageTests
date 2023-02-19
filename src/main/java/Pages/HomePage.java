package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    // Logo locators
    By navigationLogo = By.className("logo-img");

    // Link locators
    By navLinks = By.className("nav-list");
    // Social link locators

    // Section locators
    By heroSection = By.className("hero-section");
    By servicesSection = By.id("services");
    By hotelRoomsSection = By.id("hotel-rooms");
    By testimonialSection = By.id("testimonial");
    By footerSection = By.id("footer");
    // Arrow button locator
    By toTopArrow = By.className("to-top-arrow");
    // Image locators
    // Phone number locator
    By contactPhone = By.className("contact-phone");
    // Email locator
    By contactEmail = By.className("contact-email");
    // Copyright locator
    By copyright = By.className("copyright");
    // Iframe locator
    By mapIframe = By.tagName("iframe");
    // Video container
    By backgroundVideoContainer = By.className("video-container");
    // Background video locator
    By backgroundVideo = By.className("home-video");
    // H1
    By headingH1 = By.tagName("h1");
    // H2
    By serviceHeading = By.className("service-heading");
    By hotelHeading = By.className("hotel-heading");
    By testimonialHeading = By.className("secondary-heading");
    // H3
    By servicesH3Heading = By.tagName("h3");



    //Logo
    public WebElement getNavigationLogo(){return driver.findElement(navigationLogo);}
    //Links
    public List<WebElement> getNavLinks() { return driver.findElements(navLinks);}
    // Sections
    public WebElement getHeroSection(){return driver.findElement(heroSection);}
    public WebElement getServiceSection(){return driver.findElement(servicesSection);}
    public WebElement getHotelRoomSection(){return driver.findElement(hotelRoomsSection);}
    public WebElement getTestimonialSection(){return driver.findElement(testimonialSection);}
    public WebElement getFooterSection(){ return driver.findElement(footerSection);}
    // To top arrow
    public WebElement getToTopArrow(){return driver.findElement(toTopArrow);}
    // Contact phone
    public WebElement getContactPhone(){return driver.findElement(contactPhone);}
    // Contact email
    public WebElement getContactEmail(){ return driver.findElement(contactEmail);}
    // Footer copyright
    public WebElement getCopyright(){ return driver.findElement(copyright);}
    // Iframe
    public WebElement getMapIframe() {return driver.findElement(mapIframe);}
    // Video container
    public WebElement getBackgroundVideoContainer(){ return driver.findElement(backgroundVideoContainer);}
    // Background video
    public WebElement getBackgroundVideo(){ return driver.findElement(backgroundVideo);}
    // H1
    public WebElement getH1Heading(){ return driver.findElement(headingH1);}
    // H2
    public WebElement getH2ServiceHeading(){ return driver.findElement(serviceHeading);}
    public WebElement getH2HotelSectionHeading(){ return driver.findElement(hotelHeading);}
    public WebElement getH2TestimonialHeading(){ return driver.findElement(testimonialHeading);}
    // H3 headings
    public List<WebElement> getServiceSectionH3Headings(){return driver.findElements(servicesH3Heading);}
}
