package my.myProject.io;

import java.io.File;

/*
需求1：列出一个文件夹的子孙文件与目录。

2，列出指定目录中所有的子孙文件与子孙目录名，要求名称前面要有相应数量的空格：
		第一级前面有0个，第二级前面有1个，第三级前面有2个...，以此类推。

3，列出指定目录中所有的子孙文件与子孙目录名，要求要是树状结构，效果如下所示：
		|--src
		|   |--cn
		|   |   |--itcast
		|   |   |   |--a_helloworld
		|   |   |   |   |--HelloWorld.java
		|   |   |   |--b_for
		|   |   |   |   |--ForTest.java
		|   |   |   |--c_api
		|   |   |   |   |--Student.java
		|--bin
		|   |--cn
		|   |   |--itcast
		|   |   |   |--i_exception
		|   |   |   |   |--ExceptionTest.class
		|   |   |   |--h_linecount
		|   |   |   |   |--LineCounter3.class
		|   |   |   |   |--LineCounter2.class
		|   |   |   |   |--LineCounter.class
		|--lib
		|   |--commons-io.jar

需求4: 删除一个非空的文件夹。 
*/
public class IOrecursionDemo {

	public static void main(String[] args) {
		//列出一个文件夹与子孙文件夹的目录(递归让目录有结构)
//		File file1=new File("d://music");		
//		listFiles1(file1);
		
		//列出一个文件夹的子孙文件与目录。
//		File file2=new File("d://music");
//		listFiles2(file2,"|--");
		
		//列出一个有目录结构的
//		File file3=new File("d://music");
//		listFiles3(file3,"|--");
		
		//递归删除一个非空文件夹
		File path4=new File("d://c");
		deleteDir(path4);
		
		
		//创建一个带有父目录的的子目录
//		String path3="d://c//a//d//b//w";
//		File file=new File(path3);
//		System.out.println(file);
//		file.mkdirs();
		
//		makedirs(path3);
		
		
		

		
	}
	//创建子目录，并将子目录路径上所有未创建的父目录一并创建
	public static void makedirs(String path) {
		String []names=path.split("//");
		String str="";
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith(":")) {
				 str+=names[i];
			}else{
				str+="//"+names[i];
				new File(str).mkdir();
			}	
		}
	}
	
	//!5=5*4*3*2*1
	public static int print(int num){
		if(num==1){
			return 1;
		}else{
			return num*print(num-1);
		}
	}
	
	//列出一个文件夹的子孙文件与目录。
	public static void listFiles1(File dir){
		File[] names=dir.listFiles();
		
		for(File name:names) {
			if(name.isFile()) {
				System.out.println("文件"+name.getName());
			}else if(name.isDirectory()) {
				System.out.println("文件夹"+name.getName());
				listFiles1(name);
			}
		}
		
	}

	//列出一个文件夹的子孙文件与目录。space 存储的是空格
	public static void listFiles2(File dir,String space){ //space 存储的是空格
		File[] files=dir.listFiles();
		for(File file:files) {
			if(file.isFile()) {
				System.out.println(space+file.getName());
			}else if(file.isDirectory()) {
				System.out.println(space+file.getName());
				listFiles2(file,"|  "+space);
			}
		}	
	}
	
	public static void listFiles3(File dir,String space){ //space 存储的是空格
		File[] files = dir.listFiles(); //列出所有 的子文件
		for(File file : files){
			if(file.isFile()){
				System.out.println(space+file.getName());
			}else if(file.isDirectory()){
				System.out.println(space+file.getName());
				listFiles3(file,"|   "+space);
			}
			
		}
		
		
	}
	
	//删除了一个非空的目录
	public static void deleteDir(File dir){ // bb
		File[] files=dir.listFiles();
		
		for(File file:files) {
			if(file.isFile()) {
				file.delete();
			}else if(file.isDirectory()) {
				deleteDir(file);
			}
		}
		dir.delete();
	}







	
}
