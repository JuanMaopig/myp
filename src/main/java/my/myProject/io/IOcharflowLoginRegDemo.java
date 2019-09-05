package my.myProject.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
练习： 缓冲输入输出字符流用户登陆注册...
	
*/
public class IOcharflowLoginRegDemo {

	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		while(true) {
			System.out.println("请选择功能:A(注册) ，B(登录)");
			String option=scanner.next();
			
			if("a".equalsIgnoreCase(option)) {
				reg();
			}else if("b".equalsIgnoreCase(option)){
				login();
			}else {
				System.out.println("非法操作");
			}
		}
		
		
	}
	private static void login() throws IOException {
		System.out.println("请输入账号");
		String name=scanner.next();
		
		System.out.println("请输入密码");
		String password=scanner.next();
		
		String info=name+" "+password;
		//读取文件的信息，查看是否有该用户的信息存在，如果存在则登陆成功。
		//建立数据的输入通道
		//建立缓冲输入字符流
		
		BufferedReader br=new BufferedReader(new FileReader("d:\\users.txt"));
		String line =null;
		
		boolean isLogin=false;
		
		while((line=br.readLine())!=null) {
			if(line.equals(info)) {
				isLogin=true;
				break;
			}
		}
		
		if(isLogin) {
			System.out.println("欢迎"+name+"登录成功...");
		}else {
			System.out.println("不存在该用户的信息，请注册");
		}
	}
	private static void reg() throws IOException {
		System.out.println("请输入用户名");
		String name=scanner.next();
		System.out.println("请输入密码");
		String password=scanner.next();
		
		String info =name+" "+password;
		//把用户的注册信息写到文件上
		File file=new File("d://users.txt");
		
		FileWriter fw=new FileWriter(file,true);
		
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write(info);
		bw.newLine();//换一行
		System.out.println("注册成功");
		bw.close();
	}

}
