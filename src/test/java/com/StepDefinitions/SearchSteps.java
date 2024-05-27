package com.StepDefinitions;

import com.PageObjectPackage.LandingPage;
import com.PageObjectPackage.SearchPage;
import com.TestComponents.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class SearchSteps extends BaseTest {
    SearchPage searchPage;


    @Given("I navigate to landing page")
    public void iNavigateToLandingPageAs() throws IOException {
        launchApplication();

    }

    @And("I can see page title as {string}")
    public void iCanPageTitleAs(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }

    @And("I click SEARCH link")
    public void clickSEARCHLink() {
        LandingPage landingpage = new LandingPage(driver);
        landingpage.clickSearchLink();
    }

    @And("I can see {string}")
    public void iCanSee(String keyWordText) {
        SearchPage searchPage1 = new SearchPage(driver);
        Assert.assertEquals(searchPage1.getKeywordSearchtext(), keyWordText);
    }

    @When("I enter Liverpool in the search field")
    public void enterLiverpoolInTheSearchField() {
        searchPage = new SearchPage(driver);
        searchPage.enterKeywordInSearchBox("Liverpool");
    }

    @And("click SEARCH button")
    public void iClickSEARCHButton() {
        searchPage = new SearchPage(driver);
        searchPage.clickSearchBtn();
    }

    @Then("I should see and print the results")
    public void iShouldBeAbleToPrintTheResults() throws IOException {
        Assert.assertEquals(searchPage.getSearchResultsHeadingText(), "10 most relevant");
        takeScreenShot();

    }

    @When("I search with invalid city name {string}")
    public void iSearchWithInvalidCityName(String invalidKeyword) {
        searchPage = new SearchPage(driver);
        searchPage.enterKeywordInSearchBox(invalidKeyword);
    }

    @Then("I should not see search result {string}")
    public void iShouldNotSeeSearchResult(String notMatch) {
        searchPage = new SearchPage(driver);
        Assert.assertEquals(searchPage.getNoSearchResult(), notMatch);
    }


}
