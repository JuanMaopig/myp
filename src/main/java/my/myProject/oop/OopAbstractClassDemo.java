package my.myProject.oop;

/*
 2：抽象练习 
 1：定义抽象类MyShape（图形）
 1：定义抽象方法获取图形的长度和面积
 2：定义子类Rect继承父类MyShape   
 1：定义自身特有的长和宽（成员变量）  width height;
 2：实现父类未实现的函数。
 3：定义子类 Circle实现父类MyShape
 1：定义自身特有的半径和圆周率（使用常量）
 2：实现父类为实现的方法。

*/
public class OopAbstractClassDemo {

	public static void main(String[] args) {
		
	}

}

abstract class MyShape {

	abstract double getLen();

	abstract double getArea();

}

class Rect extends MyShape {
	double width;
	double height;

	Rect() {

	}

	Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getLen() {
		return 2 * (width + height);
	}

	double getArea() {
		return width * height;
	}
}

class Circle extends MyShape {
	double r;
	public static final double PI = 3.14;

	Circle() {

	}

	Circle(double r) {
		this.r = r;
	}

	double getLen() {
		return 2 * PI * r;
	}

	double getArea() {
		return PI * r * r;
	}
}

