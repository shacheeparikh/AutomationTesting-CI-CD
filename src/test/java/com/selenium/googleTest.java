package com.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class googleTest {

    @Test
    public void searchNameAndClickFirstResult() {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.google.com");

            String searchTerm = "Shachee"; // Replace with your actual name
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            wait.until(ExpectedConditions.elementToBeClickable(By.name("q")))
                    .sendKeys(searchTerm + Keys.ENTER);

            By firstResultLocator = By.cssSelector("#search a h3");
            wait.until(ExpectedConditions.elementToBeClickable(firstResultLocator)).click();

            wait.until(webDriver -> !webDriver.getTitle().toLowerCase().contains("google"));
            System.out.println("Navigated to first search result: " +
                    driver.getCurrentUrl());
        } finally {
            driver.quit();
        }
    }
}
