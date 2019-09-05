package my.myProject.reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {

	public static void main(String[] args) throws Exception {
		//获取到对应的Class对象
		Class clazz = Class.forName("my.myProject.reflect.Person");
		
		//通过Class对象获取对应的构造方法,公共的构造方法
		Constructor[] constructors =clazz.getConstructors();//
		for(Constructor cons:constructors) {
			System.out.println(cons);
		}
		
		//通过Class对象获取对应的构造方法,所有构造方法，包括私有的在内
		Constructor[] constructorsall =clazz.getDeclaredConstructors();//
		for(Constructor cons:constructorsall) {
			System.out.println(cons);
		}
		
		//getConstructor获取单个指定的构造方法。
		Constructor constructor3 =clazz.getConstructor(int.class,String.class);
		Person p=(Person) constructor3.newInstance(24,"kobe");
		System.out.println(p);
		
		
		Constructor constructor=clazz.getDeclaredConstructor(null);
		
		constructor.setAccessible(true);
		Person p1 =(Person) constructor.newInstance(null);
		System.out.println(p1);
	}

}
