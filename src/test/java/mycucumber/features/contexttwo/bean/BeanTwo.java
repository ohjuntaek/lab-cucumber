package mycucumber.features.contexttwo.bean;

import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class BeanTwo {

	public void hi() {
		System.out.println("BeanTwo : hi");
	}
}
