package event;

import org.springframework.context.ApplicationEvent;

/**
 * 表示一个事件，由ApplicationContext触发
 * @author twilight
 *
 */
public class EmailEvent extends ApplicationEvent{
	public EmailEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public EmailEvent(Object source, String address, String text) {
		super(source);
		this.address = address;
		this.text = text;
	}


	private String address; 
	private String text;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	} 
}
