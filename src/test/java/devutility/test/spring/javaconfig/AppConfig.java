package devutility.test.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import devutility.test.spring.bean.ElementBean;
import devutility.test.spring.bean.SonElementBean;

@Configuration
public class AppConfig {
	@Bean
	public ElementBean elementBean() {
		return new ElementBean();
	}

	@Bean
	public SonElementBean sonElementBean() {
		return new SonElementBean(elementBean());
	}
}