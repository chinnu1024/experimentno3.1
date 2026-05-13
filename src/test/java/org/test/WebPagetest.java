package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebPagetest {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");

        driver = new ChromeDriver(options);

        driver.get("https://chinnu1024.github.io/experimentno3.1/");
    }

    @Test
    public void titleValidationTest() {

        String actualTitle = driver.getTitle();

        String expectedTitle = "My Webpage";

        System.out.println(actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void closeBrowser() {

        if(driver != null) {
            driver.quit();
        }
    }
}