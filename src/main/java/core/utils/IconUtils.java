/*
 * Copyright (c) 2022 
 * Automation Framework Selenium
 */

package core.utils;

import core.constants.FrameworkConstants;
import core.enums.Browser;
import core.helpers.PropertiesHelpers;

import static core.constants.FrameworkConstants.*;

import org.testng.Reporter;

//final -> We do not want any class to extend this class
public final class IconUtils {

    /**
     * Private constructor to avoid external instantiation
     * private -> We do not want anyone to create the object of this class
     */
    private IconUtils() {
    }

    public static String getBrowserIcon() {
//        String browserInLowerCase = BrowserInfoUtils.getBrowserInfo().toLowerCase();


        if (BrowserInfoUtils.getBrowserInfo().contains(Browser.CHROME.toString())) {
            return ICON_BROWSER_CHROME;
        } else if (BrowserInfoUtils.getBrowserInfo().contains(Browser.EDGE.toString())) {
            return ICON_BROWSER_EDGE;
        } else if (BrowserInfoUtils.getBrowserInfo().contains(Browser.FIREFOX.toString())) {
            return ICON_BROWSER_FIREFOX;
        } else {
            return BrowserInfoUtils.getBrowserInfo();
        }
    }

    public static String getOSIcon() {

        String operationSystem = BrowserInfoUtils.getOSInfo().toLowerCase();
        if (operationSystem.contains("win")) {
            return ICON_OS_WINDOWS;
        } else if (operationSystem.contains("nix") || operationSystem.contains("nux") || operationSystem.contains("aix")) {
            return ICON_OS_LINUX;
        } else if (operationSystem.contains("mac")) {
            return ICON_OS_MAC;
        }
        return operationSystem;
    }
}
