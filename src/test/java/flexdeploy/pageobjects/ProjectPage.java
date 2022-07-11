package flexdeploy.pageobjects;

import core.constants.FrameworkConstants;
import core.driver.DriverManager;
import core.utils.WebUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class ProjectPage {

    public ProjectPage() {
    }

    
 // ****************************************** Locators ************************************************
  	private By createBtn = By.cssSelector("#app > div > main > div > div > div.justify-start.align-start > div > header > div > button > span");
  	private By blankproject = By.cssSelector("#app > div > main > div > div > div > div > div.v-card__text > div > div.v-list.transparent.v-sheet.theme--light > div:nth-child(1) > div.v-list-item__content > div.v-list-item__title > a");
    
  	private By projectnameTxtbx = By.xpath("/html/body/div/div/div/div/main/div/div/div/div/div[2]/form/span[1]/div/div/div[1]/div");
  	private By folderdropdown = By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div > div.v-card__text > form > span:nth-child(2) > div > div > div.v-input__slot > div.v-select__slot");
  	
  	
  	private By standardclassification      = By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div > div.v-card__text > form > span:nth-child(6) > div > div > div.v-input__slot > div > div:nth-child(2)");
  	private By packagebasedclassification  = By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div > div.v-card__text > form > span:nth-child(6) > div > div > div.v-input__slot > div > div:nth-child(3)");
  	private By containerclassification     = By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div > div.v-card__text > form > span:nth-child(6) > div > div > div.v-input__slot > div > div:nth-child(4)");
  	private By utilityclassification       = By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div > div.v-card__text > form > span:nth-child(6) > div > div > div.v-input__slot > div > div:nth-child(5)");
  	
  	private By savebutton = By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div > div.v-card__actions > div > div > div.d-flex.align-center.gap-4 > button > span > div");
  	
  	public By newprojectnametxt = By.cssSelector("#app > div > main > div > div > div.justify-start.align-start > div > div > div.d-flex.flex-column > div.d-flex.align-center.gap-4 > div > div:nth-child(1) > h4 > ul");
  	
  	public By dotseditproject = By.cssSelector("#app > div.v-application--wrap > main > div > div > div.justify-start.align-start > div > div > div.d-flex.align-center.flex-0-1.gap-2 > button.box.v-btn.v-btn--text.theme--light.v-size--default > span > i");
  	public By editproject = By.cssSelector("#app > div.v-menu__content.theme--light.menuable__content__active > div");
  	public By deleteprojectbtn = By.cssSelector("#app > div.v-application--wrap > main > div > div > div.fd-content.d-flex.flex-column.py-4 > div > div.d-flex.flex-column.pt-3 > form > div:nth-child(2) > div > div.d-flex.align-center.gap-4 > button.v-btn.v-btn--outlined.theme--light.v-size--default.error--text > span");
  	public By deleteconfirmationbtn = By.cssSelector("#app > div.v-menu__content.theme--light.menuable__content__active > div > div.v-card__actions.d-flex.justify-end > button.v-btn.v-btn--has-bg.theme--light.v-size--small.error > span");
  	
  	
  	
  	
  	
    
    // ****************************************** Methods ************************************************	    
    public void createBlankProject(String str) {
    	
    	Date date = Calendar.getInstance().getTime();  
    	DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");  
    	String strDate = dateFormat.format(date);  
    	FrameworkConstants.NEWPROJECTNAME="Automation_"+strDate;
    	
    	WebUI.clickElement(createBtn);
    	WebUI.sleep(1);
    	WebUI.clickElement(blankproject);
    	WebUI.sleep(2);
    	WebUI.waitForJQueryLoaded();
    	WebUI.waitForPageLoaded();
    	WebUI.setTextWithSwitch(projectnameTxtbx,FrameworkConstants.NEWPROJECTNAME);
    	WebUI.pressTAB();
    	WebUI.setTextWithSwitch(folderdropdown, "FlexDeploy / AutomationTestProjects");
    	WebUI.pressDOWNARROW();
    	WebUI.pressENTER();
    	
    	if (str.contains("standard")) { WebUI.clickElement(standardclassification); }
    	if (str.contains("container")) { WebUI.clickElement(containerclassification); }
    	
    	WebUI.clickElement(savebutton);
    	WebUI.sleep(2);
    	
  	}
    
    public void deleteProject() {
    	WebUI.clickElement(dotseditproject);
    	WebUI.sleep(1);
    	WebUI.clickElement(editproject);
    	WebUI.sleep(1);
    	WebUI.clickElement(deleteprojectbtn);
    	WebUI.sleep(1);
    	WebUI.clickElement(deleteconfirmationbtn);
    	WebUI.sleep(2);
    }
    
    

}
