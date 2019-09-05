package my.myProject.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readTest();
	}

	private static void readTest(){
		FileInputStream fis=null;
		try {			
			File file =new File("d://a.txt");
			
			fis=new FileInputStream(file);
			
			byte[] buf=new byte[1024];
			
			int len=0;
			while((len=fis.read(buf))!=-1) {
				System.out.println(new String(buf,0,len));
			}
			
		}catch(IOException e) {
			throw new RuntimeException(e);
		}finally {
			try {
				if(fis!=null) {					
					fis.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}	
//		fis.close();
	}

}
