@regression
Feature: Project Creation 
    Description: This feature will test project creation functionality of various scenarios

	  @standardproject
    Scenario: Create blank project with standard clasification
    	Given user login flexdeploy application successfully 
    	When user create new "standard" blank project
    	And verify new project creation
    	Then delete newly created project
    
    @containerproject
    Scenario: Create blank project with container clasification
    	Given user login flexdeploy application successfully 
    	When user create new "container" blank project
    	And verify new project creation
    	Then delete newly created project

       