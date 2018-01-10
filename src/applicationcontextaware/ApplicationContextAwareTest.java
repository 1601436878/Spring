package applicationcontextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import event.EmailEvent;

/**
 * ApplicationContextAware 接口可以让普通bean获得ApplicationContext 对象的引用，从而调用ApplicationContext中的方法
 * @author twilight
 *
 */
public class ApplicationContextAwareTest implements ApplicationContextAware {
	private ApplicationContext app;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		this.app = arg0;
	}
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml"); 
		EmailEvent emailEvent = new EmailEvent("test","安徽合肥","test email"); 
		
		app.publishEvent(emailEvent);
	}

}
