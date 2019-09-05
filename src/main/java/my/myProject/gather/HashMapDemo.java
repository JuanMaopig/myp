package my.myProject.gather;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map= new HashMap<String, String>();
		
		//添加方法
		map.put("name", "kobe");
		map.put("num", "24");
		map.put("position","sg");
//		
//		System.out.println("返回值"+map.put("position","sf"));
		Map<String, String > map2=new HashMap<String, String>();
		map2.put("team", "lakers");
		map2.put("draft", "13");
		map2.put("hash","gyp");
		
		map.putAll(map2);
//		System.out.println("delete"+map.remove("hash"));
//		System.out.println("player"+map);
		System.out.println("player"+map);
//		System.out.println(map.get("shud"));
//		map.clear();
//		System.out.println(map.isEmpt\y());
		
//		System.out.println(map.containsKey("name"));
//		System.out.println(map.containsValue("24"));
		System.out.println(map.size());
		
	}

}
