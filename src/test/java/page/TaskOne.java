package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskOne extends BasePage {
	public TaskOne(WebDriver driver) {
		super(driver);
	}


	public TaskOne isVisibleFilter() {
		isElementDisplayed(By.xpath("//span[contains(text(),\"Men's Apparel\")]"));
		isElementDisplayed(By.xpath("//span[contains(text(),'30')]"));
		return this;
	}

	public TaskOne isNotVisibleFilter() {
		isElementNotDisplayed(By.xpath("//span[contains(text(),\"Men's Apparel\")]"));
		isElementNotDisplayed(By.xpath("//span[contains(text(),'30')]\""));
		return this;
	}
}
