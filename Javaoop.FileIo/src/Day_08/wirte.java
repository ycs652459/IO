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

		// �ڶ���д��

		FileWriter writer = new FileWriter("D:\\Hello.txt", true);
		writer.write("����й�");
		writer.close();
		System.out.println("ok");
		// ����
		FileReader writer1 = new FileReader("D:\\Hello.txt");
		//����һ��������
		char ch[] = new char[1024];
		int data = 0;//��Ч���ַ���
		StringBuffer sut = new StringBuffer();//����׷���ַ�
		
		while ((data = writer1.read(ch))!=-1) {
			String temp = new String(ch,0,data);
			sut.append(temp);
			System.out.println("��Ч���ֽ���"+data);
			
		}
		System.out.println(sut.toString());
		writer1.close();
	}

}
