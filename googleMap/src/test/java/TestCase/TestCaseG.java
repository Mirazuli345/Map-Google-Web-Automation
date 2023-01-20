package TestCase;

import org.testng.annotations.Test;
import pages.SearchingPlaces;

import utilities.DriverSetupG;

public class TestCaseG extends DriverSetupG {
	
	SearchingPlaces searchingPlaces = new SearchingPlaces();
	@Test
	public void testCase() throws InterruptedException {
		getDriver().get("https://www.google.com/maps/");
		
		searchingPlaces.inputSearch("Hazrat Shahjalal International Airport");
		searchingPlaces.startPoint("Gazipur");
		searchingPlaces.restaurants();
		
	
		
		Thread.sleep(4000);
	}
	
	

}
