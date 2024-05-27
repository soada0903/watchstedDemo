package com.Cucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/com/Cucumber",
        glue = "com.StepDefinitions",
        tags = "@watchsted231",
        monochrome = true, plugin = {"html:target/cucumber.html"})

public class TestNGRunnerTest extends AbstractTestNGCucumberTests {


}
