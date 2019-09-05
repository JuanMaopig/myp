package my.myProject.gather;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorNoteDemo {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		// 增加：add() 将指定对象存储到容器中
		list.add("kobe");
		list.add("lebron");
		list.add("jordan");
		
		System.out.println(list);

		//细节一：
//		如果迭代器的指针已经指向了集合的末尾，那么如果再调用next()会返回
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String next = (String) it.next();
			System.out.println(next);
		}
		// 迭代器的指针已经指向了集合的末尾
//		 String next = (String) it.next();
		// java.util.NoSuchElementException
		
//		细节二：
//		 如果调用remove之前没有调用next是不合法的，会抛出IllegalStateException

		Iterator it1 = list.iterator();
		while (it1.hasNext()) {
			// 调用remove之前没有调用next是不合法的 java.util.ConcurrentModificationException
//			 it.remove();
			// java.lang.IllegalStateException
			String next = (String) it1.next();
			System.out.println(next);
		}

	}


}
