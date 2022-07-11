package flexdeploy.pageobjects;

import org.openqa.selenium.By;
import org.testng.Assert;

import core.constants.FrameworkConstants;
import core.driver.DriverManager;
import core.utils.ObjectUtils;
import core.utils.WebUI;
import flexdeploy.Clients.ClientPage;
import io.cucumber.java.Scenario;

public class LoginPage {

    public LoginPage() {
    }

 // ****************************************** Locators ************************************************
 	private By usernameTxtBx = By.xpath("//input[@id='input-25']");
 	private By passwordTxtBx = By.xpath("//input[@id='input-28']");
 	private By loginBtn = By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div/form/div[2]/button/span");
  	
  	
 		
 			
 			
 			
 			
 // ****************************************** Methods ************************************************	
 	
 	public void enterusername(Scenario scenario,String username) {
 		WebUI.sleep(2);
 		WebUI.setText(usernameTxtBx, username);
 		WebUI.reportTestStep(scenario,"User entered username!");
 	}
 	public void enterpassword(Scenario scenario,String password) {
 		WebUI.sleep(2);
 		WebUI.setText(passwordTxtBx, password);
 		WebUI.reportTestStep(scenario,"User entered password!");
 	}
 	public void clicklogin(Scenario scenario) {
 		WebUI.clickElement(loginBtn);
 		WebUI.reportTestStep(scenario,"User clicked login button!");
 		WebUI.sleep(2);

        
 	}
 	
 	public void launchApplication(Scenario scenario) {
        WebUI.sleep(2);
        WebUI.getToUrl(FrameworkConstants.BASE_URL);
        WebUI.reportTestStep(scenario,"Application launched with URL: " + FrameworkConstants.BASE_URL);
 	}
 	
 	public void login(Scenario scenario,String username, String password) {
 		enterusername(scenario,username);
 		enterpassword(scenario,password);
 		clicklogin(scenario);
 		
     }
}
