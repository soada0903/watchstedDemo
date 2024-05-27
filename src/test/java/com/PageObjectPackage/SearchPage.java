package com.PageObjectPackage;

import com.PageComponents.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchPage extends BasePage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "searchTerm")
    private WebElement searchLink;

    @FindBy(css = ".center.mapTitle")
    private WebElement keywordSearch;
    @FindBy(id = "searchBtn")
    private WebElement searchBtn;
    @FindBy(xpath = "//strong[normalize-space()='10 most relevant']")
    private WebElement searchResults;
    @FindBy(css = "p[id='error'] strong")
    private WebElement noResult;
    @FindBy(id = "loading")
    private WebElement spinner;


    public String getKeywordSearchtext() {
        return keywordSearch.getText();
    }

    public void enterKeywordInSearchBox(String keywordToSearch) {
        searchLink.sendKeys(keywordToSearch);

    }

    public void clickSearchBtn() {
        searchBtn.click();
        waitForInVisibilityOfEle(spinner);

    }

    public String getSearchResultsHeadingText() {

        return searchResults.getText();
    }


    public String getNoSearchResult() {
        return noResult.getText();

    }


}
