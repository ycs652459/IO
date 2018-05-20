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
		 * 主线程
		 *//*
		Thread t= Thread.currentThread();
		System.out.println("当前的线程是："+t.getName());
		t.setName("你好");
		System.out.println("当前的线程是："+t.getName());*/
		/**
		 * 
		 * 继承Thread类创建线程
		 */
		/*MyThread thread= new MyThread();
		
		//thread.start();
		thread.run();
		MyThread thread1= new MyThread();
		//thread1.start();
		thread1.run();*/
		 
		
		/**
		 * 实现Runnable接口创建线程
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
