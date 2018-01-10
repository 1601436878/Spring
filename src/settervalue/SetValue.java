package settervalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Person;

public class SetValue {
	
	/**
	 * 基本类型，直接赋值
	 */
	public void setValueTest(){
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		Person one = app.getBean("person_autoWire",Person.class);
		
		System.out.println(one.getFavouriteBook());
	}
	
	
	public static void main(String[] args) {
		SetValue s = new SetValue(); 
		s.setValueTest();
	}
}
