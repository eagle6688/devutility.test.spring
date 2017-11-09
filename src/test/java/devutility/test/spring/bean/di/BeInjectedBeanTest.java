package devutility.test.spring.bean.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeInjectedBeanTest {
	private ElementBean elementBean;

	public BeInjectedBeanTest(ElementBean elementBean) {
		System.out.println("Execute BeInjectedBean constructor.");
		this.elementBean = elementBean;
	}

	public void doSomething() {
		elementBean.doSomething();
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeInjectedBeanTest test = context.getBean(BeInjectedBeanTest.class);
		test.doSomething();
	}
}