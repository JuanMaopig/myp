package my.myProject.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class IOsequenceInputStream {

	public static void main(String[] args) throws IOException {
		merge3();
		merge2();
	}
	
	//把三个文件合并成一个文件
	public static void merge3() throws IOException{
		//找到目标文件
		File file1 = new File("d:\\a.txt");
		File file2 = new File("d:\\b.txt");
		File file3 = new File("d:\\c.txt");
		File file4 = new File("d:\\d.txt");
		
		
		//建立对应 的输入输出流对象
		FileOutputStream fileOutputStream = new FileOutputStream(file4);
		FileInputStream fileInputStream1 = new FileInputStream(file1);
		FileInputStream fileInputStream2 = new FileInputStream(file2);
		FileInputStream fileInputStream3 = new FileInputStream(file3);

		//创建序列流对象
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		vector.add(fileInputStream1);
		vector.add(fileInputStream2);
		vector.add(fileInputStream3);
		Enumeration<FileInputStream> e = vector.elements();

		SequenceInputStream sequenceInputStream = new SequenceInputStream(e);
		
		//读取文件数据
		byte[] buf = new byte[1024];
		int length = 0; 
		
		while((length = sequenceInputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		
		//关闭资源
		sequenceInputStream.close();
		fileOutputStream.close();
		
	}
	
	
	
//	使用SequenceInputStream合并文件。
	public static void merge2() throws IOException{
		//找到目标文件
		File inFile1 = new File("d:\\a.txt");
		File inFile2 = new File("d:\\b.txt");
		File outFile = new File("d:\\c.txt");
		//建立数据的输入输出通道
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		//建立序列流对象
		SequenceInputStream inputStream = new SequenceInputStream(fileInputStream1,fileInputStream2);
		byte[] buf = new byte[1024];
		int length = 0 ; 
		
		while((length = inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//关闭资源
		inputStream.close();
		fileOutputStream.close();

	}
	
	
	//需求：把a.txt与b.txt 文件的内容合并。
	public static void merge1() throws IOException{
		//找到目标文件
		File infile1=new File("d://a.txt");
		File infile2=new File("d://b.txt");
		File outfile=new File("d://c.txt");
		//建立数据的输入输出通道
		FileInputStream fis1=new FileInputStream(infile1);
		FileInputStream fis2=new FileInputStream(infile2);
		
		FileOutputStream fos=new FileOutputStream(outfile);
		
		//把输入流存储到集合中，然后再从集合中读取
		ArrayList<FileInputStream> list =new ArrayList<FileInputStream>();
		list.add(fis1);
		list.add(fis2);
		
		//准备一个缓冲数组
		byte[] buf =new byte[1024];
		
		int len=0;
		
		for(int i=0;i<list.size();i++) {
			FileInputStream fis=list.get(i);
			while((len=fis.read(buf))!=-1) {
				fos.write(buf,0,len);
			}
			//关闭资源
			fis.close();
		}
		fos.close();
		
	
		
		
	}

}

