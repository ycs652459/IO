package cn.bdqn.thread;

public class ThreadDemo {
		
	public static void main(String[] args) {
		
		seetomorrow seetomorrow = new seetomorrow();
		
		MyThread T1 = new MyThread();
		T1.seetomorrow = seetomorrow;
		T1.start();
		
		MyThread1 T2 = new MyThread1();
		T2.seetomorrow = seetomorrow;
		T2.start();
		
		/**
		 * 
		 * ���߳�
		 *//*
		Thread t= Thread.currentThread();
		System.out.println("��ǰ���߳��ǣ�"+t.getName());
		t.setName("���");
		System.out.println("��ǰ���߳��ǣ�"+t.getName());*/
		/**
		 * 
		 * �̳�Thread�ഴ���߳�
		 */
		/*MyThread thread= new MyThread();
		
		//thread.start();
		thread.run();
		MyThread thread1= new MyThread();
		//thread1.start();
		thread1.run();*/
		 
		
		/**
		 * ʵ��Runnable�ӿڴ����߳�
		 * 
		 */
		
		/*MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		MyRunnable runnable1 = new MyRunnable();
		Thread thread1 = new Thread(runnable1);
		thread1.start();*/
	}
	
}
