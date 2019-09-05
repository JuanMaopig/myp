package my.myProject.javaApi;

import java.util.Random;
//static double ceil(double a);向上取整
//static double floor(double a);向下取整
//static long round(double a);四舍五入
//static double random();0.0<= x <1.0

//练习：生成一个随机码
public class MathDemo {

	public static void main(String[] args) {
		Random random =new Random();
		char chs[]=new char[] {'a','b','c','F','H','3','6'};
		
		StringBuilder rel=new StringBuilder("");
		
		for(int i=0;i<4;i++) {
			rel.append(chs[random.nextInt(chs.length)]);
		}
		
		System.out.println("校验码是:"+rel.toString());
		
	}

}
