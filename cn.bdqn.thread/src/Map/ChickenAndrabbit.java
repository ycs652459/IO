package Map;

public class ChickenAndrabbit {

	public static void main(String[] args) {
		// 总共有50只
		for (int i = 0; i <=50; i++) {
			//
			
			int x = 50-i;
			if (i*2+x*4==120) {
				System.out.println(x);
				System.out.println(i);
			}
		}
		
		for (int i = 1000; i < 1500; i++) {
			if (i%3 == 2&&i%5==4&&i%7 == 6) {
				System.out.println(i);
			}
		}
	}
}
