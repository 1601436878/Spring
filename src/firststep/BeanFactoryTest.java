package firststep;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import bean.Book;

public class BeanFactoryTest {
	
	
	/**
	 * 使用BeanFactory接口，创建BeanFactory实例
	 */
	protected void beanFactoryTest(){
		//Resource resource = new ClassPathResource("beans.xml");
		
		// 以绝对路径访问beans.xml
		Resource resource = new FileSystemResource("E:/workspace_web/Spring/src/beans.xml");
		
		// DefaultListableBeanFactory 是BeanFactory接口的实现类
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory(); 
		
		// 加载配置文件
		new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions(resource);
		
		Book book = beanFactory.getBean("book", Book.class);
		book.setBookName("失控");
		System.out.println(book.getBookName());
	}
	
	/**
	 * 使用ApplicationContext接口，他是BeanFactory接口的子接口，功能更强大
	 */
	protected void applicationTest(){
		/*
		 * ClassPathXmlApplicationContext 查找项目的class路径
		 * FileSystemXmlApplicationContext 绝对路径
		 * 效果一样
		 */
		
//		ApplicationContext application = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext application = new FileSystemXmlApplicationContext("E:/workspace_web/Spring/src/beans.xml");
		Book book = application.getBean("book",Book.class);
		
		book.setBookName("失控");
		System.out.println(book.getBookName());
	}
	
	
	
	public static void main(String[] args) {
		BeanFactoryTest bean = new BeanFactoryTest(); 
//		bean.beanFactoryTest();
		bean.applicationTest();
	}
}
