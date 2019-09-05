package my.myProject.io;

import java.util.Arrays;

/*
编码与解码 
 
 编码： 把看得懂的字符变成看不懂码值这个过程我们称作为编码。
 
解码： 把码值查找对应的字符，我们把这个过程称作为解码。

注意： 以后编码与解码一般我们都使用统一的码表。否则非常容易出乱码。

 */
public class IOCodingDeCodingDemo {

	public static void main(String[] args) throws Exception {
//		String str="中国";
//		byte[] buf =str.getBytes("utf-8");//默认编码是gbk
//		System.out.println("数组的元素:"+Arrays.toString(buf));
//		
//		str=new String(buf,"utf-8");//默认使用了gbk码表去解码
//		System.out.println("解码后的字符串"+str);
		
//		String str1="a中国";
//		byte[] buf1 = str1.getBytes("unicode");
//		System.out.println("数组的内容:"+Arrays.toString(buf1));
//		
//		str1= new String(buf1,"unicode");
//		System.out.println("解码后的字符串"+str1);
		 
		String str ="ada";
		byte[] buf =str.getBytes();
		System.out.println("字节数组："+Arrays.toString(buf));//[-27, -92, -89, -27, -82, -74, -27, -91, -67]
		
		str = new String(buf,"iso8859-1");
		//乱码还原，并不是所有的乱码都可以被还原
		byte[] buf2=str.getBytes("iso8859-1");
		str = new String(buf2,"gbk");
		
		System.out.println(str);
	}

}
