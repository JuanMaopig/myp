package my.myProject.thread;
//创建线程的方式一
public class CreateThreadDemo1 extends Thread{
	
	public CreateThreadDemo1(String name) {
		super(name);
	}
	
	
	public static void main(String[] args) {
		CreateThreadDemo1 c1=new CreateThreadDemo1("哥哥");
		CreateThreadDemo1 c2=new CreateThreadDemo1("妹妹");
		
		c1.start();
		c2.start();
		
	}
	
	
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				sleep(100);
				System.out.println(getName()+"");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
