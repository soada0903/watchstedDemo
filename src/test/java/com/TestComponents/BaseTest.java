package com.TestComponents;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;


public class BaseTest {


    public static WebDriver driver;


    @BeforeMethod
    public void launchApplication() throws IOException {
        Properties prop = new Properties();
        FileInputStream fil = new FileInputStream(System.getProperty("user.dir")
                + "\\src\\test\\java\\com\\GlobalDataPackage\\GlobalData.properties");
        prop.load(fil);
        driver = new ChromeDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    }

    public void takeScreenShot() throws IOException {
        /*File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\prints\\screenshot.png"));*/

        //Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\prints\\screenshot.png");
        Shutterbug.shootPage(driver, Capture.FULL, true).save("src\\test\\java\\com\\Screenshots\\screenshot.png");

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
