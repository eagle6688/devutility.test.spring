package devutility.test.spring.annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredTest {
	private String message;

	public String getMessage() {
		return message;
	}

	@Required
	public void setMessage(String message) {
		this.message = message;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		RequiredTest test = context.getBean(RequiredTest.class);
		System.out.println(test.getMessage());
	}
}