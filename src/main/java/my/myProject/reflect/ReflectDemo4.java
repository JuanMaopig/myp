package my.myProject.reflect;

import java.lang.reflect.Field;

public class ReflectDemo4 {

	public static void main(String[] args) throws Exception{
		//获取到对应的Class对象
		Class clazz =Class.forName("my.myProject.reflect.Person");
		//获取到所有的成员变量
		Field[] fields=clazz.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(fields);
		}
		
		Person p =new Person();
		Field field =clazz.getDeclaredField("id");
		
		//设置访问权限可以访问
		field.setAccessible(true);
		field.set(p, 110);//第一个参数：设置该数据的成员变量，第二个参数属性值
		System.out.println(p);
	}

}
