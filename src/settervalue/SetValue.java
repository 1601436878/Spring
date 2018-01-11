package settervalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.ListTest;
import bean.Person;

public class SetValue {
	
	/**
	 * 基本类型，直接赋值
	 */
	public void setValueTest(){
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		ListTest listTest = app.getBean("listTest",ListTest.class);
		
		System.out.println(listTest.getList_String());
		System.out.println(listTest.getMap());
		System.out.println(listTest.getMap_String_Publisher());
		System.out.println(listTest.getProperties());
		System.out.println(listTest.getSet_Publisher());
		System.out.println(listTest.getStrings());
	}
	
	
	public static void main(String[] args) {
		SetValue s = new SetValue(); 
		s.setValueTest();
	}
}
