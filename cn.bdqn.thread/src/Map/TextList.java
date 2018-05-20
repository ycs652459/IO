package Map;


import java.util.*;

public class TextList {

	public static void main(String[] args) {
		
		/**
		 * 静态内部类
		 */
		
		Animal.master master = new Animal.master();
		//访问方式1
		master.sta();
		
		//访问方式2
		Animal.master.sta();
		
		/**
		 * 
		 * 局部内部类
		 */
		
		Animal show1 = new Animal();
		show1.eat("局部内部类");
		
		
		
		/**
		 * 成员内部类
		 */
	Animal.Dog dog = new Animal(). new Dog();
	dog.show();
	}

}
