package com.selenium;

import com.selenium.pages.InventoryPage;
import com.selenium.pages.LoginPage;
import com.selenium.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.createChromeDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            
            driver.quit();
        }
    }

    @Test
    public void successfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        InventoryPage inventory = loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(inventory.isLoaded(), "Inventory page should be loaded after successful login");
    }
}
