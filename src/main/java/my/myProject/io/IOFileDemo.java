package my.myProject.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
createNewFile()	在指定位置创建一个空文件，成功就返回true，如果已存在就不创建然后返回false
mkdir()			在指定位置创建目录，这只会创建最后一级目录，如果上级目录不存在就抛异常。
mkdirs()		在指定位置创建目录，这会创建路径中所有不存在的目录。
renameTo(File dest)	重命名文件或文件夹，也可以操作非空的文件夹，文件不同时相当于文件的剪切,剪切时候不能操作非空的文件夹。移动/重命名成功则返回true，失败则返回false。

delete()		删除文件或一个空文件夹，如果是文件夹且不为空，则不能删除，成功返回true，失败返回false。
deleteOnExit()	在虚拟机终止时，请求删除此抽象路径名表示的文件或目录，保证程序异常时创建的临时文件也可以被删除

exists()		文件或文件夹是否存在。
isFile()		是否是一个文件，如果不存在，则始终为false。
isDirectory()	是否是一个目录，如果不存在，则始终为false。
isHidden()		是否是一个隐藏的文件或是否是隐藏的目录。
isAbsolute()	测试此抽象路径名是否为绝对路径名。

getName()		获取文件或文件夹的名称，不包含上级路径。
getPath()       返回绝对路径，可以是相对路径，但是目录要指定
getAbsolutePath()	获取文件的绝对路径，与文件是否存在没关系
length()		获取文件的大小（字节数），如果文件不存在则返回0L，如果是文件夹也返回0L。
getParent()		返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回null。
lastModified()	获取最后一次被修改的时间。
	文件夹相关：
staic File[] listRoots()	列出所有的根目录（Window中就是所有系统的盘符）
list()						返回目录下的文件或者目录名，包含隐藏文件。对于文件这样操作会返回null。
list(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
listFiles()					返回目录下的文件或者目录对象（File类实例），包含隐藏文件。对于文件这样操作会返回null。
listFiles(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。

*/
public class IOFileDemo {
	/*
	 获取所有的d:/music 即music目录下的所有文件和文件夹 
	 解题思路: 代码需要封装,就需要创建方法,并在main方法中调用和测试. 
	 方法名要有意义:
	 listAllFilesAndDirs 
	 第一步：创建File对象
	  第二步：查找File类中可用的方法，想要获取该目录下的所有子文件和子目录
	 第三步：显示这些文件和文件夹的名称
	 */
	public static void main(String[] args) {
	
		//list() 返回一个字符串数组
		//列出所有的子文件名与所有的子目录名
//		File file =new File("d://music");
		
//		String []names=file.list();
//		
//		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]);
//		}
		
		//listFiles()返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
		//列出所有的要求目录名与文件名分开列出
//		File file =new File("d://music");
//		
//		File[] names=file.listFiles();
//		
//		for(int i=0;i<names.length;i++) {
//			if(names[i].isFile()) {
//				System.out.println("子文件"+names[i].getName());
//			}else if(names[i].isDirectory()) {
//				System.out.println("子文件夹"+names[i].getName());
//			}
//		}
		//列出指定目录中所有的子文件名与所有的子目录名，要求目录名与文件名分开列出
//		// 1.创建File对象，表示这个目录
		File file =new File("d://music");
//		// 2通过listFiles方法得到所包含的所有子目录与子文件名称
		File[] names=file.listFiles();
//		//3,得到所有的文件名集合，与所有的文件夹名集合
		ArrayList<File> listFiles =new ArrayList<File>();
		ArrayList<File> listDirs =new ArrayList<File>();
		
		for(int i=0;i<names.length;i++) {
			if(names[i].isFile()) {
				listFiles.add(names[i]);
			}else if(names[i].isDirectory()) {
				listDirs.add(names[i]);
			}
		}
//		//4，分别显示文件名与文件夹名
		
		Iterator<File> it1=listFiles.iterator();
		System.out.println("文件名");
		while(it1.hasNext()) {
			System.out.println(it1.next().getName());
		}
		
		Iterator<File> it2=listDirs.iterator();
		System.out.println("文件夹名");
		while(it2.hasNext()) {
			System.out.println(it2.next().getName());
		}
	
		
//		方法一
	
//		方法二
//		

		/*
		  练习3，列出指定目录中所有扩展名为.txt的文件。
		   需求: 从指定目录中找到指定扩展名的文件，并列出来 思路
		    第一步:创建listAllFiles方法,接受路径和文件后缀名 
		    第二步: 获取所有的子文件和子文件夹 
		    第三步: 从中找出符合条件的文件并显示出来
		 */	
//		File file=new File("d://music");

//		ListAllFiles(file,"txt");
//		练习4
		/**
		 * FilenameFilter接口写一个工具类，可以传递指定的过滤规则。
		 *  从指定目录中找到指定扩展名的文件，并列出来
		 *
		 * */
		
		
//		File file1=new File("d://music");
//		ListAllFiles2(file1,"txt");
		
	
		

		
	}

	private static void ListAllFiles(File file ,String extension) {
		String[] names=file.list();
		
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith(extension)) {
				System.out.println(names[i]);
			}
		}
	}
	private static void ListAllFiles2(File file,String extension) {
		String[] names=file.list(new DirFilter(extension));
		
		for(int i=0;i<names.length;i++) {
				System.out.println(names[i]);
		}
	}


	
	
	
}

class DirFilter implements FilenameFilter{

	private String extension;
	
	public  DirFilter(String extension) {
		this.extension=extension;
	}
	
	public boolean accept(File dir, String name) {
		return name.endsWith(extension);
	}

	
}

