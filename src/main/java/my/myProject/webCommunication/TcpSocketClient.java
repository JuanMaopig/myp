package my.myProject.webCommunication;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpSocketClient {

	public static void main(String[] args) throws IOException {
		//建立tcp的服务
		Socket socket=new Socket(InetAddress.getLocalHost(),9090);
		//获取到Socket的输出流对象
		OutputStream os=socket.getOutputStream();
		//利用输出流对象把数据写出即可。
		os.write("服务端你好".getBytes());
		
		//获取到输入流对象，读取服务端回送的数据。
		InputStream is=socket.getInputStream();
		
		byte[] buf=new byte[1024];
		int len=is.read(buf);
		System.out.println("客户端收到的数据"+new String(buf,0,len));
		
		
		//关闭资源
		socket.close();
	}

}
