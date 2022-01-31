package mycucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestA {

	@Given("test-a-given")
	public void testAGiven() {
		System.out.println("test-a-given");
	}

	@When("test-a-when")
	public void testAWhen() {
		System.out.println("test-a-when");
	}

	@Then("test-a-then")
	public void testAThen() {
		System.out.println("test-a-then");
	}
}
