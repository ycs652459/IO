package Day_06;

public class Run implements Runnable {
	private int meters = 1000;
	private boolean flog = false;// ��¼�Ƿ�����

	@Override
	public void run() {
		while (!flog) {
			saze();

		}

	}

	// ͬ������
	public synchronized void saze() {
synchronized (this) {
	if (meters <= 100) {
		flog = true;
		return;
	}
	System.out.println(Thread.currentThread().getName() + "�õ�������");
	for (int i = 0; i <100; i+=10) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "����" + (i + 10) + "��");

	}
	meters -= 100;
}
		
	}

}
