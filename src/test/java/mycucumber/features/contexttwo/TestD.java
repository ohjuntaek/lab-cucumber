package mycucumber.features.contexttwo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lab.junatek.labcucumber.MyBean;
import mycucumber.features.contextone.bean.BeanOne;
import mycucumber.features.contexttwo.bean.BeanTwo;
import org.springframework.beans.factory.annotation.Autowired;

public class TestD {
	@Autowired MyBean myBean;
	@Autowired BeanTwo beanTwo;
//	@Autowired BeanOne beanOne; // 다른 컨텍스트 이므로 안됨

	@Given("test-d-given")
	public void testDGiven() {
		System.out.println("test-d-given");
	}

	@When("test-d-when")
	public void testDWhen() {
		System.out.println("test-d-when");
		myBean.hi();
		beanTwo.hi();
//		beanOne.hi(); // 다른 컨텍스트 이므로 안됨
	}

	@Then("test-d-then")
	public void testDThen() {
		System.out.println("test-d-then");
	}
}
