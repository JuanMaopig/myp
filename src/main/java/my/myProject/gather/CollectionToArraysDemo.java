package my.myProject.gather;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*问题： 定义一个Person数组，将Person数组中的重复对象剔除？
思路: 
1. 描述一个Person类 
2. 将数组转换为Arrays.asList() List 
3. Set addAll( list ) 
4. hashCode()且equals()*/

public class CollectionToArraysDemo {

	public static void main(String[] args) {
		Person[] ps = new Person[] { new Person("jack", 34),
				new Person("lucy", 20), new Person("lili", 10),
				new Person("jack", 34) };
		// 遍历数组
		System.out.println(Arrays.toString(ps));
		// 2. 将自定义对象数组转换为List集合
		List<Person> list = Arrays.asList(ps);
		// 3. 将List转换为Set
		Set<Person> set = new HashSet<Person>();
		set.addAll(list);
		System.out.println(set);

	}


}

class HumanPerson{
	public String name;
	public int age;

	public HumanPerson() {
	}

	public HumanPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {

		return getClass().getName() + " : name=" + this.name + " age="
				+ this.age;

	}

	// 4. 重写hashCode和equals()
	public int hashCode() {

		return this.age;
	}

	public boolean equals(Object o) {
		HumanPerson p = null;
		if (o instanceof HumanPerson)
			p = (HumanPerson) o;
		return this.name.equals(p.name) && (this.age == p.age);

	}
}