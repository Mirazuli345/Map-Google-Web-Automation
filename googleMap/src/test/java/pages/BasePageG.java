package pages;
import static utilities.DriverSetupG.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;;

public class BasePageG {
	
	public WebElement getElement(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void clickElement(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();;
	}
	
	
	
	public void sendKeys(By locator,String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void scroll(WebElement locator) {
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView();",locator);
		
	}
	
	

}
