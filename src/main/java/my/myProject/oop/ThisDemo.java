package my.myProject.oop;

public class ThisDemo {

	public static void main(String[] args) {
		

	}

}

/*
 * 假设定义40个成员变量，第一个有参构造初始化20个变量，第二个有参构造需要初始化40个变量。 
 * 1：第二个有参构造想要使用第一个有参构造。
 * 2：成员函数相互之间可以调用。构造函数可以吗？
 *  3：编译失败，那么构造函数之间应该存在相互调用的模式。this就可以完成这个工作。
 */

class Student {
	String name;
	String gender;
	int age;

	Student() {

	}

	Student(String name) {
		this();
		this.name = name;
	}

	Student(String name, String gender, int age) {
		this(name);
		System.out.println(this); // Student@c17164

		this.gender = gender;
		this.age = age;
	}

	void speak() {
		run();
		System.out.println("姓名：" + name + " 性别：" + gender + " 年龄：" + age
				+ " 哈哈！！！");
	}

	void run() {
		System.out.println("run.....");
	}

}

class Student2 {
	String name;
	String gender;
	int age;
    //构造函数见相互调用
	Student2() {
//		this(null);
	}
    //构造函数见相互调用
	Student2(String name) {
		this();
		this.name = name;
	}

	Student2(String name, String gender, int age) {
		this(name);
		this.gender = gender;
		this.age = age;
	}

	void speak() {
		run();
		System.out.println("姓名：" + name + " 性别：" + gender + " 年龄：" + age
				+ " 哈哈！！！");
	}

	void run() {
		System.out.println("run.....");
	}

}


