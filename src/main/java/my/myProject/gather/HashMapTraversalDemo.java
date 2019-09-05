package my.myProject.gather;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTraversalDemo {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "kobe");
		map.put(2, "lbj");
		map.put(3, "jordan");
		System.out.println(map);
		

		//
		// 获取方法：
		// 第一种方式: 使用keySet
		// 需要分别获取key和value，没有面向对象的思想
		// Set<K> keySet() 返回所有的key对象的Set集合
		Set<Integer> kSet=map.keySet();
		Iterator<Integer> iterator = kSet.iterator();
		
		while (iterator.hasNext()) {
			Integer key =  iterator.next();
			String value =map.get(key);
			System.out.println("key="+key+",value="+value);
			
		}
		
		
		// 第二种方式：
				// 通过values 获取所有值,不能获取到key对象
				// Collection<V> values()
		Collection<String> vstr=map.values();
		Iterator<String> iterator2=vstr.iterator();
		
		while (iterator2.hasNext()) {
			String value = iterator2.next();
			System.out.println("value="+value);
			
		}
		
	
				
		// 第三种方式： Map.Entry对象 推荐使用 重点
		Set<Map.Entry<Integer, String>> set =map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> iterator3 =set.iterator();
		
		while (iterator3.hasNext()) {
			Map.Entry<Integer,String> entry = iterator3.next();
			
			Integer key=entry.getKey();
			String value=entry.getValue();
			
			System.out.println("key="+key+",value="+value);
			
		}
		
		
		
		
			
		

	}


}
