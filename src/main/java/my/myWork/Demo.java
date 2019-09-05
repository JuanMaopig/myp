package my.myWork;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		 int n=100;       //定义一个整型变量n
	     int array[]=new int[n];     //创建一个长度为n的定长数组 
	     Scanner arr=new Scanner(System.in);//用Scanner类获取控制台的输入
	     System.out .println("请输入100个数字(用空格隔开)：");//显示台输出提示--请输入10个数字(用空格隔开)：
	     //用for循环逐一获取控制台输入的十个数字赋值给数组array
	     for(int i=0;i<array.length;i++) //定义变量当i=0,当i<数组长度时，执行循环语句，否则跳出；每执行一次i=1+1
	     {
	         array[i]=arr.nextInt();//接受控制台输入的数字给数组array赋值
	     }
	      System.out.println();//显示台输出一个空白行用于作间隔
	     System.out.print("排序前数组： ");//显示台输出提示--排列前数组：
	     //用for循环逐一提取显示数组array的元素
	      for(int i=0;i<array.length;i++)//定义变量当i=0,当i<数组长度时，执行循环语句，否则跳出；每执行一次i=1+1
	      {
	            System.out.print(array[i]+" ");//显示台输出数组array的元素，中间用"空格"隔开
	        }

	      int temp;  
	      for(int i=0;i<array.length;i++) 
	      {
	          for(int j=i+1;j<array.length;j++)  
	          {  
	              if(array[i]>array[j])
	              {
	                  temp=array[i]; 
	                  array[i]=array[j]; 
	                  array[j]=temp;
	              }
	          }
	      }
	      System.out.println();  
	      System.out.print("\n排序后数组： "); 
	      for(int i=0;i<array.length;i++)
	      {
	          System.out.print(array[i]+" ");//显示台输出数组array的元素，中间用"空格"隔开
	      }
		
	}
	


}
