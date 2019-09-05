package my.myProject.oop;

public class StaticDemo {

	public static void main(String[] args) {
		

	}

}

class Human{
	String name;
	int age;
	String gender;
	//static 修饰成员变量
	static String country = "CN";

	Human() {

	}

	Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	void speak() {

		System.out.println("国籍:" + country + " 姓名：" + name + " 性别：" + gender
				+ " 年龄：" + age + " 哈哈！！！");
	}


}

/* 练习：统计创建对象的人数 */

class CountPerson{
	public String name;
	
	public int age;
	
	static public int all_count;

	public CountPerson() {
		
	}
	
	public CountPerson(String name, int age) {
		all_count++;
		
		this.name = name;
		
		this.age = age;
	}
	
	public long getCount() {
		return all_count;
	}
	
	public boolean findSameAge(CountPerson p) {
		return this.age==p.age;
		
	}
	
}
