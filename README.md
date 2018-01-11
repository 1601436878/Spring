# 参数赋值
- 基本类型直接赋值
```
		<property name="name" value="tom"></property>
		<property name="age" value="20"></property>
```

- 其他javaBean

	1.一般方式
	```
	<property name="favouriteBook" ref="book"></property>
	```
	
	2.自动装配
	```
	<bean id="person_autoWire" class="bean.Person" autowire="byName"></bean>
	```
	
	3.注入嵌套 
	```
			<property name="favouriteBook">
				<!-- 3. 注入嵌套bean，不能被Spring容器直接访问，只用于当前的bean的赋值，因此，可以不写id -->
				<bean class="bean.Book">
					<property name="bookName" value="追风筝的人"></property>
				</bean>
			</property>
	```

- 集合类型
集合类型一共4个标签 `<list />` , `<set />` , `<map />` , `<props />`

	1. list： 集合、数组
	2. set： Set 集合
	3. map： Map 键值对
	4. props： Properties 类型

```
	<!-- 4. 集合类型赋值 -->
	<bean id="listTest" class="bean.ListTest">
	
		<!-- 给List集合赋值 -->
		<property name="list_String">
			<list>
				<!-- 属性可以是很多种，value，bean，集合，map都可以 -->
				<value>list_String1</value>
				<value>list_String2</value>
				<value>list_String3</value>
			</list>
		</property>
		
		<!-- 给Map赋值 -->
		<property name="map">
			<map>
				<entry key="map_key0" value="map_value0"></entry>
				<entry key="map_key1" value="map_value1"></entry>
				<entry key="map_key1" value="map_value1"></entry>
			</map>
		</property>
		
		<!-- 给 Map<String,Publisher> 类型赋值 -->
		<property name="map_String_Publisher">
			<map>
				<entry key="publisher_0" value-ref="publish"></entry>
				<entry key="publisher_1" value-ref="publish"></entry>
				<entry key="publisher_2" value-ref="publish"></entry>
			</map>
		</property>
		
		<!-- 给 Properties 类型赋值 -->
		<property name="properties">
			<props>
				<prop key="properties_key0">properties_value0</prop>
				<prop key="properties_key1">properties_value1</prop>
				<prop key="properties_key2">properties_value2</prop>
			</props>
		</property>
		
		<!-- 给 Set类型赋值 -->
		<property name="set_Publisher">
			<set>
				<!-- 值 可以为任意类型 -->
				<value>set_中的普通字符串</value>
				<bean class="bean.Book">
					<property name="bookName" value="嫌疑人x的现身"></property>
				</bean>
				<list>
					<value>set_list_00</value>
					<value>set_list_01</value>
				</list>
			</set>
		</property>
		
		<!-- 给 String [] 赋值 -->
		<property name="strings">
			<list>
				<value>array_00</value>
				<value>array_01</value>
				<value>array_02</value>
			</list>
		</property>
	</bean>
```