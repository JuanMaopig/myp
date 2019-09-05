package my.myProject.webCommunication;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSocketServer {

	public static void main(String[] args) throws Exception {
		//建立Tcp的服务端,并且监听一个端口。
		ServerSocket serverSocket = new ServerSocket(9090);
		//接受客户端的连接
		Socket socket  =  serverSocket.accept(); //accept()  接受客户端的连接 该方法也是一个阻塞型的方法，没有客户端与其连接时，会一直等待下去。
		//获取输入流对象，读取客户端发送的内容。
		InputStream inputStream = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = 0;
		length = inputStream.read(buf);
		System.out.println("服务端接收："+ new String(buf,0,length));
		
		//获取socket输出流对象，想客户端发送数据
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("客户端你好啊！".getBytes());
		
		
		//关闭资源
		serverSocket.close();
	}

}
