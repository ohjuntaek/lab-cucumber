package mycucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestB {

	@Given("test-b-given")
	public void testAGiven() {
		System.out.println("test-b-given");
	}

	@When("test-b-when")
	public void testAWhen() {
		System.out.println("test-b-when");
	}

	@Then("test-b-then")
	public void testAThen() {
		System.out.println("test-b-then");
	}
}
