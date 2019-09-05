package my.myProject.javaApi;

/*toString() equals() hashCode()*/
//练习：自定义一个Man类，打印该对象的描述信息，要求描述信息为：姓名 — 年龄
//比较两个人是否是同一个人，根据两个人的名字判断
public class ObjectMethodDemo {

	public static void main(String[] args) {
		Object object=new Object();
		System.out.println(object);//hashCode的十六
		
		Man man=new Man("张三",15);
		System.out.println(man);
		
		Man man2=new Man("张三",15);
		
		System.out.println(man.equals(man2));
		
	}

}

class Man{
	String name;
	
	int age;

	
	
	public Man() {
		
	}



	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
//		return "Man [姓名=" + name + ", 年龄=" + age + "]";
		return this.name+"-"+this.age;
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
		return this.name.hashCode()+this.age;
	}



	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Man man=null;
		
		if(obj instanceof Man) {//类型转换
			man=(Man) obj;
		}
		
		if(this.name==man.name) {
			return true;
		}
		return false;
	}
	
	
	
	
	
}
