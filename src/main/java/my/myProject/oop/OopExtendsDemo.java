package my.myProject.oop;


/*继承里需要掌握的关键字 super(),instanceof,final*/
public class OopExtendsDemo {
	
	public static final double PI = 3.14; // 静态常量

	public static double getArea(double r) {
		return PI * r * r;
	}

	public static double getLength(double r) {
		return PI * r * 2;
	}


	public static void main(String[] args) {
		
		// Demo12.PI=300; 无法为最终变量 PI 指定值
		System.out.println(OopExtendsDemo.PI);

	}
	
	// 定义一个功能函数，根据传递进来的对象的做不同的事情
		// 如果是狗让其看家，如果是猫让其抓老鼠
		// 对象 instanceof 类;
	public void doSomething(Animal a) {
			if (a instanceof Dog) {
				a.eat();
				a.shout();
				System.out.println("小狗看家");
			} else if (a instanceof Cat) {
				a.eat();
				a.shout();
				System.out.println("抓老鼠");
			}
		}

}


/* 子类对父亲方法的重写 */
class Animal{
	int x=1;
	String name;
	
	void eat(){
		System.out.println("吃东西");
	}
	void shout(){
		System.out.println("我是动物");
	}
}

class Dog extends Animal{
	
	
	void eat(){
		System.out.println("啃骨头");
	}
	void shout(){
		System.out.println("旺旺");
	}
	void eat(String food){
		System.out.println("吃："+food);
	}
}
class Cat extends Animal{

	void eat(){
		System.out.println("吃老鼠");
	}
	void shout(){
		System.out.println("喵喵");
	}
}


/*
 * 定义一个功能函数，
 * 根据传递进来的对象的做不同的事情 
 * 如果是狗让其看家，
 * 如果是猫让其抓老鼠 
 *  1：定义动物类
 *  2：定义狗类继承动物类 
 *  3：定义猫类继承动物类
 *  4：定义功能根据传入的动物，执行具体的功能
 */
class Animal2 {

	String name;

	void eat() {
		System.out.println("吃东西");
	}

	void shout() {
		System.out.println("我是动物");
	}
}

class Dog2 extends Animal {

	void eat() {
		System.out.println("啃骨头");
	}

	void shout() {
		System.out.println("旺旺");
	}

}

class Cat2 extends Animal {

	void eat() {
		System.out.println("吃老鼠");
	}

	void shout() {
		System.out.println("喵喵");
	}
}





