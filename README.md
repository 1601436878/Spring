# 参数赋值
- 基本类型直接赋值
```
		<property name="name" value="tom"></property>
		<property name="age" value="20"></property>
```

- 其他javaBean

	1. 一般方式
```
<property name="favouriteBook" ref="book"></property>
```

	2. 自动装配
```
<bean id="person_autoWire" class="bean.Person" autowire="byName"></bean>
```

	3. 注入嵌套 
```
		<property name="favouriteBook">
			<!-- 3. 注入嵌套bean，不能被Spring容器直接访问，只用于当前的bean的赋值，因此，可以不写id -->
			<bean class="bean.Book">
				<property name="bookName" value="追风筝的人"></property>
			</bean>
		</property>
```

- 集合类型