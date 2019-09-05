package my.myProject.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IOobjectOutputInputStreamDemo {

	public static void main(String[] args) throws IOException, Exception {
		
		Cat cat=new Cat("tom",3);
		FileOutputStream fos=new FileOutputStream(new File("d://c.txt"));
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(cat);
		System.out.println(cat);
		oos.close();
		
		FileInputStream fis=new FileInputStream(new File("d://c.txt"));
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Object readObject=ois.readObject();
		Cat cat2=(Cat) readObject;
		System.out.println(cat2);
		ois.close();
		
	}

}

class Cat implements Serializable{
	public String name;
	
	public int age;
	
	public Cat() {
		
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

	
	
}