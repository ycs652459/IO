package MyThrad;

import java.sql.Time;
import java.util.jar.Attributes.Name;

/**
 * 
 * 爬山類
 * 
 * @author Larson
 *
 */
public class thrad extends Thread {

	private int Time;// 爬100所需的時間
	public int num = 0;// 爬多少個100米

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
			System.out.println(Thread.currentThread().getName()+"爬完100米！");
			num--;
		}
System.out.println(Thread.currentThread().getName()+"到達終點！");
	}
}
