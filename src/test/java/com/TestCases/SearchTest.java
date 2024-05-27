package com.TestCases;

import com.PageObjectPackage.SearchPage;
import com.PageObjectPackage.LandingPage;
import com.TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchTest extends BaseTest {


    @Test
    public void getSearch() throws IOException {
        LandingPage landingPage = new LandingPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertEquals(driver.getTitle(), "Watchsted - Watchsted - Maps");
        landingPage.clickSearchLink();
        Assert.assertEquals(searchPage.getKeywordSearchtext(), "KEYWORD SEARCH");
        searchPage.enterKeywordInSearchBox("Liverpool");
        searchPage.clickSearchBtn();
        Assert.assertEquals(searchPage.getSearchResultsHeadingText(), "10 most relevant");
        takeScreenShot();

    }

    @Test
    public void getInvalidSearch() throws IOException {
        LandingPage landingPage = new LandingPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        landingPage.clickSearchLink();
        searchPage.enterKeywordInSearchBox("liver-pool");
        searchPage.clickSearchBtn();
        Assert.assertEquals(searchPage.getNoSearchResult(), "recent inspections");


    }
}
