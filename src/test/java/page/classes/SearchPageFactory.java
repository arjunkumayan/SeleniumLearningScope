package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	
	WebDriver driver;
	
	@FindBy(id="header-history")
	WebElement headerHistory;
	
	@FindBy(id=("tab-flight-tab-hp"))
	WebElement flightsTab;
	
	@FindBy(id=("tab-flight-tab-hp"))
	WebElement originCity;
	
	@FindBy(id=("tab-flight-tab-hp"))
	WebElement destinationCity;
	
	@FindBy(id=("tab-flight-tab-hp"))
	WebElement departureDate;
	
	@FindBy(id=("tab-flight-tab-hp"))
	WebElement returnDate;
	
	@FindBy(id="flight-type-roundtrip-label-hp-flight")
	WebElement roundTrip;
	
	@FindBy(id="flight-type-multi-dest-label-hp-flight")
	WebElement multiDestination;
	
	public SearchPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickFlightsTab() {
		headerHistory.click();
		flightsTab.click();
	}
	
	public void clickRoundTrip() {
		roundTrip.click();
	}
	
	public void multipleDestination() {
		multiDestination.click();
	}

	
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String origin) {
		destinationCity.sendKeys(origin);
	}
	
	
	
}
