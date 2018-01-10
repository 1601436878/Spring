package firststep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Book;

public class ApplicationContextTest {
	protected void applicationTest(){
		ApplicationContext application = new ClassPathXmlApplicationContext("beans.xml");
		Book book = application.getBean("book",Book.class);
		
		book.setBookName("失控");
		
		System.out.println(book.getBookName());
	}
	
	public static void main(String[] args) {
		ApplicationContextTest s = new ApplicationContextTest(); 
		s.applicationTest();
	}

}
