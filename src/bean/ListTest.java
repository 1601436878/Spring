package bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ListTest {
	private List<String> list_String;
	private Map map; 
	private Map<String,Publisher> map_String_Publisher;
	private Properties properties; 
	private Set set_Publisher;
	private String [] strings;
	
	public ListTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ListTest(List<String> list_String, Map map,
			Map<String, Publisher> map_String_Publisher, Properties properties,
			Set set_Publisher, String[] strings) {
		super();
		this.list_String = list_String;
		this.map = map;
		this.map_String_Publisher = map_String_Publisher;
		this.properties = properties;
		this.set_Publisher = set_Publisher;
		this.strings = strings;
	}
	public List<String> getList_String() {
		return list_String;
	}
	public void setList_String(List<String> list_String) {
		this.list_String = list_String;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Map<String, Publisher> getMap_String_Publisher() {
		return map_String_Publisher;
	}
	public void setMap_String_Publisher(Map<String, Publisher> map_String_Publisher) {
		this.map_String_Publisher = map_String_Publisher;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Set getSet_Publisher() {
		return set_Publisher;
	}
	public void setSet_Publisher(Set set_Publisher) {
		this.set_Publisher = set_Publisher;
	}
	public String[] getStrings() {
		return strings;
	}
	public void setStrings(String[] strings) {
		this.strings = strings;
	}
}
