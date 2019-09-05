package my.myProject.gather;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpClassDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Person("jack", 21));
		hs.add(new Person("rose", 20));
		hs.add(new Person("hmm", 22));
		hs.add(new Person("lilei", 24));
		hs.add(new Person("jack", 23));

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object next = it.next();
			System.out.println(next);
		}
	}


}
class Person3 {
	private String name;
	private int age;

	Person3() {

	}

	public Person3(String name, int age) {

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
		System.out.println("hashCode:" + this.name);
		return this.name.hashCode() + age * 37;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(this + "---equals---" + obj);
		if (obj instanceof Person3) {
			Person3 p = (Person3) obj;
			return this.name.equals(p.name) && this.age == p.age;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {

		return "Person@name:" + this.name + " age:" + this.age;
	}

}

