package my.myProject.thread;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		QQUpdate qq = new QQUpdate();
		Thread th = new Thread(qq, "qqupdate");
		th.setDaemon(true);
		th.start();
		System.out.println(th.isDaemon());
		System.out.println("hello world");
	}


}

class QQUpdate implements Runnable {
	int i = 0;

	public void run() {
		while (true) {

			System.out.println(Thread.currentThread().getName() + " 检测是否有可用更新");
			i++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (i == 100) {
				System.out.println("有可用更新，是否升级？");
				break;
			}
		}
	}
}
