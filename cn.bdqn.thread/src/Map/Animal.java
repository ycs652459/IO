package Map;

public class Animal {
	/**
	 * 
	 * 定义成员变量
	 * 
	 */
	public int age;
	private String name;
	public static int source;

	public static void Prient() {
		System.out.println("Animal类中静态内部类");
	}

	/**
	 * 
	 * 局部内部类
	 */
	public void eat(String foot) {
		/*// 局部内部类
		class Hello {
			public void show1() {
				// 可以访问成员变量
				System.out.println(foot);
			}
		}*/
		//new Hello().show1();
	}

	/**
	 * 
	 * 成员内部类
	 */
	class Dog {
		public void show() {

			System.out.println(age);
			System.out.println(name);
			System.out.println("成员内部类!!");
		}

	}

	/**
	 * 
	 * 静态内部类
	 * 
	 */
	static class master {

		public static void sta() {
			System.out.println(source);
			Prient();
		}
	}

}
