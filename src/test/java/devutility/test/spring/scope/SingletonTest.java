package devutility.test.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonTest {
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
		SingletonTest obj1 = context.getBean(SingletonTest.class);
		obj1.setMessage("Hello world!");

		SingletonTest obj2 = context.getBean(SingletonTest.class);
		System.out.println(String.format("Message of obj1 is %s.", obj1.getMessage()));
		System.out.println(String.format("Message of obj2 is %s.", obj2.getMessage()));
	}
}