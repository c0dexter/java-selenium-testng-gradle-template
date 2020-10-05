package tests;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.objects.BasePage;

public class TestBase extends BasePage {

    protected WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        driver = DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage("http://automationpractice.com/index.php");
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }
}
