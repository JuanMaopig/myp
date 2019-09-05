package my.myProject.gather;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;



/*

作业2：使用集合实现注册登陆功能，

第一步： 提示用户选择功能， A（注册）  B(登陆) 。 要求： 功能选择 的时候要忽略大小写。

注册：
	1. 提示用户输入注册的账号(数字)与密码，如果输入账号已经存在集合中，提示用户重新输入。 注册完毕之后，把集合中的所有用户信息打印出来。(使用：toArrry()方法)	
登陆： 
	提示用户输入登陆的账号与密码,如果账号与密码这个用户已经存在集合中，那么登陆成功，否则登陆失败。
 
 
 
 */
public class ArrayListImpClassDemo {

		static Scanner scanner=new Scanner(System.in);
		
		static Collection<User> users =new ArrayList<User>();
		
		public static void main(String[] args) {
			
			while (true) {
				System.out.println("请输入命令 (a)登录 (b)注册");	
				String option=scanner.next();				
				if("a".equalsIgnoreCase(option)) {
					login();
				}else if ("b".equalsIgnoreCase(option)) {
					reg();
				}else {
					System.out.println("非法操作");
				}
				
			}
			
		}
	
	public static void login() {//实现登录的功能
		System.out.println("请输入账号");
		int id=scanner.nextInt();
		System.out.println("请输入密码");
		String password =scanner.next();
		
		boolean isLogin=false;
		
		Iterator<User> iterator=users.iterator();
		while (iterator.hasNext()) {
			User user =  iterator.next();
			if(user.getId()==id&&user.getPassword().equals(password)) {
				isLogin=true;
			}
		}
		
		if (isLogin) {
			System.out.println("登录成功!");
		}else {
			System.out.println("登录失败，请重新登录！");
		}	
		
	}
	
	public static void reg() {//注册的功能
		
		User user =null;
		while (true) {
			System.out.println("请输入账号");	
			int id=scanner.nextInt();
			
			user =new User(id,null);
			
			if(users.contains(user)) {
				System.out.println("该账号已存在，重新输入账号");
			}else {
				break;
			}	
		}
		
		System.out.println("请输入密码");
		String password = scanner.next();
		
		user.setPassword(password);
		
		users.add(user);
		
		System.out.println("注册成功!");
		System.out.println("当前注册用户"+users);
		
		
		
	
	
	}
	
	
}

/*

用户类：
id(Integer)
password(String) 
有参无参
 getter setter
 equals toString
 */
//用户
class User{
	
	private int id;
	
	private String password;

	
	
	public User() {
		
	}


	public User(int id, String password) {
		this.id = id;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return " {账号=" + id + ", 密码=" + password + "}";
	}


	@Override
	public boolean equals(Object obj) {
		User user=(User) obj;
		return this.id==user.id;
	}
	
}