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
		 * �����׶����ƶ�ȡ
		 */
		// ������������
		InputStream is = new FileInputStream("D:\\Hello.txt");
		// copy�κ��ļ�
		// ������
		DataInputStream dis = new DataInputStream(is);
		// д�������
		OutputStream out = new FileOutputStream("E:\\���.txt");
		DataOutputStream ois = new DataOutputStream(out);
		// ��ʱ��һ����������
		byte[] bytes = new byte[1024];
		int data = 0;// ����һ����Ч���ֽ���
		while ((data = dis.read(bytes)) != -1) {
			ois.write(bytes, 0, data);// ��ʾ��������ġ���Ч���ֽ���0������Ǵӿ�ʼ��0λ�ÿ�ʼ
		}
		ois.close();
		dis.close();
		out.close();
		is.close();
		System.out.println("Im,finy");

	}

}
