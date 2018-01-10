package event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		EmailEvent emailEvent = new EmailEvent("source", "安徽合肥", "this is a test"); 
		// 由ApplicationContext触发事件
		app.publishEvent(emailEvent);
	}
}
