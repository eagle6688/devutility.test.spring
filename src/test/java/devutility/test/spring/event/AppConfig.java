package devutility.test.spring.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import devutility.test.spring.javaconfig.extendconfig.ExtendAppConfig;

@Configuration
@Import(ExtendAppConfig.class)
public class AppConfig {
	@Bean
	public ContextClosedHandler contextClosedHandler() {
		return new ContextClosedHandler();
	}

	@Bean
	public ContextRefreshedHandler contextRefreshedHandler() {
		return new ContextRefreshedHandler();
	}

	@Bean
	public ContextStartedHandler contextStartedHandler() {
		return new ContextStartedHandler();
	}

	@Bean
	public ContextStoppedHandler contextStoppedHandler() {
		return new ContextStoppedHandler();
	}
}