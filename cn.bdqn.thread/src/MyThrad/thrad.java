package MyThrad;

import java.sql.Time;
import java.util.jar.Attributes.Name;

/**
 * 
 * ��ɽ�
 * 
 * @author Larson
 *
 */
public class thrad extends Thread {

	private int Time;// ��100����ĕr�g
	public int num = 0;// �����ق�100��

	public thrad(String name, int time, int kilometer) {
		super(name);
		this.Time = time;
		this.num = kilometer * 1000 / 100;
	}

	@Override
	public void run() {

		while (num > 0) {
			try {
				Thread.sleep(this.Time);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"����100�ף�");
			num--;
		}
System.out.println(Thread.currentThread().getName()+"���_�K�c��");
	}
}
