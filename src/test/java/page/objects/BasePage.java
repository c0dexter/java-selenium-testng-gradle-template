package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
}
