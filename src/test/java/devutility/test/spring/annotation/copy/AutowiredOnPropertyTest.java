package devutility.test.spring.annotation.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import devutility.test.spring.bean.ElementBean;

public class AutowiredOnPropertyTest {
	@Autowired
	private ElementBean elementBean;

	public void doSomething() {
		elementBean.doSomething();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AutowiredOnPropertyTest test = context.getBean(AutowiredOnPropertyTest.class);
		test.doSomething();
	}
}