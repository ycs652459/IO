package MyThrad;

import javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction;
/**
 * 
 * ��ͨ
 * @author Larson
 *
 */
public class gotomorrow extends Thread {
	public String puto;
	public String tehao;
	public int time;

	public gotomorrow(String name, int time) {
		super(name);
		this.time = time;
	}
gotomo go = new gotomo("�����", 500);
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
try {
	Thread.sleep(this.time);
} catch (InterruptedException e) {
	
	e.printStackTrace();
}
if (i==10) {
	try {
		go.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	System.out.println(go.getName()+i+"�Ų����ڿ�����");
}
System.out.println(Thread.currentThread().getName()+i+"�Ų����ڿ�����");
		}
	}
}
