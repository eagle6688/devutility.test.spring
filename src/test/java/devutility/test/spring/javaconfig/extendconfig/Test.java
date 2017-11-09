package devutility.test.spring.javaconfig.extendconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import devutility.test.spring.bean.GrandsonElementBean;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtendAppConfig.class);
		GrandsonElementBean bean = applicationContext.getBean(GrandsonElementBean.class);
		bean.doSomething();
	}
}