package pages;

import org.openqa.selenium.By;

public class SearchingPlaces extends BasePageG {
	
	By SEARCH = By.xpath("//input[@id='searchboxinput']");
	By CLICKBTN = By.xpath("//button[@id='searchbox-searchbutton']");
	By DIRECTION = By.xpath("//button[@jsaction='pane.placeActions.directions;keydown:pane.placeActions.directions']");
	By STARTPOINT = By.xpath("//body/div[@id='app-container']/div[@id='content-container']/div[@id='omnibox-container']/div[@id='omnibox']/div[@id='omnibox-directions']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
	By CLICKSEARCH = By.xpath("//body/div[@id='app-container']/div[@id='content-container']/div[@id='omnibox-container']/div[@id='omnibox']/div[@id='omnibox-directions']/div[1]/div[3]/div[1]/div[1]/div[2]/button[1]");
	By MENU = By.xpath("//button[@vet='10760']");
	By LANGUAGE = By.xpath("//button[@vet='19214']");
	By ENGLISH = By.xpath("//a[@ved='21147']");
	
	By RESTAURANT = By.xpath("//button[@aria-label='Restaurants']");
	By BREEZE = By.xpath("//a[@aria-label='Breeze Restaurant']");
	By RESTAURANTDIRECTION = By.xpath("//button[@aria-label='Directions to Breeze Restaurant']");
	By PLACE = By.xpath("//input[@placeholder='Choose starting point, or click on the map...']");
	By SEARCHBTN = By.xpath("//body/div[@id='app-container']/div[@id='content-container']/div[@id='omnibox-container']/div[@id='omnibox']/div[@id='omnibox-directions']/div[1]/div[3]/div[1]/div[1]/div[2]/button[1]");
	By DISTANCE = By.xpath("//div[@jstcache='208']");
	By TIME = By.xpath("//span[contains(text(),'27 min')]");
	By HOTELS = By.xpath("//button[@aria-label='Hotels']");
	By LEMERIDIANS = By.xpath("//div[@aria-label='Le Méridien Dhaka']");
	
	
	
	
	public void inputSearch(String text) {
		sendKeys(SEARCH, text);
		clickElement(CLICKBTN);
		clickElement(DIRECTION);
	}
	
	public void startPoint(String text) {
		sendKeys(STARTPOINT, text);
		clickElement(CLICKSEARCH);
		clickElement(MENU);
		clickElement(LANGUAGE);
		clickElement(ENGLISH);
		clickElement(RESTAURANT);
		
	}
	
	public void restaurants() {
		clickElement(BREEZE);
		clickElement(RESTAURANTDIRECTION);
		getElement(PLACE).clear();
		sendKeys(PLACE, "Uttara");
		clickElement(SEARCHBTN);
		clickElement(HOTELS);
			
		
	}
	
	
	
	

}
