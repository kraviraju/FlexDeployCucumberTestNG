package flexdeploy.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

import core.driver.DriverManager;
import core.driver.TargetFactory;

import java.util.HashMap;
import java.util.Map;

public class TestContext {

    private WebDriver driver;
    private final Map<String, Object> contextList = new HashMap<>();

    public TestContext() {
        driver = ThreadGuard.protect(new TargetFactory().createInstance());
        DriverManager.setDriver(driver);
        System.out.println("Driver in TestContext: " + getDriver());
    }

    public Object getContext(String key) {
        return contextList.get(key);
    }

    public void setContext(Context key, Object value) {
        contextList.put(key.toString(), value);
    }

    public Boolean isContains(Context key) {
        return contextList.containsKey(key.toString());
    }

    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }

    public enum Context {
        PRODUCT_NAME;
    }

}
