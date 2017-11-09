package devutility.test.spring.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import devutility.test.spring.bean.GrandsonElementBean;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.start();

		GrandsonElementBean bean = context.getBean(GrandsonElementBean.class);
		bean.doSomething();
		
		context.stop();
		context.close();
	}
}