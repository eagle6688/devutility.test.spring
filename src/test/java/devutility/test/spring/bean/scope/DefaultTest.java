package devutility.test.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultTest {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DefaultTest obj1 = context.getBean(DefaultTest.class);
		obj1.setMessage("Hello world!");

		DefaultTest obj2 = context.getBean(DefaultTest.class);
		obj2.setMessage("Change value!");

		System.out.println(String.format("Message of obj1 is %s.", obj1.getMessage()));
		System.out.println(String.format("Message of obj2 is %s.", obj2.getMessage()));
	}
}