package event;

import org.springframework.context.ApplicationListener;

/**
 * EmailEvent事件的监听器
 * @author twilight
 *
 */
public class EmailNotifier implements ApplicationListener<EmailEvent>{
	@Override
	public void onApplicationEvent(EmailEvent event) {

		System.out.println(event.getSource()+" : "+event.getAddress()+" : "+event.getText());
	}

}
