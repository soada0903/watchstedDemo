# UI Automation Task, aim to Test Search functionality
## Mini Hybride framwork using Selenium/Java, TestNG with Cucumber.

It is a maven project using Page Object Medel/Page Factory. Inside the "src" folder, there is a "Test" folder with various subfolders.
Cucumber folder contains the "watchstedSEARCH.feature" file, which has all the search steps, and a "TestNGRunner" file to run the feature file. 
StepDefinitions folder includes "SearchSteps," and "watchstedSEARCH.feature" for implementing code. 
GlobalDataPackage folder has the "GlobalData.properties" file, which is used by "BaseTest" to launch the browser. 
PageComponents folder has "BasePage" for common reusable methods shared across pages. 
PageObjectPackage folder contains "LandingPage" and "SearchPage" classes with locators and web elements for different functions. 
Screenshots folder stores all screenshots. 
TestCases folder currently holds only "SearchTestRunner" for execution of TestNg framework.
TestComponents folder contains "BaseTest" for reusable methods shared with test case classes.


# Improvement
Because this is a little task i understand that a proper framework might not be required, but things that could have been done better for this type of framework are; adding data driven machinism where we can drive datas enxternally, e.g jason or spreedsheet. Reporting/logfiles, Custom utilities/helper method etc. In addition Jenkins file can also be included for CICD pipeline. 

For this task, a proper framework might not be necessary, but things that could have been done better for this type of framework are: a data-driven mechanism using JSON or spreadsheets to, adding reporting and log files, creating custom utility/helper methods etc. Additionally, including a Jenkins file for a CI/CD pipeline would enhance automation and integration.


