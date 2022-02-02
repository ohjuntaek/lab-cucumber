package mycucumber.features.contextone.bean;

import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class BeanOne {

	public void hi() {
		System.out.println("BeanOne : hi");
	}
}
