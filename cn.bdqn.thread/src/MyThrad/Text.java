package MyThrad;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Text {
public static void main(String[] args) {
	thrad thrad = new thrad("年輕人", 500, 1);
	thrad thrad2 = new thrad("老年人", 1000, 1);
	System.out.println("**********開始爬山***************");
	thrad.start();
	thrad2.start();
}
}
