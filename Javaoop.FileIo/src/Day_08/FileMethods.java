package Day_08;

import java.io.*;
import java.util.Scanner;

public class FileMethods {

	public static void main(String[] args) {

		File file = new File("D:\\File.txt");
		//�ж��Ƿ��ļ�������Ŀ¼
		if (file.exists()) {
			//�ж��Ƿ����ļ�
			if (file.isFile()) {
				if (file.isDirectory()) {
					System.out.println("���ļ���Ŀ¼�ļ���");
				
				}else {
					System.out.println("��ǰ�ļ�����");
					System.out.println("���ƣ�" + file.getName());
					//�Զ����·��
					System.out.println("���·����" + file.getPath());
					//����·������Ŀ��·���µ�
					System.out.println("����·����" + file.getAbsolutePath());
					System.out.println("�ļ���С��" + file.length());
				}
				System.out.println("�밴1���ɾ��������");
				Scanner input = new Scanner(System.in);
				int delete = input.nextInt();
				if (delete == 1) {
					file.delete();
					System.out.println("�ļ�ɾ���ɹ���");
				}
				
			}			
		} else {
			System.out.println("��ǰ�ļ�������");
			boolean bool = false;
			try {
				//ֻ�������ļ����������ļ���
				bool = file.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			if (bool) {
				System.out.println("�����ɹ�");
			}
		}
		// ���ļ�������

	}

}
