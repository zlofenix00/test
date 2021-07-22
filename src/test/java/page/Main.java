package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class Main  extends BasePage {
	public String SITE_URL = "https://www.ecwid.ru/demo/search";

	public Main(WebDriver driver) {
		super(driver);
	}

	public Main goTo(){
		driver.get(SITE_URL);
		return this;
	}


	public Main choseFilter(String filterName) throws InterruptedException {
		click(By.xpath("//div[contains(text(),\"" + filterName + "\")]"));
		sleep(1000);
		return this;
	}
}
