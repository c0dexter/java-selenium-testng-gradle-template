package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class LandingPage extends BasePage {

    @FindBy(id = "header_logo")
    WebElement headerLogo;

    public LandingPage clickOnHeaderLogo() {
        WaitForElement.waitUntilElementIsClickable(headerLogo);
        headerLogo.click();
        log().info("Clicked on the header logo");
        return new LandingPage();
    }
}
