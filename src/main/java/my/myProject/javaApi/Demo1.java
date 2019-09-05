package my.myProject.javaApi;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
//		String str="";
//		List<Student>list =new ArrayList<Student>();
//		
//		Student stu=new Student("kobe",12);
//		list.add(stu);
//		stu=new Student("antetomukounpo",9);
//		list.add(stu);
//		
//		for(Student item:list) {
//			str+="学生姓名为:"+item.getName();
//			str+="\n";
//		}
//		
//		System.out.println(str);
		
		Integer total=0;
		a(total);
		System.out.println(total);
		
		
 	}

	private static void a(Integer total) {
		if(total<1) {
			total+=1;
		}	
	}

}
class Student{
	String name;
	int age;
	public Student() {
		
	}
	public Student(String name, int age) {
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
	
	
	
	
}