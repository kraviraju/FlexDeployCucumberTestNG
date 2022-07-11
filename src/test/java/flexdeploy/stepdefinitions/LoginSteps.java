package flexdeploy.stepdefinitions;

import core.constants.FrameworkConstants;
import core.driver.DriverManager;
import core.utils.WebUI;
import flexdeploy.pageobjects.DashboardPage;
import flexdeploy.pageobjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.model.Report;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class LoginSteps {
	
	Scenario scenario;
	@Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }
	
	
	
	LoginPage LoginPage = new LoginPage();
	DashboardPage DashboardPage = new DashboardPage();
	
	@Given("user login flexdeploy application successfully")
    public void user_login_flexdeploy_application_successfully() {
		LoginPage.launchApplication(scenario);
		LoginPage.login(scenario,FrameworkConstants.USERNAME, FrameworkConstants.PASSWORD);
		DashboardPage.verifydashboard();
    }

    @Given("user navigate to url")
    public void userNavigateToUrl() {
    	LoginPage.launchApplication(scenario);
    }

    @When("user enter username {string} and password {string}")
    public void userEnterUsernameAndPassword(String username, String password) {
    	LoginPage.enterusername(scenario,username);
    	LoginPage.enterpassword(scenario,password);
     }

    @And("click login button")
    public void clickLoginButton() {
    	LoginPage.clicklogin(scenario);
    }

    
}

