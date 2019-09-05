package my.myProject.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOcharflowWriterDemo {

	public static void main(String[] args) throws IOException {
		String path = "d:/c.txt";

		writeToFile(path);

	}

	private static void writeToFile(String path) throws IOException {
		Writer writer = new FileWriter(path);
//		Writer writer1 = new FileWriter(path,true);默认的FileWriter方法新值会覆盖旧值，想要实现追加功能需要使用如下构造函数创建输出流 append值为true即可。

		writer.write('中');
//		writer.flush();//程序执行完毕打开文件,发现没有内容写入,相当于close
		writer.write("世界".toCharArray());
		writer.write("中国");

		writer.close();

	}

}
