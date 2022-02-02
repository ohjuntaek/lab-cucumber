package mycucumber.features.contextone.bean;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class ConfigOne {

	@Bean
	public BeanOne beanOne() {
		return new BeanOne();
	}
}
