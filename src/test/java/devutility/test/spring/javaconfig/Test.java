package devutility.test.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import devutility.test.spring.bean.ElementBean;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ElementBean elementBean = applicationContext.getBean(ElementBean.class);
		elementBean.doSomething();
	}
}