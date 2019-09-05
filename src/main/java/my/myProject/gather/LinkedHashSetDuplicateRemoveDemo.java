package my.myProject.gather;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
//使用LinkedHashSet给ArrayList去重并保持顺序

public class LinkedHashSetDuplicateRemoveDemo {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		
		list.add("1");
		list.add("5");
		list.add("2");
		list.add("4");
		list.add("3");
		list.add("2");
		list.add("1");
		list.add("7");
		
		List<String> listWithoutDup=new ArrayList<String>(new LinkedHashSet<String>(list));
		
		System.out.println(list);
		System.out.println(listWithoutDup);
		
	}

}
