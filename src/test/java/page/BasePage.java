package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 15);
	}

	public void waitVisibility(By elementBy) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
	}

	public void click(By elementBy) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).click();
	}

	public void isElementDisplayed(By elementBy) {
		waitVisibility(elementBy);
		assertTrue(driver.findElement(elementBy).isDisplayed());
	}

	public void isElementNotDisplayed(By elementBy) {
		Assert.assertFalse(driver.findElements(elementBy).size() > 0);
	}
}
