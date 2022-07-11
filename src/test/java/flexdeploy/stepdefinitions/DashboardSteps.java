package flexdeploy.stepdefinitions;

import core.constants.FrameworkConstants;
import core.driver.DriverManager;
import core.utils.WebUI;
import flexdeploy.pageobjects.DashboardPage;
import flexdeploy.pageobjects.LoginPage;
import flexdeploy.pageobjects.ProjectPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DashboardSteps {
	
	DashboardPage DashboardPage = new DashboardPage();
	
	@Then("The user redirect to Dashboard page")
    public void theUserRedirectToDashboardPage() {
    	DashboardPage.verifydashboard();
    }
    
    @And("Logout")
    public void Logout() {
    	DashboardPage.logout();
    }

	
	


}
