package MyThrad;

public class seetomorrow {

	public static void main(String[] args) {
	System.out.println("******�@ʾĬ�J���ȼ�*****");
	Thread thread = Hellotomorrow.currentThread();
	System.out.println("���߳�����"+thrad.currentThread().getName()+"�����ȼ�Ϊ��"+thread.getPriority());
	Hellotomorrow hellotomorrow = new Hellotomorrow();
	System.out.print(hellotomorrow.getName()+"�����ȼ�Ϊ��"+hellotomorrow.getPriority());
	
	
	
	System.out.println("\n******�@ʾ�޸����ȼ�*****");
	Thread thread1 = new Thread();
	thread1.setPriority(Thread.MAX_PRIORITY);	
	System.out.println("���߳�����"+Thread.currentThread().getName()+"�����ȼ�Ϊ��"+thread1.getPriority());
	
	Hellotomorrow hellotomorrow1 = new Hellotomorrow();
	hellotomorrow1.setPriority(Thread.MIN_PRIORITY);
	System.out.print("���ȼ���"+hellotomorrow1.getPriority());
	hellotomorrow.start();
	}

}
