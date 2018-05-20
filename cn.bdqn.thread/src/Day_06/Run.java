package Day_06;

public class Run implements Runnable {
	private int meters = 1000;
	private boolean flog = false;// 记录是否跑完

	@Override
	public void run() {
		while (!flog) {
			saze();

		}

	}

	// 同步方法
	public synchronized void saze() {
synchronized (this) {
	if (meters <= 100) {
		flog = true;
		return;
	}
	System.out.println(Thread.currentThread().getName() + "拿到接力棒");
	for (int i = 0; i <100; i+=10) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "跑了" + (i + 10) + "米");

	}
	meters -= 100;
}
		
	}

}
