package devutility.test.spring.javaconfig.dependence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import devutility.test.spring.bean.SonElementBean;
import devutility.test.spring.javaconfig.AppConfig;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SonElementBean bean = applicationContext.getBean(SonElementBean.class);
		bean.doSomething();
	}
}