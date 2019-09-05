package my.myProject.thread;

public class ThreadStopDemo {

	public static void main(String[] args) {
		StopThread d1=new StopThread();
		
		Thread t1=new Thread(d1, "线程");
		
		t1.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main i:" + i);
			if (i == 50) {	
				d1.flag = false;
			}
		}		
	}


}

class StopThread implements Runnable{
	public boolean flag=true;
	Object key=new Object();
	
	public void run() {
		int i=0;
		while (flag) {
			synchronized (key) {				
				i++;
				System.out.println("我是"+Thread.currentThread().getName()+i);
			}
		}
	}
}