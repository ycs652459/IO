package Day_7;



import java.util.*;

import MyThrad.thrad;

public class Text {
	public static void main(String[] args) {
		/*Size size = new Size();
	Thread thread = new Thread(size,"������");
	Thread thread2 = new Thread(size,"��ţ��");
	Thread thread3 = new Thread(size,"��ƮƮ");
	thread.start();
	thread2.start();
	thread3.start();*/
	/*	LinkedList linkedList = new LinkedList();
		linkedList.add("list");
		LinkedList ee = new ArrayList();
		List w = new LinkedList();
		int arr [] = {1,2,3,4};
		for (int i : arr) {
			System.out.print(i+";");
		}*/
		/*HashMap hm = new HashMap();
		hm.put(null, null);
		hm.put(null, null);
		hm.put("a", null);
		System.out.println(hm);*/
		Map<String, String> dMap = new HashMap<String,String>();
		for (int i = 0; i < 3; i++) {
			dMap.put(""+i, "sut"+i);
		}
		System.out.println(dMap.get("1"));
	}
}
