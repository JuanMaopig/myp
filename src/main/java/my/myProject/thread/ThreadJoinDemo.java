package my.myProject.thread;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		JoinThread jt = new JoinThread();
		Thread th = new Thread(jt, "one");
		th.start();
		int i = 0;
		while (i < 200) {
			if (i == 100) {
				th.join();
			}
			System.err.println(Thread.currentThread().getName() + " i:" + i);
			i++;

		}
	}


}



class JoinThread implements Runnable {

	public void run() {
		int i = 0;
		while (i < 300) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " i:" + i);
			i++;
		}
	}
}

