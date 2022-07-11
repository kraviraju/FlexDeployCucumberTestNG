package flexdeploy.pageobjects;

import org.openqa.selenium.By;
import org.testng.Assert;

import core.constants.FrameworkConstants;
import core.utils.ObjectUtils;
import core.utils.WebUI;
import flexdeploy.Clients.ClientPage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class DashboardPage {
	
	Scenario scenario;
	@Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    public DashboardPage() {
    }

 // ****************************************** Locators ************************************************
 	
  	private By dropdown = By.xpath("//*[@id=\"pt1:bBarFDC:pt_m2\"]/div/table/tbody/tr/td[3]/div");
  	private By logout = By.xpath("//*[@id=\"pt1:bBarFDC:pt_cmi8\"]/td[2]");
  	private By logo = By.xpath("//*[@id=\"pt1:bBarFDC:logoLink::icon\"]");
  	private By homeTab = By.cssSelector("#pt1\\:bBarFDC\\:b1");
  	private By dashboardTab = By.cssSelector("#pt1\\:bBarFDC\\:b2");
  	public By projectsTab = By.cssSelector("#pt1\\:bBarFDC\\:b7");
  	private By workflowsTab = By.cssSelector("#pt1\\:bBarFDC\\:b3");
  	private By errele = By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div/form/div[2]/div/div/div");
  	
  	private By welcomewinodwxbtn = By.cssSelector("#app > div.v-dialog__content.v-dialog__content--active > div > form > div > div.v-card__title.d-flex.align-center > button > span > i");
  	
  	

  	
 // ****************************************** Methods ************************************************	
 	
  	public void verifydashboard() {
  		WebUI.sleep(2);
        WebUI.waitForPageLoaded();
        WebUI.waitForJQueryLoaded();
        
        
 		String actualPagetitle=WebUI.getPageTitle();
        String expectedPagetitle="FlexDeploy - Home";
        
        
        if (WebUI.findWebElements(logo).size()!=0){
        	Assert.assertEquals(actualPagetitle, expectedPagetitle);
        	FrameworkConstants.LOGINRESULT=true;
        	WebUI.reportTestStep(scenario,"Login success!");
        }else {
        	WebUI.reportTestStep(scenario,"Login failed!");
        	FrameworkConstants.errMsg = WebUI.findWebElement(errele).getText();
        	FrameworkConstants.LOGINRESULT=false;
        	Assert.fail(FrameworkConstants.errMsg);
        	Assert.assertEquals(actualPagetitle, expectedPagetitle);
        	WebUI.closeBrowser();
        }
        
        
        
        Assert.assertEquals(WebUI.verifyElementExists(homeTab), true,"Issue with homeTab element !");
        Assert.assertEquals(WebUI.verifyElementExists(dashboardTab), true,"Issue with dashboardTab element !");
        Assert.assertEquals(WebUI.verifyElementExists(projectsTab), true,"Issue with projectsTab element !");
        Assert.assertEquals(WebUI.verifyElementExists(workflowsTab), true,"Issue with workflowsTab element !");
        WebUI.reportTestStep(scenario,"Login success  and dashbaord verified !");
  	}
  	
  	
  	public void logout() {
  		WebUI.clickElement(dropdown);
  		WebUI.sleep(1);
  		WebUI.clickElement(logout);
  		
  	}
  	
  	public void gotoTab(By tab) {
  		WebUI.clickElement(tab);
  		WebUI.sleep(2);
  		
  		if (WebUI.findWebElements(welcomewinodwxbtn).size()!=0){
  			WebUI.clickElement(welcomewinodwxbtn);
  		}
  		
  	}
  	
  	
  	
  	
}
