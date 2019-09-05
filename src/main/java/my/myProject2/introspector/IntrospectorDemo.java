package my.myProject2.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;


/*
内省--->一个变态的反射.

内省主要解决 的问题： 把对象的属性数据封装 到对象中。


 */
public class IntrospectorDemo {


	
	public static void getAllProperty() throws IntrospectionException{
		//Introspector 内省类
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
		//通过BeanInfo获取所有的属性描述类
		PropertyDescriptor[] descriptors=beanInfo.getPropertyDescriptors();//获取一个类中的所有属性描述器
		for(PropertyDescriptor p:descriptors) {
			System.out.println(p.getReadMethod());//get方法
		}
	}
	
	public static void testProperty() throws Exception {
		//创建一个对象
		Person p=new Person();
		//属性描述器
		PropertyDescriptor descriptor = new PropertyDescriptor("id",Person.class);
		//获取属性对应的get或者是set方法设置或者获取属性。
		Method wm =descriptor.getWriteMethod();//获取属性的set方法
		//执行该方法设置属性值
		wm.invoke(p, 110);
		Method rm = descriptor.getReadMethod();//获取属性的get方法	
		System.out.println(rm.invoke(p, null));
		
	}
}
