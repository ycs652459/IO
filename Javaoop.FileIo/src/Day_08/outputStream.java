package Day_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;

/**
 * @author Mr. Yang
 * @date 2018年5月21日
 */
public class outputStream {

	public static void main(String[] args) throws IOException {
/**
 * 运用FileoutputSteam写入
 * 
 */
		// 创建输入流的对象
		FileOutputStream out = new FileOutputStream("D:\\我的青春我做主.txt", true);
		String string = "naver give up java！！";
		// 一个缓存区
		byte[] bytes = string.getBytes();// 字节数组
		out.write(bytes, 0, bytes.length);		
		out.close();
		Scanner input1 = new Scanner(System.in);
		System.out.println("已经添加成功！Whether to take the next step.(y/n)?");
		
		/**
		 *  运用FilInputputSteam读出
		 * 
		 */
		
		String next = input1.nextLine();
		if (next.equals("y")) {
			FileInputStream input = new FileInputStream("D:\\我的青春我做主.txt");
			//data:read()返回的是本次读取到缓存区中的有效字节数 
			int data = 0;//有效的字符数,用来接收读取到的数据。
			byte byt[] = new byte[1024];
			StringBuffer str = new StringBuffer();
			while ((data = input.read(byt))!= -1) {
				String temp = new String(byt, 0, data);
				str.append(temp);		
			}
			System.out.println(str.toString());
			input.close();
			
			System.out.println("ok");
		}
		//先读到文件
		FileInputStream fis = new FileInputStream("D:\\我的青春我做主.txt");
		//然后写到另一个文件夹
		FileOutputStream fos = new FileOutputStream("D:\\Hello.txt",true);
		//创建中专站数组，存放每次读取内容
		byte wors[] = new byte[1024];
		while (fis.read()!=-1) {
			fis.read(wors);
			fos.write(wors, 0, wors.length);
			
		}
		fos.close();
		fis.close();
		System.out.println("赋值成功");
	}

}
