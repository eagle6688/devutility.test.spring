package devutility.test.spring.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMethodTest {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	protected static void init() {
		System.out.println("Start init InitMethodTest bean...");
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		InitMethodTest test = context.getBean(InitMethodTest.class);
		System.out.println(test.getMessage());
	}
}