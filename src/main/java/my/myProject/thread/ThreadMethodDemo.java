package my.myProject.thread;

public class ThreadMethodDemo extends Thread{


	public ThreadMethodDemo(String name) {
		super(name);
	}
	
	

	@Override
	public void run() {
		int i=0;
		while(i<20) {
			i++;
			System.out.println(this.getName()+" "+":i="+i);
			System.out.println(Thread.currentThread().getName()+""+":i="+i);
			System.out.println(Thread.currentThread()==this);
			System.out.println("getId()"+""+":id="+super.getId());
			System.out.println("getPriority()"+""+":Priority="+super.getPriority());
		}
	}

	public static void main(String[] args) {
		ThreadMethodDemo t1=new ThreadMethodDemo("线程一");
		ThreadMethodDemo t2=new ThreadMethodDemo("线程二");
		
		t1.setName("狗");
		t2.setName("猫");
		
		t1.setPriority(10);
		t2.setPriority(5);
		
		System.out.println("max:"+Thread.MAX_PRIORITY);
		System.out.println("min:"+Thread.MIN_PRIORITY);
		System.out.println("nor:"+Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		System.out.println("Hello World!");
	}

	

}


