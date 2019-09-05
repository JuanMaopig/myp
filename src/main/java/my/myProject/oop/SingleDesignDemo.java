package my.myProject.oop;

public class SingleDesignDemo {

	public static void main(String[] args) {
		

	}

}

//饿汉单例设计模式 ----> 保证Single在在内存中只有一个对象。
class Single1{

	//声明本类的引用类型变量，并且使用该变量指向本类对象
	private static	Single1 s = new Single1();

	//私有化构造函数
	private Single1(){}

	//提供一个公共静态的方法获取本类的对象
	public	static  Single1 getInstance(){
		return s;
	}
}


//懒汉单例设计模式 ----> 保证Single在在内存中只有一个对象。

class Single2{
	
	//声明本类的引用类型变量，不创建本类的对象
	private static Single2 s;

	//私有化了构造函数
	private Single2(){}

	//
	public static Single2 getInstance(){
		if(s==null){
			s = new Single2();
		}
		return s;
	}
}