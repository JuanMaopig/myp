package my.myProject.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class IOPropertiesDemo {
	/*
	 
	 需求： 使用properties实现本软件只能 运行三次，超过了三次之后就提示购买正版，退jvm.
	 
	 */
	
		public static void main(String[] args) throws IOException {
			//找到配置文件路径
			File file =new File("d://count.properties");
			//如果配置文件不存在，则创建该配置文件
			if(!file.exists()) {
				file.createNewFile();
			}
			
			//创建Properties对象。
			Properties prop=new Properties();
			//把配置文件的信息加载到properties中
			prop.load(new FileInputStream(file));
			
			 //定义该变量是用于保存软件的运行次数的。
			int count=0;
			//读取配置文件的运行次数
			String value=prop.getProperty("count");
			//判断是否为空
			if(value!=null) {
				count=Integer.parseInt(value);
			}
			
			
			//判断使用的次数是否已经达到了三次，
			if(count==3) {
				System.out.println("本产品已经到达使用上限");
				System.exit(0);
			}
			//count计数器增加
			count++;
			
			//输出使用了多少次
			System.out.println("你已经使用本产品"+count+"次");
			//提交修改count的value
			prop.setProperty("count", count+"");
			//使用Properties生成一个配置文件
			prop.store(new FileOutputStream(file), "this is config");
			

			
		}

	}
