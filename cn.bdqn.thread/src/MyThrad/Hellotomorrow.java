package MyThrad;

/**
 * 
 * 
 * @author Larson
 *
 */
public class Hellotomorrow extends Thread {
	@Override
	public void run() {
		System.out.println("���̣߳�"+Thread.currentThread().getName());
	}
}
