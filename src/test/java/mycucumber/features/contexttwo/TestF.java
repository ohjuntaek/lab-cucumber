package mycucumber.features.contexttwo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestF {

	@Given("test-f-given")
	public void testFGiven() {
		System.out.println("test-f-given");
	}

	@When("test-f-when")
	public void testFWhen() {
		System.out.println("test-f-when");
	}

	@Then("test-f-then")
	public void testFThen() {
		System.out.println("test-f-then");
	}
}
