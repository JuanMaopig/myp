package my.myProject.webCommunication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSocketSenderTwo {
	public static void main(String[] args) throws IOException {
		//建立udp的服务
		DatagramSocket datagramSocket=new DatagramSocket();
		//准备数据，把数据封装到数据包中。
		String data="{\"deviceId\":1}";
		//创建了一个数据包
		DatagramPacket packet=new DatagramPacket(data.getBytes(),data.getBytes().length,new InetSocketAddress("192.168.10.187",52762));
		//调用udp的服务发送数据包
		datagramSocket.send(packet);
		//关闭资源 ---实际上就是释放占用的端口号
		datagramSocket.close();
	}
}
