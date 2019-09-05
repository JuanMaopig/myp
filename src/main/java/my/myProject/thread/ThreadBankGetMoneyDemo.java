package my.myProject.thread;

public class ThreadBankGetMoneyDemo {

	static int money=2000;
	
	public void ATM(int money) {
		ThreadBankGetMoneyDemo.money-=money;
		System.out.println("A取走了"+money+"还剩"+ThreadBankGetMoneyDemo.money);
	}
	
	public void Count(int money) {
		ThreadBankGetMoneyDemo.money-=money;
		System.out.println("B取走了"+money+"还剩"+ThreadBankGetMoneyDemo.money);
	}
	
	public static void main(String[] args) {
		ThreadBankGetMoneyDemo bank=new ThreadBankGetMoneyDemo();
		
		PersonA personA= new PersonA(bank);
		PersonB personB= new PersonB(bank);
		
		personA.start();
		personB.start();
	}

}


class PersonA extends Thread{
	ThreadBankGetMoneyDemo bank;
	
	public PersonA(ThreadBankGetMoneyDemo bank) {
		this.bank=bank;
	}
	
	@Override
	public void run() {
		while (ThreadBankGetMoneyDemo.money>=200) {
				bank.ATM(200);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class PersonB extends Thread{
	ThreadBankGetMoneyDemo bank;
	
	public PersonB(ThreadBankGetMoneyDemo bank) {
		this.bank=bank;
	}
	
	@Override
	public void run() {
		while (ThreadBankGetMoneyDemo.money>=100) {
			bank.Count(100);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


