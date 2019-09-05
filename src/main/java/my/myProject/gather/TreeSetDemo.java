package my.myProject.gather;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("ccc");
		ts.add("aaa");
		ts.add("ddd");
		ts.add("bbb");

		System.out.println(ts); // [aaa, bbb, ccc, ddd]

	}


}
