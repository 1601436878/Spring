package i18n;


import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 资源文件必须位于src目录下
 * 文件名格式：message_语言类型_国家/地区的类型
 * 
 *  zh_cn 中文(中华人民共和国)
	en 英语
	en_us 英语(美国)
 * @author twilight
 *
 */
public class I18NTest {
	protected void test(){
		@SuppressWarnings("resource")
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		/*
		 * Locate 还可以直接使用:
		 * Locale.US
		 * Locale.CHINA
		 */
		String hello = app.getMessage("hello", new String [] {"tom"}, new Locale("zh", "CN"));
		System.out.println(hello);
	}
	
	public static void main(String[] args) {
		I18NTest s = new I18NTest(); 
		s.test();
	}
}
