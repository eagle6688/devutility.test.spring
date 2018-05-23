package devutility.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public abstract class BaseTest extends devutility.internal.test.BaseTest {
	protected ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
}