package my.myProject.gather;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// 增加：add() 将指定对象存储到容器中
		list.add("计算机网络");
		list.add("现代操作系统");
		list.add("java编程思想");
		list.add("java核心技术");
		list.add("java语言程序设计");
		System.out.println(list);
		
         // 获取List专属的迭代器
		ListIterator lit = list.listIterator();

		while (lit.hasNext()) {
			String next = (String) lit.next();
			System.out.println(next);
		}
		
		//倒叙遍历
		System.out.println("***************");
		while (lit.hasPrevious()) {
			String next = (String) lit.previous();
			System.out.println(next);
		}
		
		//Set方法：用指定元素替换 next 或 previous 返回的最后一个元素
		lit.next(); // 计算机网络
		lit.next(); // 现代操作系统
		System.out.println(lit.next()); // java编程思想
		//用指定元素替换 next 或 previous 返回的最后一个元素
		lit.set("平凡的世界");// 将java编程思想替换为平凡的世界
		lit.add("平凡的世界");// 在java编程思想后添加平凡的世界
		System.out.println(list);



	}


}
