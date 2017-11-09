package devutility.test.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredOnSetterTest {
	private String message;

	public String getMessage() {
		return message;
	}
	
	@Autowired
	public void setMessage(String message) {
		this.message = message;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AutowiredOnSetterTest test = context.getBean(AutowiredOnSetterTest.class);
		System.out.println(test.getMessage());
	}
}