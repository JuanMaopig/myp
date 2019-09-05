package my.myProject.gather;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//使用迭代器清空集合
public class IteratorDemo {

	public static void main(String[] args) {
	Collection c=new ArrayList();
	
	c.add("kobe");
	c.add("lerbron");
	c.add("jordan");
	
	System.out.println(c);
	
	Iterator it =c.iterator();
	
	System.out.println(it);
	while(it.hasNext()) {
		it.next();
		it.remove();
	}
	System.out.println(c);
	}

	
	
	
}
