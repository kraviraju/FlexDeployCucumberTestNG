package flexdeploy.com.common;

import core.driver.DriverManager;
import core.driver.TargetFactory;
import core.helpers.PropertiesHelpers;
import core.report.AllureManager;
import core.utils.WebUI;
import flexdeploy.listeners.TestListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.annotations.*;

@Listeners({TestListener.class})
public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        AllureManager.setAllureEnvironmentInformation();
        PropertiesHelpers.loadAllFiles(); //Config and Locators
    }

    @Parameters("browser")
    @BeforeClass
    public void createDriver(@Optional("chrome") String browser) {
        WebDriver driver = ThreadGuard.protect(new TargetFactory().createInstance(browser));
        DriverManager.setDriver(driver);
    }

    @AfterClass
    public void closeDriver() {
        DriverManager.quit();
        WebUI.stopSoftAssertAll();
    }

    public WebDriver createBrowser(@Optional("chrome") String browser) {
        PropertiesHelpers.loadAllFiles();
        WebDriver driver = ThreadGuard.protect(new TargetFactory().createInstance(browser));
        DriverManager.setDriver(driver);
        return DriverManager.getDriver();

    }

}
