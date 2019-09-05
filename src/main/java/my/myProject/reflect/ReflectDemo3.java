package my.myProject.reflect;

import java.lang.reflect.Method;

public class ReflectDemo3 {

	public static void main(String[] args) throws Exception{
		//获取对象
		Class clazz = Class.forName("my.myProject.reflect.Person");
		//获取所有的公有方法
//		Method[] methods= clazz.getMethods();
		//获取所有的方法，但不包括父类方法
		Method[] methods=clazz.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method);
		}
		
		Person p =new Person(110,"狗娃");
		
		Method m =clazz.getMethod("eat", int.class);
		m.invoke(p, 3);
		//执行私有方法
		Method m2=clazz.getDeclaredMethod("sleep", int.class);
		//设置访问权限允许访问
		m2.setAccessible(true);
		m2.invoke(null, 6);
		
		Method m3 =clazz.getMethod("sum",int[].class);
		m3.invoke(p, new int[] {12,5,9});		
	}

}
