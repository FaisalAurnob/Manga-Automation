package test.automation.myalice.utils;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.qameta.allure.Allure;

public class Utilities {

    public WebDriver driver;

    public Utilities(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public void sendKeys(By locator, String text) {
        findElement(locator).sendKeys(text);
    }

    public WebElement waitForElement(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void takeScreenshot(String name) {
        Allure.addAttachment(name,
                new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    public void clearField(By locator) {
        findElement(locator).clear();
    }

    public void verifyTextAndTakeScreenshot(By locator, String expectedText, String screenshotName) {
        WebElement element = findElement(locator);
        String actualText = element.getText();

        System.out.println("Expected Text: " + expectedText);
        System.out.println("Actual Text: " + actualText);
        
        if (actualText.equals(expectedText)) {
            System.out.println("Content matched.");
            takeScreenshot(screenshotName);
        } else {
            System.out.println("Content did not match.");
        }
    }
}
