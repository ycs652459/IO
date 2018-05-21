package fourData;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDatainputoutStream {

	public static void main(String[] args) throws Exception {

		/**
		 * 
		 * 第四套二进制读取
		 */
		// 创建流的桥梁
		InputStream is = new FileInputStream("D:\\Hello.txt");
		// copy任何文件
		// 二进制
		DataInputStream dis = new DataInputStream(is);
		// 写入的桥梁
		OutputStream out = new FileOutputStream("E:\\你好.txt");
		DataOutputStream ois = new DataOutputStream(out);
		// 临时的一个缓存区域
		byte[] bytes = new byte[1024];
		int data = 0;// 定义一个有效的字节数
		while ((data = dis.read(bytes)) != -1) {
			ois.write(bytes, 0, data);// 显示缓存区域的。有效的字节数0代表的是从开始的0位置开始
		}
		ois.close();
		dis.close();
		out.close();
		is.close();
		System.out.println("Im,finy");

	}

}
