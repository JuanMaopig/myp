package my.myProject.gather;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteratorDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("西游记");
		list.add("三国演义");
		list.add("石头记");
		list.add("水浒传");
		list.add("全球通史");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String next = (String) it.next();
			System.out.print(next);
		}
		
		System.out.println("");
		Iterator dIterator =list.descendingIterator();
		
		while (dIterator.hasNext()) {
			String next = (String) dIterator.next();
			System.out.print(next);
			
		}
	}

}
