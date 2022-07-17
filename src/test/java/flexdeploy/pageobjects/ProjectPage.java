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
    
  	private By projectnameTxtbx = By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div > div.v-card__text > div > form > span:nth-child(1) > div > div > div.v-input__slot > div");
  	private By folderdropdown = By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div > div.v-card__text > div > form > span:nth-child(2) > div > div > div.v-input__slot > div.v-select__slot");
  	
  	
  	private By standardclassification      = By.xpath("//div[contains(@title, 'The standard FlexDeploy project. Builds and deploys project sources as a single artifact.')]");
  	private By packagebasedclassification      = By.xpath("//div[contains(@title, 'Deploy individual files or selections of files (packages) from project sources.')]");
  	private By containerclassification      = By.xpath("//div[contains(@title, 'A project representing a docker container.')]");
  	private By utilityclassification      = By.xpath("//div[contains(@title, 'Used for executing one off scripts. Doesn't follow build/deploy pattern.')]");
  	
  	private By savebutton = By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div > div.v-card__actions > div > div > div.d-flex.align-center.gap-4 > button > span > div");
  	
  	public By newprojectnametxt = By.cssSelector("#app > div > main > div > div > div.justify-start.align-start > div > div > div.d-flex.flex-column > div.d-flex.align-center.gap-4 > div > div:nth-child(1) > h4 > ul");
  	
  	public By dotseditproject = By.cssSelector("#app > div.v-application--wrap > main > div > div > div.justify-start.align-start > div > div > div.d-flex.align-center.flex-0-1.gap-2 > button.box.v-btn.v-btn--text.theme--light.v-size--default > span > i");
  	public By editproject = By.cssSelector("#app > div.v-menu__content.theme--light.menuable__content__active > div > a");
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
    	WebUI.sleep(5);
    	WebUI.waitForJQueryLoaded();
    	WebUI.waitForPageLoaded();
    	WebUI.setTextWithSwitch(projectnameTxtbx,FrameworkConstants.NEWPROJECTNAME);
    	WebUI.pressTAB();
    	WebUI.setTextWithSwitch(folderdropdown, "FlexDeploy / AutomationTestProjects");
    	WebUI.pressDOWNARROW();
    	WebUI.pressENTER();
    	WebUI.pressTAB();
    	
    	if (str.contains("standard")) { 
    		
    		//DriverManager.getDriver().findElement(standardclassification).click();
    		
    		WebUI.clickElement(standardclassification);
    		
    	}
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
