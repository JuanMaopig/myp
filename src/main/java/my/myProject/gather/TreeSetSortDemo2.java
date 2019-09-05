package my.myProject.gather;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSortDemo2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(new Book("think in java", 100));
		ts.add(new Book("java 核心技术", 75));
		ts.add(new Book("现代操作系统", 50));
		ts.add(new Book("java就业教程", 35));
		ts.add(new Book("think in java", 100));
		ts.add(new Book("ccc in java", 100));

		System.out.println(ts); 
	}

}

class MyComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		System.out.println(b1+" comparator "+b2);
		if (b1.getPrice() > b2.getPrice()) {
			return 1;
		}
		if (b1.getPrice() < b2.getPrice()) {
			return -1;
		}
		return b1.getName().compareTo(b2.getName());
	}

}


class Book {
	private String name;
	private double price;

	public Book() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(String name, double price) {

		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

}

