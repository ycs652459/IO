package Day_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;

/**
 * @author Mr. Yang
 * @date 2018��5��21��
 */
public class outputStream {

	public static void main(String[] args) throws IOException {
/**
 * ����FileoutputSteamд��
 * 
 */
		// �����������Ķ���
		FileOutputStream out = new FileOutputStream("D:\\�ҵ��ഺ������.txt", true);
		String string = "naver give up java����";
		// һ��������
		byte[] bytes = string.getBytes();// �ֽ�����
		out.write(bytes, 0, bytes.length);		
		out.close();
		Scanner input1 = new Scanner(System.in);
		System.out.println("�Ѿ���ӳɹ���Whether to take the next step.(y/n)?");
		
		/**
		 *  ����FilInputputSteam����
		 * 
		 */
		
		String next = input1.nextLine();
		if (next.equals("y")) {
			FileInputStream input = new FileInputStream("D:\\�ҵ��ഺ������.txt");
			//data:read()���ص��Ǳ��ζ�ȡ���������е���Ч�ֽ��� 
			int data = 0;//��Ч���ַ���,�������ն�ȡ�������ݡ�
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
		//�ȶ����ļ�
		FileInputStream fis = new FileInputStream("D:\\�ҵ��ഺ������.txt");
		//Ȼ��д����һ���ļ���
		FileOutputStream fos = new FileOutputStream("D:\\Hello.txt",true);
		//������רվ���飬���ÿ�ζ�ȡ����
		byte wors[] = new byte[1024];
		while (fis.read()!=-1) {
			fis.read(wors);
			fos.write(wors, 0, wors.length);
			
		}
		fos.close();
		fis.close();
		System.out.println("��ֵ�ɹ�");
	}

}
