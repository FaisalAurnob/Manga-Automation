package test.automation.myalice.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.automation.myalice.base.Base;
import test.automation.myalice.pages.LoginPage;
import test.automation.myalice.pages.MangaDetails;
import test.automation.myalice.pages.MangaSearch;

public class TestScenario03 extends Base {
	LoginPage loginPage3;
	MangaDetails mangaDetails;
    MangaSearch mangaSearch2;

    @BeforeMethod
    public void setUpTest() {
        initializeBrowserAndOpenApplicationURL("chrome"); 
        loginPage3 = new LoginPage(driver); 
        mangaSearch2 = new MangaSearch(driver);
        mangaDetails = new MangaDetails(driver); 
    }

    @Test(description = "Scenario: Verify that the manga details modal functions correctly.\n" +
            "Steps:\n" +
            "1. Ensure the user is on the manga search page.\n" +
            "2. Click the \"Details\" link on a manga card.\n" +
            "3. Verify that the modal appears and displays the correct manga information (image, name, summary).\n" +
            "4. Click the \"Close\" button on the modal.\n" +
            "5. Verify that the modal is closed and no longer visible.")
    public void Details() throws InterruptedException {
    
    }

    @AfterMethod
    public void tearDownTest() throws InterruptedException {
    	 if (loginPage3 != null) {
             loginPage3.FirstExecution();
         }
        if (mangaSearch2 != null) {
            mangaSearch2.SecondExecution();
        }
        if (mangaDetails != null) {
        	mangaDetails.ThirdExecution();
        }
        if (driver != null) {
            driver.quit();
        }
    }
}

