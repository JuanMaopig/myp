package my.myProject2.junit;

import java.io.FileInputStream;
import java.io.IOException;

public class JunitTest2 {

	//准备测试的环境
		//@Before
		public static void beforeRead(){
			System.out.println("准备测试环境成功...");
		}
		
		
		//读取文件数据，把把文件数据都
		public void readFile() throws IOException{
			FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
			int content  = fileInputStream.read();
			System.out.println("内容："+content);
		}
		
		
		public void sort(){
			System.out.println("读取文件数据排序..");
		}

		
		//清理测试环境的方法
//		@After 
		public static void afterRead(){
			System.out.println("清理测试环境..");
		}

}
