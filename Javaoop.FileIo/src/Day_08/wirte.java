package Day_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class wirte {

	public static void main(String[] args) throws Exception {

		// 第二套写入

		FileWriter writer = new FileWriter("D:\\Hello.txt", true);
		writer.write("你好中国");
		writer.close();
		System.out.println("ok");
		// 读出
		FileReader writer1 = new FileReader("D:\\Hello.txt");
		//定义一个缓存区
		char ch[] = new char[1024];
		int data = 0;//有效的字符数
		StringBuffer sut = new StringBuffer();//可以追加字符
		
		while ((data = writer1.read(ch))!=-1) {
			String temp = new String(ch,0,data);
			sut.append(temp);
			System.out.println("有效的字节数"+data);
			
		}
		System.out.println(sut.toString());
		writer1.close();
	}

}
