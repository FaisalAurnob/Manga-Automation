# Manga web automation

This project aims to automate the testing of a web application using the Page Object Model (POM) pattern. The testing procedure will encompass various functionalities to ensure comprehensive coverage and validation of the app's key features. 

## Languages and Frameworks
The project uses the following:

1.[Java 21](https://openjdk.java.net/projects/jdk/21/)Java 21 as the programming language.

2.[Selenium WebDriver](https://www.selenium.dev/)r for browser automation.

3.[Maven](https://maven.apache.org/) as the build tool and dependency management system.

4.[TestNG](https://testng.org/doc/) as the testing framework.

5.[Eclipse IDE](https://www.eclipse.org/) for development and testing.-

6.[Allure Report](https://allurereport.org/) for test reporting



## Target/goals
following scenarios, which will be replicated

###Login Functionality
Scenario: Verify that the login functionality works correctly.
Steps:
Open the application.
Verify that the login page is displayed.
Enter valid login credentials (e.g., testuser and password).
Click the "Login" button.
Verify that the user is redirected to the manga search page.
Manga Search and Display

###Manga Search and Display
Scenario: Verify that searching for manga returns the correct results.
Steps:
Ensure the user is on the manga search page.
Enter the search term "Naruto" into the search box.
Click the "Search" button.
Verify that manga cards with the name "Naruto" are displayed.
Enter the search term "One Piece" into the search box.
Click the "Search" button.
Verify that manga cards with the name "One Piece" are displayed.
Enter the search term "Seven Deadly Sins" into the search box.
Click the "Search" button.
Verify that manga cards with the name "Seven Deadly Sins" are displayed.
Enter a search term that returns no results (e.g., "No manga found").
Click the "Search" button.
Verify that a "No manga found" message is displayed.
Manga Details Modal

###Manga Details Modal
Scenario: Verify that the modal displays the correct manga details.
Steps:
Ensure the user is on the manga search page.
Click the "Details" link on a manga card.
Verify that the modal appears and displays the correct manga information (image, name, summary).
Click the "Close" button on the modal.
Verify that the modal is closed and no longer visible."

## Video
https://drive.google.com/file/d/1eU2iULt7KGwTmOvW84bv0BvW3l9-O-R2/view?usp=sharing

