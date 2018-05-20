package MyThrad;

public class seetomorrow {

	public static void main(String[] args) {
	System.out.println("******顯示默認优先级*****");
	Thread thread = Hellotomorrow.currentThread();
	System.out.println("主线程名："+thrad.currentThread().getName()+"，优先级为："+thread.getPriority());
	Hellotomorrow hellotomorrow = new Hellotomorrow();
	System.out.print(hellotomorrow.getName()+"，优先级为："+hellotomorrow.getPriority());
	
	
	
	System.out.println("\n******顯示修改优先级*****");
	Thread thread1 = new Thread();
	thread1.setPriority(Thread.MAX_PRIORITY);	
	System.out.println("主线程名："+Thread.currentThread().getName()+"，优先级为："+thread1.getPriority());
	
	Hellotomorrow hellotomorrow1 = new Hellotomorrow();
	hellotomorrow1.setPriority(Thread.MIN_PRIORITY);
	System.out.print("优先级："+hellotomorrow1.getPriority());
	hellotomorrow.start();
	}

}
