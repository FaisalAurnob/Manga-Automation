package test.automation.myalice.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.automation.myalice.base.Base;
import test.automation.myalice.pages.LoginPage;
import test.automation.myalice.pages.MangaSearch;

public class TestScenario02 extends Base {  
     LoginPage loginPage2;
     MangaSearch mangaSearch;

    @BeforeMethod
    public void setUpTest() {
        initializeBrowserAndOpenApplicationURL("chrome"); 
        loginPage2 = new LoginPage(driver); 
        mangaSearch = new MangaSearch(driver); 
    }

    @Test(description = "Scenario: Verify that searching for manga returns the correct results.\n" +
            "Steps:\n" +
            "1. Ensure the user is on the manga search page.\n" +
            "2. Enter the search term 'Naruto' into the search box.\n" +
            "3. Click the 'Search' button.\n" +
            "4. Verify that manga cards with the name 'Naruto' are displayed.\n" +
            "5. Enter the search term 'One Piece' into the search box.\n" +
            "6. Click the 'Search' button.\n" +
            "7. Verify that manga cards with the name 'One Piece' are displayed.\n" +
            "8. Enter the search term 'Seven Deadly Sins' into the search box.\n" +
            "9. Click the 'Search' button.\n" +
            "10. Verify that manga cards with the name 'Seven Deadly Sins' are displayed.\n" +
            "11. Enter a search term that returns no results (e.g., 'No manga found').\n" +
            "12. Click the 'Search' button.\n" +
            "13. Verify that a 'No manga found' message is displayed.\n")
    
    public void Search() throws InterruptedException {
        
    }

    @AfterMethod
    public void tearDownTest() throws InterruptedException {
        if (loginPage2 != null) {
            loginPage2.FirstExecution();
        }
        if (mangaSearch != null) {
            mangaSearch.SecondExecution();
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
