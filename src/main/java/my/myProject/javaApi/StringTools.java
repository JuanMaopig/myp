package my.myProject.javaApi;

/*获取字符串的方法
 int length()  获取字符串的长度
char charAt(int index) 获取特定位置的字符 (角标越界)
int indexOf(String str) 获取特定字符的位置(overload)
int lastIndexOf(int ch) 获取最后一个字符的位置

 */
/*判断方法
boolean endsWith(String str) 是否以指定字符结束
boolean isEmpty()是否长度为0 如：“” null V1.6
boolean contains(CharSequences) 是否包含指定序列 应用：搜索
boolean equals(Object anObject) 是否相等
boolean equalsIgnoreCase(String anotherString) 忽略大小写是否相等
*/
/*转换方法
String(char[] value) 将字符数组转换为字符串
String(char[] value, int offset, int count)
Static String valueOf(char[] data)
static String valueOf(char[] data, int offset, int count)
char[] toCharArray()  将字符串转换为字符数组
*/
/*其他方法
String replace(char oldChar, char newChar) 替换
String[] split(String regex) 切割
String substring(int beginIndex) 
String substring(int beginIndex, int endIndex)截取字串
String toUpperCase() 转大写
String toLowerCase() 转小写
String trim() 去除空格
*/


public class StringTools {
//需求
	public static void main(String[] args) {
//		String str1="   极限挑战    ";
//		System.out.println("去除空格之前");
//		System.out.println(str1);
//		
//		System.out.println("去除空格之后");
//		String reString=Strings.trim(str1);
//		System.out.println(reString);
		
//		String uploadFilePath="D:\\20120512\\day12\\Demo1.java";
//		String res=Strings.getFileName2(uploadFilePath);
//		System.out.println(res);
		
//		String string="hahahaha";
//		String res=Strings.reaverseString(string);
//		System.out.println(res);
		
		
	}

}

class Strings{
	
	private Strings() {
		
	}
	
//	1.	去除字符串两边空格的函数。 
	public static String trim( String str ){
	   
	   // 0、定义求字串需要的起始索引变量
	   int start = 0;
	   int end = str.length()-1;
	   // 1. for循环遍历字符串对象的每一个字符
	   for (int i = 0; i<str.length() ; i++ )
	   {
	        if ( str.charAt(i) == ' ' )
	        {
	             start++;
	        }else{
			
			     break;
			}
	   }
//	   System.out.println( start );
	   for (; end<str.length() && end >= 0;  )
	   {
	        if ( str.charAt(end) == ' ' )
	        {
	             end--;
	        }else{
			     break;
			}
	   }
//	   System.out.println( end );
	   // 2. 求子串
	   if( start < end ){
	     
		 return str.substring( start , (end+1) ); 
	   }else{
	     
		 return "_";
	   }
	}
	
//	2.	获取上传文件名  "D:\\20120512\\day12\\Demo1.java"。
	public static String getFileName2( String path ){
		  return path.substring( path.lastIndexOf("\\") + 1 );
		}
	
//	3.	将字符串对象中存储的字符反序。
	public static String reaverseString( String src ){
		
		   // 1. 将字符串转换为字符数组
		   char chs[] = src.toCharArray();
		   // 2. 循环交换
		   for ( int start = 0 , end = chs.length - 1; start < end ; start++,end-- )
		   {
			   // 3. 数据交换
			   char temp = chs[end];
			   chs[end] = chs[start];
			   chs[start] = temp;
		   }
		  // 4. 将字符数组转换为字符串
	       return new String( chs );
		}

//	4. 求一个子串在整串中出现的次数
	public static int getCount( String src , String tag ){ 
		  // 0. 定义索引变量和统计个数的变量
		  int index = 0;
		  int count = 0;	   
		  // 1. 写循环判断
		  while ( ( index = src.indexOf(tag) ) != -1 )   // jackjava
		  {
		   // 2. 求字串
		     System.out.println( src );
			 src = src.substring( index + tag.length() );   // index 4 + 4 = 8
		  System.out.print( src.length() + " : " + index + " :  " + tag.length() );
				   // 3. 累加
			 count++;
			   }
			   return count;
			}

	
	
}
