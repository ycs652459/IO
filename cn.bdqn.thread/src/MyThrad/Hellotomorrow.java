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
		System.out.println("×ÓÏß³Ì£º"+Thread.currentThread().getName());
	}
}
