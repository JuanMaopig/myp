package my.myProject.gather;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.sun.javafx.collections.MappingChange.Map;

public class TreeMapImpClassDemo {

	public static void main(String[] args) {
		TreeMap<Person6, String> hm =new TreeMap<Person6, String>(new MyComparator1());
		hm.put(new Person6("kobe", 39), "24");
		hm.put(new Person6("lbj", 34), "6");
		hm.put(new Person6("jordan", 50), "23");
		
		Set<Entry<Person6, String>> entries =hm.entrySet();
		Iterator<Entry<Person6, String>> iterator=entries.iterator();
		
		while(iterator.hasNext()) {
			Entry<Person6, String> next=iterator.next();
			Person6 key=next.getKey();
			String value =next.getValue();
			
			System.out.println(key+"="+value);
		}
	}


}

class MyComparator1 implements Comparator<Person6> {
	
	public int compare(Person6 p1,Person6 p2) {
		if(p1.getAge()>p2.getAge()) {
			return -1;
		}else if(p1.getAge()<p2.getAge()) {
			return 1;
		}
		return p1.getName().compareTo(p2.getName());
	}
}
//Person6 (str)name,(int)age
//无参构造

class Person6 implements Comparable<Person6> {
	private String name;
	private int age;

	Person6() {

	}

	public Person6(String name, int age) {

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
	public String toString() {
		return "Person6@name:"+this.name+"age:"+this.age;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode()+this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person6) {
			Person6 person6=(Person6) obj;
			return this.name.equals(person6.name)&&person6.age==this.age;
		}else {
			return false;
		}
	}
	
	public int compareTo(Person6 p) {
		if(this.age>p.age) {
			return 1;
		}else if (this.age<p.age) {
			return -1;
		}
		return this.name.compareTo(p.name);
	}

	

}

