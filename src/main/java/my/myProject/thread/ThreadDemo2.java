package my.myProject.thread;

//创建线程的第二种方式.使用Runnable接口.
public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread thread =new MyThread();
		
		Thread t1=new Thread(thread,"票台1");
		Thread t2=new Thread(thread,"票台2");
		Thread t3=new Thread(thread,"票台3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class MyThread implements Runnable{	
	static int ticketNum=100;
	
	static Object key=new Object();
	public void run() {
		sell();
	}
	
	public static void sell() {		
		while (true) {
			synchronized (key) {
				if (ticketNum>0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"卖出第"+ticketNum+"张票");
					ticketNum--;
				} else {
					System.out.println("售罄了");
					break;
				}
			}
		}
	}

}