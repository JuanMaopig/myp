package my.myProject.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class IOprintStreamDemo {

	
	public static void main(String[] args) throws IOException {
//		FileOutputStream fos=new FileOutputStream("d://a.txt");
//		fos.write("97".getBytes());
//		fos.close();
		
		//打印流可以打印任何类型的数据，而且打印数据之前都会先把数据转换成字符串再进行打印
		File file = new File("d://a.txt");
		//创建一个打印流
		PrintStream ps=new PrintStream(file);
		
		ps.println(97);
		ps.println(3.14);
		ps.println('a');
		ps.println(true);
		
		Dog dog =new Dog("哈士奇","黑白");
		ps.println(dog);
		
		//默认标准的输出流就是向控制台输出的
		System.setOut(ps);//重新设置了标准的输出流对象
		System.out.println("猜猜我在那");
		
		
		//收集异常的日志信息
		File logFile =new File("d://2019年7月23.log");
		PrintStream ps2=new PrintStream(new FileOutputStream(logFile,true));
		try {
//			int c=4/0;
//			System.out.println("c="+c);
			int[] arr=null;
			System.out.println(arr.length);
		}catch(Exception e) {
			e.printStackTrace(ps2);
		}
	}

}
class Dog{
	
	String name;
	
	String color;

		
	public Dog() {
		// TODO Auto-generated constructor stub
	}



	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}



	@Override
	public String toString() {
		return "名字"+this.name+"颜色："+this.color;
	};
	
	
	
}
