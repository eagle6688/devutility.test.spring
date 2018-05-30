package devutility.test.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBeanNewConfig extends TestBeanConfig {
	@Override
	@Bean("testBean")
	public TestBean getTestBean() {
		TestBean bean = new TestBean();
		bean.setId(2);
		return bean;
	}
}