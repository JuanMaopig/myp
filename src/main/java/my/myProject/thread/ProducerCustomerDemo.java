package my.myProject.thread;

//生产者消费者实例，利用线程的同步和唤醒机制来实现生产者消费者实例,要求生产一种水果就消费一种水果
public class ProducerCustomerDemo {

	public static void main(String[] args) {
		Product p=new Product();
		
		Producer producer=new Producer(p);
		Customer customer=new Customer(p);
		
		Thread thread=new Thread(producer, "生产者");
		
		Thread thread2=new Thread(customer, "消费者");
		
		thread.start();
		thread2.start();
		
//		producer.start();
//		customer.start();
	}

}
class Product{
	
	
	String name;
	
	double price;
	
	boolean flag=false;//状态量
	
}

class Producer implements Runnable{
	Product p;
	
	public Producer(Product p) {
		this.p=p;
	}
	
	public void run() {
		int i=0;
		while (true) {
			synchronized (p) { 
			if(p.flag==false) {	
				if(i%2==0) {
					p.name="香蕉";
					p.price=2.5;
				}else {
					p.name="苹果";
					p.price=6;
				}
				i++;
				System.out.println("生产者生产了一个"+p.name+"价格:"+p.price);
				p.flag=true;
				p.notify();
				}else {
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

class Customer implements Runnable{
	Product p;
	
	public Customer(Product p){
		this.p=p;
	}
	
	public void run() {
		while (true) {			
			synchronized (p) {
				if(p.flag==true) {
					System.out.println("消费者消费了一个"+p.name+"价格"+p.price);
					p.flag=false;
					p.notify();
				}else {
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	 	
}
