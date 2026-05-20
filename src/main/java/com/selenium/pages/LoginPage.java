package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;
    private final String url = "https://www.saucedemo.com/";

    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage open() {
        driver.get(url);
        return this;
    }

    public InventoryPage login(String username, String password) {
        WebElement user = driver.findElement(usernameInput);
        WebElement pass = driver.findElement(passwordInput);
        user.clear();
        user.sendKeys(username);
        pass.clear();
        pass.sendKeys(password);
        driver.findElement(loginButton).click();
        return new InventoryPage(driver);
    }
}
