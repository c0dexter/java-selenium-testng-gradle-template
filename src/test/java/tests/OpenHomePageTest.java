package tests;

import org.testng.annotations.Test;
import page.objects.LandingPage;

public class OpenHomePageTest extends TestBase {

    @Test
    public void openHomePage() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnHeaderLogo();
    }
}
