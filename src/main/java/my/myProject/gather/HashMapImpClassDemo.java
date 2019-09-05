package my.myProject.gather;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpClassDemo {
//自定义对象作为Map的键。
	public static void main(String[] args) {
		Map<Person5, String> map=new HashMap<Person5, String>();
		map.put(new Person5("kobe", 40), "24");
		map.put(new Person5("lebron", 35), "6");
		map.put(new Person5("jordan", 50), "23");
		map.put(new Person5("antetokounmpo", 40), "24");
		
		System.out.println(map);
		
		Set<Map.Entry<Person5, String>> ks= map.entrySet();
		System.out.println(ks);
		Iterator<Map.Entry<Person5, String>> iterator=ks.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Person5,String> entry =  iterator.next();
			
			Person5 key =entry.getKey();
			
			String value =entry.getValue();
			
			System.out.println("key="+key+",value="+value);
			 
		}
	}

}

//Class person5
//属性：name(str),age(int)
//方法:有参、无参 getter() setter(),三个重写方法
class Person5{
	
	String name;
	
	int age;

	
	public Person5() {
		
	}


	public Person5(String name, int age) {
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
		return "Person5 [name=" + name + ", age=" + age + "]";
	}


	@Override
	public int hashCode() {
		
		return this.name.hashCode()+age*37;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person5) {
			Person5 person5=(Person5) obj;
			return this.name.equals(person5.name)&&this.age==person5.age;
		} else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
}




