# Automation Framework Cucumber TestNG and Selenium Java 

**SOME FEATURES IN FRAMEWORK**

1. Run the parallel test case
2. Read Object web element from Properties file
3. Extent Report
4. Allure Report
5. Send Mail after the run test (Report information and HTML file attachment)
6. Write Log to file
7. Record video and Screenshot test case for failed
8. Read data test from Excel file (xlsx, csv, json,...) with class define fields (param: Client client)
9. Base function in the package: utils, helpers
10. Read data test from Json file
11. Main keyword is WebUI
12. Sample test feature

## **SYSTEM REQUIREMENTS**

- **JDK All version**
- Chrome Browser, Edge Browser
- Setup **Allure**:
  https://mvnrepository.com/artifact/io.qameta.allure/allure-java-commons
  or
  Download jar and setting Variable Environment as Java JDK



## **HOW TO USE**

**1. Run the test case**

  - (**mvn clean test**)
  - (**Double click [FlexDeployCucumberTestNG/RunTests.bat]**)




**2. Extent Report**

  - (** [FlexDeployCucumberTestNG/ExtentReports]**)

**3. Cucumber Report**

  - (** [FlexDeployCucumberTestNG/CucumberReports]**)


**4. Read data test from Excel file**

- Create function with annotaion **DataSupplier** on **_src/main/java/core/utils/**
- Call the name of **DataSupplier** above in the test cases as DataProvider of TestNG
- Read excel with Map and Hashtable

**5. Base function in the package**

- **_src/main/java/core/utils_**
- **_src/main/java/core/helpers_**

**6. Read data test from JSON file**

- **JsonUtils** class select the json file path and call **"get"** method with **key**

**7. Main keyword is WebUI**

- WebUI class is main keyword in Framework. It contains common functions
- How to use: WebUI.function_name
- Example: WebUI.setWindowSize(1024, 768), WebUI.screenshotElement(By by, String elementName),...


**8. Important files**

- src.test.java.flexdeploy.runners.TestRunner
- src.test.java.flexdeploy.stepdefinitions.Hooks


# Copyright 2022 FlexDeploy


