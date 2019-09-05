package my.myProject.gather;

import java.util.ArrayList;

/*
 练习：去除ArrayList集合中重复元素
1：存入字符串元素
2：存入自定义对象元素（如Perosn对象）
*/
/*
 * 思路:
	 存入人的对象.
	 1先定义person 类
	 2将该类的实例存入集合
	 3 将对象元素进行操作. 注意:自定义对象要进行复写toString 和 equals 方法.
	 为什么? 因为object 是person 的父类,object 中的toString 返回的是哈希值,object 类中equals
	 方法比较的是对象的地址值
	 思路
 1存入字符串对象 
 2存入自定义对象 如person
 2创建容器,用于存储非重复元素
 3对原容器进行遍历,在遍历过程中进行判断遍历到的元素是否在容器中存在.(contains)
 4如果存在,就不存入,否则存入.
 5 返回新容器
	 */

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		Person p1 = new Person("jack", 20);
		Person p2 = new Person("rose", 18);
		Person p3 = new Person("rose", 18);
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		System.out.println(arr);
		ArrayList arr2 = new ArrayList();
		for (int i = 0; i < arr.size(); i++) {
			Object obj = arr.get(i);
			Person p = (Person) obj;
			if (!(arr2.contains(p))) {
				arr2.add(p);
			}
		}
		System.out.println(arr2);

	}

}

class Person1 {
	private String name;
	private int age;

	public Person1() {

	}

	public Person1(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + age * 37;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}
		Person1 p = (Person1) obj;

		return this.name.equals(p.name) && this.age == p.age;
	}

	@Override
	public String toString() {
		return "Person@name:" + this.name + " age:" + this.age;
	}
}
