package my.myProject.oop;

/*案例2
1：定义一功能，接收用户传入动物，根据用于传入的具体动物，执行该动物特有的方法
2：使用多态，方法形参，不能确定用户传入的是那种动物
3：使用instanceof 关键字，判断具体是何种动物，
4：类转换，执行该动物的特有方法。
*/
public class OopPloyCalssTransformationDemo3 {

	public static void main(String[] args) {
		doSomething(new Cat1());
		doSomething(new Dog3());
		doSomething(new Fish());
		doSomething(new Bird());
		
	}

	// 定义一功能，接收用户传入动物，根据用于传入的具体动物，执行该动物特有的方法
	public static void doSomething(Animal3 s) {
		
		if(s instanceof Cat1) {
			((Cat1) s).run();
		}else if (s instanceof Dog3) {		
			((Dog3) s).run();
		}else if (s instanceof Fish) {
			((Fish) s).run();
		}else if (s instanceof Bird) {
			((Bird) s).run();
		}else {
			System.out.println("非法操作");
		}
	}


}

class Animal3{
	String name;
	
	public Animal3() {
		
	}


	public Animal3(String name) {
		this.name = name;
	}
	
	void run() {
		System.out.println("跑起来了");
	}
}

class Cat1 extends Animal3{
	
	
	
	public Cat1() {
		super();
	}

	public Cat1(String name) {
		super(name);
	}

	void run() {
		System.out.println("猫在跑");
	}
}

class Dog3 extends Animal3{
		
	
	public Dog3() {
		super();
	}

	public Dog3(String name) {
		super(name);
	}

	void run() {
		System.out.println("狗在跑");
	}
}

class Fish extends Animal3{
	
	
	public Fish() {
		super();
	}

	public Fish(String name) {
		super(name);
	}

	void run() {
		System.out.println("鱼儿在游");
	}
}

class Bird extends Animal3{
	
	public Bird() {
		super();
	}

	public Bird(String name) {
		super(name);
	}

	void run() {
		System.out.println("鸟在飞");
	}
}
