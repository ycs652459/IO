package MyThrad;
/**
 * 
 * 特需号
 * @author Larson
 *
 */
public class gotomo extends Thread {
	public int time;

	public gotomo(String name, int time) {
		super(name);
		this.time = time;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + i + "号病人在看病！");
		}
	}
}
