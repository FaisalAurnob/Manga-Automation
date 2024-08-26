package test.automation.myalice.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.automation.myalice.base.Base;
import test.automation.myalice.pages.LoginPage;

public class TestScenario01 extends Base { 
     LoginPage loginPage;

    @BeforeMethod
    public void setUpTest() {
        System.out.println("Starting...");
        initializeBrowserAndOpenApplicationURL("chrome"); 
        loginPage = new LoginPage(driver);
    }

    @Test(description = "Scenario: Verify that the login functionality works correctly.\n" +
            "Steps:\n" +
            "1. Open the application.\n" +
            "2. Verify that the login page is displayed.\n" +
            "3. Enter valid login credentials (e.g., testuser and password).\n" +
            "4. Click the 'Login' button.\n" +
            "5. Verify that the user is redirected to the manga search page.\n")
    public void Login() throws InterruptedException {
        
    }

    @AfterMethod
    public void tearDownTest() throws InterruptedException {
        loginPage.FirstExecution(); // Make sure this method is correctly defined in LoginPage
        if (driver != null) {
            driver.quit();
        }
    }
}
