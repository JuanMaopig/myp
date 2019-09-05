package my.myProject.oop;

/*1：多态可以作为形参，接受范围更广的对象，避免函数重载过度使用。*/
public class OopPloyDemo1 {

	public static void main(String[] args) {
		print(new Cricle(2.0));
		print(new Rect2(2.0, 3.0));
			
	}
	
	public static void print(MyShape1 myShape1) {
//		if(myShape1 instanceof Cricle) {
//			Cricle cricle =(Cricle) myShape1;
//			System.out.println(cricle.getArea());
//			System.out.println(cricle.getLength());
//		}else if(myShape1 instanceof Rect2){
//			Rect2 rect2=(Rect2) myShape1;
//			
//			System.out.println(rect2.getArea());
//			System.out.println(rect2.getLength());
//		}
		System.out.println(myShape1.getArea());
		System.out.println(myShape1.getLength());
	}
	
}

/*
 * 1：定义功能，根据输出任何图形的面积和周长。 
 * 1：定义抽象类abstract MyShape 
 * 1：定义抽象方法public abstract double
 * getArea();getLength 
 */

abstract class MyShape1{
	
	public abstract double getArea();
	
	public abstract double getLength();
	
}
/*
 * 2：定义Rect类继承MyShape 
 * 1：定义长和宽成员变量，double width height;
 *  2：无参构造，有参构造。 
 *  3：实现父类方法。
 */
class Rect2 extends MyShape1{
	double Width;
	
	double Length;
	
	public Rect2() {
		super();
	}


	public Rect2(double width, double length) {
		this.Width = width;
		this.Length = length;
	}




	public double getArea() {
		return Width*Length;
	}
	
	public double getLength() {
		return Width*2+Length*2;
	}
}


/*
 * 3：定义Cricle类继承MyShape 
 * 1：定义半径成员变量，和PI常量 
 * 2：无参构造，有参构造 
 * 3：实现父类方法。
 */

class Cricle extends MyShape1{
	double r;
	
	static final double PI=3.14;
	
	
	
	public Cricle() {
		
	}
	

	public Cricle(double r) {
		this.r = r;
	}



	public double getArea() {
		return r*PI*r;
	}
	
	public double getLength() {
		return 2*PI*r;
	}
}
