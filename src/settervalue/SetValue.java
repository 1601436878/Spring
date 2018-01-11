package settervalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Book;
import bean.Book_zuhe;
import bean.Cat;
import bean.Dog;
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
	public void getValueZuheValue(){
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		Book_zuhe zuhe_book = app.getBean("zuhe_book",Book_zuhe.class);
		System.out.println(zuhe_book.getPublish().getPublisherName());
	}
	
	/**
	 * 测试静态工厂类
	 */
	public void getStaticFactoryBean(){
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		Dog dog = app.getBean("dog",Dog.class);
		Cat cat = app.getBean("cat",Cat.class);
		dog.testMessage();
		cat.testMessage();
	}
	
	
	public static void main(String[] args) {
		SetValue s = new SetValue(); 
//		s.setValueTest();
//		s.getValueZuheValue();
		s.getStaticFactoryBean();
	}
}
