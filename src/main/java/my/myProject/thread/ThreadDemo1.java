package my.myProject.thread;

//三个看台卖100张票
public class ThreadDemo1 extends Thread{
	
	public static int ticketNum=100;
	
	static Object o=new Object();

	public ThreadDemo1(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		ThreadDemo1 threadDemo1=new ThreadDemo1("票台1");
		ThreadDemo1 threadDemo12=new ThreadDemo1("票台2");
		ThreadDemo1 threadDemo13=new ThreadDemo1("票台3");
		
		threadDemo1.start();
		threadDemo12.start();
		threadDemo13.start();
	}
	
	public static void sellt() {
		while (true) {
			synchronized (o) {				
				if (ticketNum>0) {
					try {
						sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(currentThread().getName()+"卖出第"+ticketNum+"张票");
					ticketNum--;
				} else {
					System.out.println("票已经售罄");
					break;
				}
			}
		}
	}
	
	@Override
	public void run() {
		sellt();
	}

}
