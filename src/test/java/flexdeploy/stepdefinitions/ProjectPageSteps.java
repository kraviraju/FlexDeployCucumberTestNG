package flexdeploy.stepdefinitions;

import core.constants.FrameworkConstants;
import core.driver.DriverManager;
import core.report.ExtentReportManager;
import core.utils.WebUI;
import flexdeploy.pageobjects.DashboardPage;
import flexdeploy.pageobjects.LoginPage;
import flexdeploy.pageobjects.ProjectPage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProjectPageSteps {
	LoginPage LoginPage = new LoginPage();
	DashboardPage DashboardPage = new DashboardPage();
	ProjectPage ProjectPage = new ProjectPage();
	
	Scenario scenario;
	@Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

	@When("user create new {string} blank project")
    public void user_create_new_blank_project(String str) {
		DashboardPage.gotoTab(DashboardPage.projectsTab);
		ProjectPage.createBlankProject(str); 
	}
	
	@And("verify new project creation")
    public void verify_new_project_creation() {
		if (WebUI.getTextElement(ProjectPage.newprojectnametxt).contains(FrameworkConstants.NEWPROJECTNAME)) {
			WebUI.reportTestStep(scenario,"Project ["+FrameworkConstants.NEWPROJECTNAME+"] Creation success !");
    	}else {
    		WebUI.reportTestStep(scenario,"Project ["+FrameworkConstants.NEWPROJECTNAME+"] Creation failed !");
    	}
	}

	@Then("delete newly created project")
	public void delete_newly_created_project() {
		ProjectPage.deleteProject();
	}
}
