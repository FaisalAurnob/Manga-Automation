package test.automation.myalice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.automation.myalice.utils.Utilities;

public class MangaDetails extends Utilities {

	public MangaDetails(WebDriver driver) {
		super(driver);
	}
	
	public By MangaSearchPage = By.xpath("//div[@class='w-full flex justify-center items-center mb-6']");
	public By AttackOnTitanTitle = By.xpath("//h3[@id='manga-name']");
	public By SearchField = By.xpath("//input[@id='manga-search']");
	public By SearchButton = By.xpath("//button[@class='bg-green-500 text-white py-2 px-4 rounded mr-2']");
	public By Details = By.xpath("//span[@class='text-blue-500 cursor-pointer']");
	public By AttackOnTitansummary = By.xpath("//p[@class='text-gray-600 mb-4']");
	public By AttackOnTitanImage = By.xpath("//div[@class='bg-white p-6 rounded-lg shadow-lg w-96']//img[@alt='Attack on Titan']");

	public void ThirdExecution() throws InterruptedException {
		
		sendKeys(SearchField, "Attack on Titan");
		click(SearchButton);
		Thread.sleep(2000);
		click(Details);
		Thread.sleep(2000);
		verifyTextAndTakeScreenshot(AttackOnTitanTitle, "Attack on Titan", "AttackonTitan");
		verifyTextAndTakeScreenshot(AttackOnTitansummary, "Humanity fights for survival against giant humanoid Titans that have brought civilization to the brink of extinction.", "AttackOnTitansummary");

	}
}
