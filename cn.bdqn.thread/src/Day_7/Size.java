package Day_7;

public class Size implements Runnable {
	private int count = 10;
	private int num = 0;
	@Override
	public void run() {
		while (count>0) {
			synchronized (this) {
				if (count<=0) {
					break;
				}
				count--;
				num++;
				System.out.println("�̣߳�"+Thread.currentThread().getName()+"��������"+num+"ʣ��Ʊ��"+count);
				
			}
		}		
	}
	
}
