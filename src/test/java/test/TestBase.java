package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.Main;
import page.TaskOne;

import java.util.concurrent.TimeUnit;

public class TestBase {
	WebDriver driver;
	public Main main;
	public TaskOne taskOne;


	public void start(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		main = PageFactory.initElements(driver, Main.class);
		taskOne = PageFactory.initElements(driver, TaskOne.class);
	}

	public void finish(){
		driver.quit();
	}
}
