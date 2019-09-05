package my.myProject2.seReview;

import java.util.ArrayList;

public class Generic {

	//泛型的好处
	//1.把运行时出现的问题提前至编译前
	//2.避免了无畏的强制类型转换
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("gg");
		list.add("mm");
		list.add("dd");
//		list.add(111);//Integer类型,泛型将错误提前到了编译前
		
		for(int i=0;i<list.size();i++) {
			String string= list.get(i);
			System.out.print(string.toUpperCase());
		}
	}

}
