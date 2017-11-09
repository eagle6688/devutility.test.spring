package devutility.test.spring.javaconfig.extendconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import devutility.test.spring.bean.ElementBean;
import devutility.test.spring.bean.GrandsonElementBean;
import devutility.test.spring.javaconfig.AppConfig;

@Configuration
@Import(AppConfig.class)
public class ExtendAppConfig {
	@Bean
	@Scope("prototype")
	public GrandsonElementBean grandsonElementBean() {
		return new GrandsonElementBean(new ElementBean());
	}
}