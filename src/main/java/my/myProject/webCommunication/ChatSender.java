package my.myProject.webCommunication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatSender extends Thread{

	@Override
	public void run() {
		try {
			//建立udp的服务
			DatagramSocket socket = new DatagramSocket();
			//准备数据，把数据封装到数据包中发送
			BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			DatagramPacket packet  = null;
			while((line = keyReader.readLine())!=null){
				//把数据封装 到数据数据包中，然后发送数据。
				packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("192.168.10.157"), 9090);
				//把数据发送出去 
				socket.send(packet);
			}
			//关闭 资源
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
			
	
	}
}
