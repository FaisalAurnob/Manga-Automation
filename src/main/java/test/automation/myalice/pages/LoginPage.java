package test.automation.myalice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.automation.myalice.utils.Utilities;

public class LoginPage extends Utilities {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public By Username = By.xpath("//input[@id='username']");
    public By Password = By.xpath("//input[@id='password']");
    public By LoginButton = By.xpath("//button[@id='login-btn']");
    public By Home = By.xpath("//div[@class='flex flex-col items-center p-6 bg-gray-100 min-h-screen']");

    public void FirstExecution() throws InterruptedException {
 
        sendKeys(Username, "testuser");  
        sendKeys(Password, "password");  
        Thread.sleep(2000);
        click(LoginButton);  

    }
}
