package Map;

public class Animal {
	/**
	 * 
	 * �����Ա����
	 * 
	 */
	public int age;
	private String name;
	public static int source;

	public static void Prient() {
		System.out.println("Animal���о�̬�ڲ���");
	}

	/**
	 * 
	 * �ֲ��ڲ���
	 */
	public void eat(String foot) {
		/*// �ֲ��ڲ���
		class Hello {
			public void show1() {
				// ���Է��ʳ�Ա����
				System.out.println(foot);
			}
		}*/
		//new Hello().show1();
	}

	/**
	 * 
	 * ��Ա�ڲ���
	 */
	class Dog {
		public void show() {

			System.out.println(age);
			System.out.println(name);
			System.out.println("��Ա�ڲ���!!");
		}

	}

	/**
	 * 
	 * ��̬�ڲ���
	 * 
	 */
	static class master {

		public static void sta() {
			System.out.println(source);
			Prient();
		}
	}

}
