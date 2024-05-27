package com.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }


    //generic wait for InVisibilityOfElement
    public void waitForInVisibilityOfEle(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(ele));
    }

    //generic wait for elementToBeClickable
    public void waitForElementToBeClickable(WebElement ele2) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(ele2));

    }


}
