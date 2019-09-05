package my.myProject.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

//setProperty("键", "值");修改某个key的value
//prop.store();重新存储，提交修改
public class IOProperties {

	public static void main(String[] args) throws IOException {
		createProperties();
		readProperties();
	}

	private static void createProperties() throws IOException {
		//创建properties
		Properties prop=new Properties();
		//使用setProperty 建和值都得是、string
		prop.setProperty("lbj", "23");
		prop.setProperty("kobe", "24");
		prop.setProperty("jordan", "23");
		
		
		//使用properties生产配置文件
		prop.store(new FileWriter("d://a.properties"),"this is nba");
		//中文应该用字符流
		
	}
	private static void readProperties() throws IOException {
		//Properties是属于集合Map中
		Properties prop=new Properties();
		//prop加载
		prop.load(new FileReader("d://a.properties") );
		//使用Entry方法遍历
		Set<Entry<Object,Object>> entrys=prop.entrySet();
		//强循环遍历
		for(Entry<Object,Object> entry:entrys) {
			System.out.println("key"+entry.getKey()+"value"+entry.getValue());
		}
		//修改某个key的value
//		prop.setProperty("lbj","6");
		//重新存储，提交修改
//		prop.store(new FileWriter("d://a.properties"),"this is Nba2019");
		
	}


}
