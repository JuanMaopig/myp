package my.myProject2.introspector;


import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.sun.org.apache.bcel.internal.generic.NEW;

/*
需求：编写一个工厂方法根据配置文件的内容，工厂方法返回对应的对象，而且要有对应的属性值
以后我们开发框架 的时候，我们是经常需要把一些数据封装到对象中的。



*/
public class Demo1 {

	public static void main(String[] args) throws Exception {
		Person p= (Person) getInstance();
		System.out.println(p);
	}
	
	//根据配置文件内容生产对象并且要把对象的属性封装到对象中。
	private static Object getInstance() throws Exception{
		//缓冲字符流
		BufferedReader bufferedReader =new BufferedReader(new FileReader("d://obj.txt"));
		//读取配置文件获取到完整的类名。
		String className=bufferedReader.readLine();
		//获取class对象类名
		Class clazz = Class.forName(className);
		//通过class对象获取到无参的构造方法
		Constructor constructor = clazz.getConstructor(null);
		//创建对象
		Object o = constructor.newInstance(null);
		
		//读取属性值
		String line=null;
		
		while((line =bufferedReader.readLine())!=null) {
			String []datas=line.split("=");
			
			//通过属性名获取到对应的Field对象。
			Field field =clazz.getDeclaredField(datas[0]);
			
			if(field.getType()==int.class) {
				//设置访问权限
				field.setAccessible(true);
				field.set(o, Integer.parseInt(datas[1]));
			}else {
				field.setAccessible(true);
				field.set(o, datas[1]);
			}
		}
		return o;
	}

}
