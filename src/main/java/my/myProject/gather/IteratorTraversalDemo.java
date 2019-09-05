package my.myProject.gather;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTraversalDemo {

	public static void main(String[] args) {

		ArrayList player = new ArrayList();
		
		player.add("Giannis·antetokounmupo");
		player.add("kobe·bryant");
		player.add("lerbron·james");
		player.add("stephen·curry");
		
		System.out.println(player);
		
		//while循环
		Iterator it = player.iterator();
		while (it.hasNext()) {
			String next = (String) it.next();
			System.out.println(next);
		}
		
		//for循环
//		for(Iterator it3=player.iterator();it3.hasNext();) {
//			String next= (String) it3.next();
//			System.out.println(next);
//		}


	}

}
