package my.myProject.gather;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// Set 集合存和取的顺序不一致。
//		Set hs = new HashSet();
//		hs.add("世界军事");
//		hs.add("兵器知识");
//		hs.add("舰船知识");
//		hs.add("汉和防务");
		Set hs =new HashSet();
		hs.add("高");
		hs.add("富");
		hs.add("帅");
		
		

		// 返回此 set 中的元素的数量
		System.out.println(hs); // 4

		// 如果此 set 尚未包含指定元素，则返回 true
		boolean add = hs.add(""); // false
		System.out.println(hs);
		System.out.println(add);

		// 返回此 set 中的元素的数量
//		System.out.println(hs.size());// 4
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}


}
