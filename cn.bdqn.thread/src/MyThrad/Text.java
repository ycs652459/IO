package MyThrad;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Text {
public static void main(String[] args) {
	thrad thrad = new thrad("���p��", 500, 1);
	thrad thrad2 = new thrad("������", 1000, 1);
	System.out.println("**********�_ʼ��ɽ***************");
	thrad.start();
	thrad2.start();
}
}
