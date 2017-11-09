package devutility.test.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedHandler implements ApplicationListener<ContextStartedEvent> {
	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent Received");
	}
}