package my.myProject.webCommunication;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPdemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address=InetAddress.getLocalHost();
		//IP类 InetAddress获取本机的IP地址		
		System.out.println(address.getHostAddress());
		//返回一个Ip字符串的或者是主机名生成的一个IP地址对象
		System.out.println(address.getHostName());
		//返回计算机的主机名
	}
	
	

}
