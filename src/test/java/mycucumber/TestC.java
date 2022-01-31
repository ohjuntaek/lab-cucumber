package mycucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestC {

	@Given("test-c-given")
	public void testAGiven() {
		System.out.println("test-c-given");
	}

	@When("test-c-when")
	public void testAWhen() {
		System.out.println("test-c-when");
	}

	@Then("test-c-then")
	public void testAThen() {
		System.out.println("test-c-then");
	}
}
