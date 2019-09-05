package my.myProject.gather;

import java.util.TreeSet;

public class TreeSetSortDemo1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Person4("aa", 20, "男"));
		ts.add(new Person4("bb", 18, "女"));
		ts.add(new Person4("cc", 17, "男"));
		ts.add(new Person4("dd", 17, "女"));
		ts.add(new Person4("dd", 15, "女"));
		ts.add(new Person4("dd", 15, "女"));


		System.out.println(ts);
		System.out.println(ts.size()); // 5

	}


}
class Person4 implements Comparable {
	private String name;
	private int age;
	private String gender;

	public Person4() {

	}

	public Person4(String name, int age, String gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age * 37;
	}

	public boolean equals(Object obj) {
		System.err.println(this + "equals :" + obj);
		if (!(obj instanceof Person4)) {
			return false;
		}
		Person4 p = (Person4) obj;
		return this.name.equals(p.name) && this.age == p.age;

	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender
				+ "]";
	}

	public int compareTo(Object obj) {
		
		Person4 p = (Person4) obj;
		System.out.println(this+" compareTo:"+p);
		if (this.age > p.age) {
			return 1;
		}
		if (this.age < p.age) {
			return -1;
		}
		return this.name.compareTo(p.name);
	}

}

