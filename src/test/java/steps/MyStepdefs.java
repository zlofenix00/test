package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.TestBase;

public class MyStepdefs extends TestBase {

	@Before
	public void initialization(){
		start();
	}

	@After
	public void teardown(){
		finish();
	}

	@Given("I go to shop page")
	public void iGoToShopPage() {
		main.goTo();
	}

	@When("I select {string} first list of filters and I select {string} second list of filters")
	public void iSelectFirstListOfFiltersAndISelectSecondListOfFilters(String firstFilter, String secondFilter) throws InterruptedException {
		main.choseFilter(firstFilter);
		main.choseFilter(secondFilter);
	}

	@Then("I check and (see|not see) this filters on the display$")
	public void iCheckAndSeeThisFiltersOnTheDisplay(String visible) {
		if(visible.equals("see")){
			taskOne.isVisibleFilter();
		} else {
			taskOne.isNotVisibleFilter();
		}
	}
}
