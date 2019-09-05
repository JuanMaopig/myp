package my.myProject.gather;

import java.util.ArrayList;
import java.util.Collection;
//集合添加自定义对象
public class CollectionDemo {

	
	public static void main(String []args) {
		Person p=new Person("乔丹",55);
		Person p1=new Person("小乔丹",29);
		Person p2=new Person("乔丹",23);
		
		
		Collection c=new ArrayList();
		c.add(p);
		c.add(p1);
		c.add(p2);
		
		Collection c2=new ArrayList();
		c2.add(p);
		c2.add(p1);
		c2.add(p2);
		
		System.out.println("c是否包含c2里的所有元素"+c.containsAll(c2));
		
		System.out.println("球员是:"+c);
		c.remove(p1);
		System.out.println("球员是:"+c);
		
		
		System.out.println(c.contains(new Person("乔丹",23)));
	}
}

class Person{
	private String name;
	
	private int age;

	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [姓名=" + name + ", 年龄=" + age + "]";
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p=(Person)obj;
		
			return this.name==p.name;
	}
	
	
	
	
	
	
}
