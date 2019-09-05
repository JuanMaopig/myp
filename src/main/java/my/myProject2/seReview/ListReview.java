package my.myProject2.seReview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 遍历
 */

public class ListReview {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("kobe");
		list.add("lerbron");
		list.add("jordan");
		list.add("antetokounmupo");
		
		
		System.out.println("=========get方式遍历==========");
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+",");
		}
		
		System.out.println("\r\n=========迭代器方式遍历==========");
		
		Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		
		HashSet<String> set=new HashSet<String>();
		set.add("科比");
		set.add("詹姆斯");
		set.add("乔丹");
		set.add("扬尼斯");
		
		for(String player:set) {
			System.out.print(player+" ");
		}
		System.out.println("\r\n=========entrySet方式遍历==========");
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("23", "jordan");
		map.put("24","kobe");
		map.put("6", "lbj");
		
		Set<Entry<String,String>> entrys =map.entrySet();
		
		for(Entry<String, String> entry:entrys) {
			System.out.println("键"+" "+entry.getKey()+" "+"值:"+" "+entry.getValue());
		}
	}

}
