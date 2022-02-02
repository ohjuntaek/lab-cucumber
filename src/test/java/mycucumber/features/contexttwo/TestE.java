package mycucumber.features.contexttwo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestE {

	@Given("test-e-given")
	public void testEGiven() {
		System.out.println("test-e-given");
	}

	@When("test-e-when")
	public void testEWhen() {
		System.out.println("test-e-when");
	}

	@Then("test-e-then")
	public void testEThen() {
		System.out.println("test-e-then");
	}
}
