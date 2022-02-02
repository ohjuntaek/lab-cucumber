package mycucumber.features.contexttwo.bean;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class ConfigTwo {
	@Bean
	public BeanTwo beanTwo() {
		return new BeanTwo();
	}
}
