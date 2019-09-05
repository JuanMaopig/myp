package my.myProject.gather;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		
		list.add("antetokoumupo");
		list.add("lerbron");
		list.add("kobe·bryant");
		
		list.addFirst("jordan");
		list.addLast("stephen·curry");
		System.out.println(list);
		// 获取指定位置处的元素。
		System.out.println(list.get(0));
		// 返回此列表的第一个元素。
		System.out.println(list.getFirst());
		
		// 获取指定位置处的元素。
		System.out.println(list.get(list.size()-1));
		System.out.println(list.getLast());
		
		// 返回此列表的最后一个元素。
		
		

		// 获取但不移除此列表的头（第一个元素）。
		Object element =list.element();
		System.out.println(element);
		
		int size =list.size();
		System.out.println(size);
		
		
}


}
