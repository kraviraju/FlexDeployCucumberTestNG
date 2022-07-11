/*
 * Copyright (c) 2022 
 * Automation Framework Selenium
 */

package core.utils;

import org.zeroturnaround.zip.ZipUtil;

import static core.constants.FrameworkConstants.EXTENT_REPORT_FOLDER_PATH;
import static core.constants.FrameworkConstants.Zipped_ExtentReports_Folder_Name;

import java.io.File;

public class ZipUtils {

    /* Make Zip file of Extent Reports in Project Root folder */
    public static void zip() {

        ZipUtil.pack(new File(EXTENT_REPORT_FOLDER_PATH), new File(Zipped_ExtentReports_Folder_Name));

        Log.info("Zipped " + Zipped_ExtentReports_Folder_Name + " folder successfully !!");
    }

}
