package cn.bdqn.thread;

public class MyThread extends Thread {
	
	public seetomorrow seetomorrow;
@Override
public void run() {
	for(int i = 0; i<100;i++){
		
		seetomorrow.print();
		//System.out.println(Thread.currentThread().getName()+":"+i);
		
	}
}
}
