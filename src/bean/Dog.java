package bean;

/**
 * 工厂类测试类
 * @author twilight
 *
 */
public class Dog implements Being {
	private String message; 

	@Override
	public void testMessage() {
		// TODO Auto-generated method stub
			System.out.println("Dog: "+ message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
