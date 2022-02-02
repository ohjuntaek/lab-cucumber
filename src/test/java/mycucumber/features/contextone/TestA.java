package mycucumber.features.contextone;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lab.junatek.labcucumber.MyBean;
import mycucumber.features.contextone.bean.BeanOne;
import org.springframework.beans.factory.annotation.Autowired;

public class TestA {
	@Autowired private BeanOne beanOne;
	@Autowired private MyBean myBean;

	@Given("test_a_given")
	public void test_a_given() {
		System.out.println("test_a_given");
		beanOne.hi();
		myBean.hi();
	}

	@When("test_a_when")
	public void test_a_when() {
		System.out.println("test_a_when");
	}

	@Then("test_a_then")
	public void test_a_then() {
		System.out.println("test_a_then");
	}
}
