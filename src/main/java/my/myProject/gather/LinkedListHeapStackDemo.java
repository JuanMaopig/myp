package my.myProject.gather;

import java.util.LinkedList;

public class LinkedListHeapStackDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// 压栈，先进后出
		list.push("西游记");
		list.push("三国演义");
		list.push("石头记");
		list.push("水浒传");
		System.out.println(list);
		// 弹栈
		String str1 = (String) list.pop();
		System.out.println(str1);
		String str2 = (String) list.pop();
		System.out.println(str2);
		String str3 = (String) list.pop();
		System.out.println(str3);
		String str4 = (String) list.pop();
		System.out.println(str4);
        System.out.println(list.size());// 0
		System.out.println(list); //[]
	}

}
