package my.myProject.gather;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector vector =new Vector();
		vector.add("kobe");
		vector.add("lerbron");
		vector.add("jordan");
		
//		System.out.println(vector);
//		System.out.println(vector.elementAt(2));
		
		Enumeration ens=vector.elements();
		
		while (ens.hasMoreElements()) {
			System.out.print(ens.nextElement()+" ");
		}
		
		
	}


}
