package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;

public class InventoryPage {
    private final WebDriver driver;

    private final By inventoryContainer = By.id("inventory_container");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoaded() {
        try {
            return driver.findElement(inventoryContainer).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
