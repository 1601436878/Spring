package factory;

import bean.Being;
import bean.Cat;
import bean.Dog;

/**
 * 静态工厂类
 * @author twilight
 *
 */
public class StaticFactory {
	public static Being getBeing(String type){
		if(type.equalsIgnoreCase("cat")){
			return new Cat();
		}else if(type.equalsIgnoreCase("dog")){
			return new Dog();
		}
		return null; 
	}
}
