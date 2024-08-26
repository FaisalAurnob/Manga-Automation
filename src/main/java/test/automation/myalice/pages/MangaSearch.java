package test.automation.myalice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.automation.myalice.utils.Utilities;

public class MangaSearch extends Utilities {

	public MangaSearch(WebDriver driver) {
		super(driver);
	}
	
	public By MangaSearchPage = By.xpath("//div[@class='flex flex-col items-center p-6 bg-gray-100 min-h-screen']");
	public By SearchField = By.xpath("//input[@id='manga-search']");
	public By SearchButton = By.xpath("//button[@class='bg-green-500 text-white py-2 px-4 rounded mr-2']");
	public By Naruto = By.xpath("//h3[@id='manga-name']");
	public By OnePiece = By.xpath("//h3[@id='manga-name']");
	public By SevenDeadlySins = By.xpath("//p[@class='text-red-500']");

	public void SecondExecution() throws InterruptedException {

		verifyTextAndTakeScreenshot(MangaSearchPage, "Manga You Should Read", "Search Page");
		Thread.sleep(2000);
		sendKeys(SearchField, "Naruto");
		click(SearchButton);
		Thread.sleep(2000);
		verifyTextAndTakeScreenshot(Naruto, "Naruto","Naruto");
		clearField(SearchField);
		sendKeys(SearchField, "One Piece");
		click(SearchButton);
		Thread.sleep(2000);
		verifyTextAndTakeScreenshot(OnePiece, "One Piece","OnePiece");
		clearField(SearchField);
		sendKeys(SearchField, "Seven Deadly Sins");
		click(SearchButton);
		Thread.sleep(2000);
		verifyTextAndTakeScreenshot(SevenDeadlySins, "No manga found","No manga found");
		clearField(SearchField);
		sendKeys(SearchField, "Test");
		click(SearchButton);
		Thread.sleep(2000);
		verifyTextAndTakeScreenshot(SevenDeadlySins, "No manga found","No manga found");
		clearField(SearchField);
		Thread.sleep(2000);
	}
}
