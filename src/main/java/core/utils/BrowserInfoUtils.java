/*
 * Copyright (c) 2022 
 * Automation Framework Selenium
 */

package core.utils;

import static core.constants.FrameworkConstants.BROWSER;

import org.testng.Reporter;

public final class BrowserInfoUtils {

    private BrowserInfoUtils() {
    }

    public static String getBrowserInfo() {
//        Capabilities capabilities = ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
//        return capabilities.getBrowserName().toUpperCase();
        String browser = "";
        if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser") == null) {
            browser = BROWSER.toUpperCase();
        } else {
            browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser").trim().toUpperCase();
        }
        return browser;
    }

    public static String getBrowserVersionInfo() {
//        Capabilities capabilities = ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
//        return capabilities.getBrowserVersion();
        return "";
    }

    public static String getOSInfo() {
        return System.getProperty("os.name").replace(" ", " ");
    }

}
