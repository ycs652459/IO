package cn.bdqn.thread;

public class MyRunnable implements Runnable {
	public seetomorrow seetomorrow;
@Override
public void run() {
	for(int i = 0;i<100;i++){
		seetomorrow.print();
		//System.out.println(i+".ÄãºÃ,"+Thread.currentThread().getName()+":"+i);
	}
	
}
}
